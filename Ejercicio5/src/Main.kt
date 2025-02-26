import java.lang.Thread.sleep

/*
* Ejercicio 5: Contador en Hilos
    Crea un programa que ejecute tres
* hilos simultáneamente. Cada hilo debe contar desde 1 hasta 10
* con un retardo de 500ms entre cada número.
📌 Objetivo: Aprender a usar Thread en Kotlin.
* */

class Contador(private val nombre: String) : Thread() {
    override fun run() {
        for (i in 1..10) {
            println("$nombre -> $i")
            sleep(500)
        }
    }
}
class Contador1(private val nombre: String) : Runnable {
    override fun run() {
        for (i in 1..10) {
            println("$nombre -> $i")
            sleep(500)
        }
    }
}
fun main() {
    val contador1 = Contador("Hilo 1")
    val contador2 = Contador("Hilo 2")
    val contador3 = Contador("Hilo 3")
    contador1.start()
    contador2.start()
    contador3.start()
//    val contador1 = Contador1("Hilo 1")
//    val contador2 = Contador1("Hilo 2")
//    val contador3 = Contador1("Hilo 3")
//    contador1.run()
//    contador2.run()
//    contador3.run()
}