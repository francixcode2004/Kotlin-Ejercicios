Ejercicio 4: Tienda de Productos (Herencia, Interfaces y Listas)
Descripción
* Crea una clase base Producto con nombre, precio y un método detalle().
* Implementa dos clases hijas Electronico y Ropa.
* Usa una lista de productos para agregar diferentes objetos.
* Implementa una función que calcule el total de la compra.

fun main() {
val productos = mutableListOf<Producto>(
Electronico("Laptop", 1200.0, "HP"),
Ropa("Camiseta", 25.0, "M")
)

    productos.forEach { it.detalle() }

    val total = productos.sumOf { it.precio }
    println("Total de la compra: $total")
}
