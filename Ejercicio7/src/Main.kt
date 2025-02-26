import kotlin.random.Random

/*
* Ejercicio 3: Cajero Automático con Hilos
* Implementa un sistema de retiro de dinero usando hilos.
* Un saldo inicial es compartido entre 3 hilos que intentan retirar dinero.
* Si el saldo es insuficiente, deben esperar hasta que haya suficiente dinero.
📌 Objetivo: Sincronización de hilos y evitar condiciones de carrera.
* */

class Cajero(private val nombreCliente: String, private var montoRetiro: Double) : Thread() {
    companion object {
        @Volatile
        var saldoInicial: Double = 400.0 // Saldo inicial compartido
        val lock = Object() // Objeto para sincronización
    }

    override fun run() {
        synchronized(lock) { // Bloque sincronizado para evitar condiciones de carrera
            while (montoRetiro > saldoInicial) { // Espera hasta que haya suficiente saldo
                println("$nombreCliente intenta retirar $montoRetiro, pero el saldo es insuficiente. Esperando...")
                lock.wait() // El hilo espera hasta que se notifique
            }

            // Realizar el retiro
            saldoInicial -= montoRetiro
            println("$nombreCliente ha retirado $montoRetiro. Saldo restante: $saldoInicial")

            lock.notifyAll() // Notifica a todos los hilos en espera
        }
    }
}

fun main() {
    // Crear 3 hilos que intentan retirar dinero
    val clientes = listOf(
        Cajero("Cliente 1", 100.0),
        Cajero("Cliente 2", 50.0),
        Cajero("Cliente 3", 80.0)
    )
    // Iniciar los hilos
    clientes.forEach { it.start() }
    // Esperar a que todos los hilos terminen
    clientes.forEach { it.join() }
    println("Todos los retiros han sido procesados. Saldo final: ${Cajero.saldoInicial}")
}