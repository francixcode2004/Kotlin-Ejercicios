/*
* Ejercicio 8: Temporizador Multitarea
Crea un programa que ejecute 3 temporizadores en paralelo usando hilos.
*  Uno debe contar cada segundo, otro cada 2 segundos, y el tercero cada 3 segundos.
📌 Objetivo: Manejo de múltiples hilos en ejecución simultánea.
* */
class Temporizador(private val nombre: String, private val intervalo: Long) : Thread() {
    override fun run() {
        try {
            for (i in 1..20) {
                println("$nombre -> $i")
                sleep(intervalo)
            }
        } catch (e: InterruptedException) {
            println("$nombre interrumpido")
        }
    }
}
fun main() {
    val temp1 = Temporizador("Temporizador 1", 1000)
    val temp2 = Temporizador("Temporizador 2", 2000)
    val temp3 = Temporizador("Temporizador 3", 3000)
    temp1.start()
    temp2.start()
    temp3.start()
}