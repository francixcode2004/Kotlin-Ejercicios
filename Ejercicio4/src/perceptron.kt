import kotlin.random.Random
data class Perceptron(val numEntradas: Int, val tasaAprendizaje: Double, val epocas: Int) {
    private val pesos = DoubleArray(numEntradas + 1) { Random.nextDouble(-1.0, 1.0) }
    private fun activacion(suma: Double) = if (suma >= 0) 1 else 0
    fun entrenar(entradas: Array<DoubleArray>, salidas: IntArray) {
        repeat(epocas) {
            for (i in entradas.indices) {
                val entradaConBias = doubleArrayOf(1.0) + entradas[i]
                val salidaCalculada = predecir(entradaConBias)
                val error = salidas[i] - salidaCalculada
                for (j in pesos.indices) {
                    pesos[j] += tasaAprendizaje * error * entradaConBias[j]
                }
            }
        }
    }
    fun predecir(entrada: DoubleArray): Int {
        val entradaConBias = doubleArrayOf(1.0) + entrada
        val suma = entradaConBias.indices.sumOf { pesos[it] * entradaConBias[it] }
        return activacion(suma)
    }
}

fun main() {
    val entradas = arrayOf(
        doubleArrayOf(0.0, 0.0),
        doubleArrayOf(0.0, 1.0),
        doubleArrayOf(1.0, 0.0),
        doubleArrayOf(1.0, 1.0)
    )
    val salidas = intArrayOf(0, 0, 0, 1)
    val perceptron = Perceptron(numEntradas = 2, tasaAprendizaje = 0.1, epocas = 100)
    perceptron.entrenar(entradas, salidas)
    println("Predicciones:")
    for (entrada in entradas) {
        println("${entrada.toList()} -> ${perceptron.predecir(entrada)}")
    }
}
