// Clase base abstracta Vehiculo
abstract class Vehiculo(val marca: String, val modelo: String, val velocidadMaxima: Int) {
    open fun mostrarInfo(): String {
        return "Marca: $marca, Modelo: $modelo, Velocidad Máxima: $velocidadMaxima km/h"
    }
}
// Clase Moto que hereda de Vehiculo
class Moto(marca: String, modelo: String, velocidadMaxima: Int) : Vehiculo(marca, modelo, velocidadMaxima) {
    override fun mostrarInfo(): String {
        return "Moto -> " + super.mostrarInfo()
    }
}
// Clase Carro que hereda de Vehiculo
class Carro(marca: String, modelo: String, velocidadMaxima: Int) : Vehiculo(marca, modelo, velocidadMaxima) {
    override fun mostrarInfo(): String {
        return "Carro -> " + super.mostrarInfo()
    }
}
// Función principal para probar las clases
fun main() {
    val moto1 = Moto("Suzuki", "F150", 150)
    println(moto1.mostrarInfo())
    val carro = Carro("Toyota", "Hilux", 170)
    println(carro.mostrarInfo())
}