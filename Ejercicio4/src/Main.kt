/*
* Ejercicio 4: Tienda de Productos (Herencia, Interfaces y Listas)
Descripción
Crea una clase base Producto con nombre, precio y un método detalle().
Implementa dos clases hijas Electronico y Ropa.
Usa una lista de productos para agregar diferentes objetos.
Implementa una función que calcule el total de la compra.
* */
abstract class Producto(val nombre:String,val precio:Double){
    open fun detalle() :String{
        return "Detalle del producto $nombre precio $precio"
    }
}
class Electronico(nombre: String, precio: Double):Producto(nombre, precio){
    override fun detalle() :String{
        return "Electronico -> "+super.detalle()
    }
}
class Ropa(nombre: String, precio: Double):Producto(nombre, precio){
    override fun detalle():String {
        return "Ropa -> "+super.detalle()
    }
}
fun main() {
    //val ropa=Ropa("camisa",23.90)
    val listaProductos= mutableListOf<Producto>(
        Electronico("cocina",234.234),
        Ropa("Jean",34.456),
    )
    println("\n📦 Productos en la compra:")
    listaProductos.forEach { println(it.detalle()) }
    // Mostrar total de la compra
    println("\n💰 ${totalCompra(listaProductos)}")
}
fun totalCompra(listaProductos: MutableList<Producto>):String{
    val total= listaProductos.sumOf { it.precio }
    return "El total de la compra es: ${"%.2f".format(total)}"
}