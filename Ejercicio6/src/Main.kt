import kotlin.random.Random

/*
* Ejercicio 6: Carrera de Hilos
*  Simula una carrera de autos con 4 hilos. Cada hilo representa un
*  auto y debe avanzar una distancia aleatoria entre 1 y 5 en cada
*  iteración hasta llegar a 50.
📌 Objetivo: Manejo de condiciones y sincronización de hilos.
* */
class Carro(private val nombreCarro: String) : Thread() {
    private val random = Random(System.nanoTime())
    private var distancia = 0
    companion object { //Permite que ganador sea una variable compartida por todas las instancias de la clase Carro
        @Volatile //Indica que la variable ganador puede ser modificada por múltiples hilos al mismo tiempo.
        var ganador: String? = null //permite detectar cuando la carrera aún no tiene un ganador.
        @Volatile
        var carreraTerminada = false // Variable compartida para indicar si la carrera ha terminado
        val lock = Object() // Objeto para sincronización
    }
    override fun run() {
        while (distancia < 50 && !carreraTerminada) {
            distancia += random.nextInt(1, 6)
            println("$nombreCarro avanzó a $distancia")
            sleep(500)
            if (distancia >= 50 && ganador == null) {
                synchronized(lock) {
                    if (ganador == null) {
                        ganador = nombreCarro
                        carreraTerminada = true // Indica que la carrera ha terminado
                        println("\n🏆 ¡$nombreCarro ha ganado la carrera!\n")
                    }
                }
                return
            }
        }
    }
}

fun main() {
    val carros = listOf(
        Carro("Ferrari"), Carro("Lamborghini"),
        Carro("Porsche"), Carro("McLaren")
    )
    carros.forEach { it.start() }
}
