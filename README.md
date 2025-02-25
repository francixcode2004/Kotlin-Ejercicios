# Kotlin Ejercicios

Este repositorio está diseñado para aquellos que ya tienen conocimientos básicos de programación y desean mejorar sus habilidades en Kotlin. Aquí encontrarás una serie de ejercicios que cubren temas fundamentales como clases, herencia, interfaces, listas y más.

Cada carpeta dentro del repositorio contiene un ejercicio con su respectivo archivo `README.md` explicando el objetivo y el código del ejercicio.

## Ejercicios

### **Ejercicio 1: Sistema de Vehículos (Herencia y Clases)**

Crea una jerarquía de clases para representar vehículos. La clase base `Vehiculo` tiene propiedades como `marca`, `modelo` y `velocidadMaxima`. Luego, las clases hijas `Coche` y `Moto` heredan de `Vehiculo` y sobrescriben el método `mostrarInfo()`.

#### Ejemplo de uso:
```kotlin
fun main() {
    val coche = Coche("Toyota", "Corolla", 200, 4)
    val moto = Moto("Yamaha", "R3", 180, true)

    coche.mostrarInfo()
    moto.mostrarInfo()
}
```

### **Ejercicio 2: Interfaz de Pago**

Crea una interfaz `Pago` con un método `procesarPago(monto: Double)`. Implementa dos clases que representen métodos de pago: `PagoTarjeta` y `PagoEfectivo`. La primera valida el número de tarjeta, mientras que la segunda muestra un mensaje de pago recibido en efectivo.

#### Ejemplo de uso:
```kotlin
fun main() {
    val pago1: Pago = PagoTarjeta("1234567812345678")
    pago1.procesarPago(100.0)

    val pago2: Pago = PagoEfectivo()
    pago2.procesarPago(50.0)
}
```

### **Ejercicio 3: Lista de Estudiantes**

Crea una clase `Estudiante` con atributos `nombre`, `edad` y `promedio`. Usa una lista mutable para almacenar varios estudiantes y proporciona funciones para agregar un estudiante, mostrar la lista de estudiantes y filtrar estudiantes con un promedio mayor a 8.0.

#### Ejemplo de uso:
```kotlin
fun main() {
    val estudiantes = mutableListOf<Estudiante>()

    estudiantes.add(Estudiante("Ana", 20, 9.0))
    estudiantes.add(Estudiante("Luis", 22, 7.5))
    estudiantes.add(Estudiante("Carlos", 21, 8.5))

    println("Lista de estudiantes:")
    estudiantes.forEach { println(it) }

    val destacados = estudiantes.filter { it.promedio > 8.0 }
    println("\nEstudiantes con promedio mayor a 8.0:")
    destacados.forEach { println(it) }
}
```

### **Ejercicio 4: Tienda de Productos (Herencia, Interfaces y Listas)**

Crea una clase base `Producto` con atributos `nombre`, `precio` y un método `detalle()`. Implementa dos clases hijas `Electronico` y `Ropa`, y usa una lista de productos para calcular el total de la compra.

#### Ejemplo de uso:
```kotlin
fun main() {
    val productos = mutableListOf<Producto>(
        Electronico("Laptop", 1200.0, "HP"),
        Ropa("Camiseta", 25.0, "M")
    )

    productos.forEach { it.detalle() }

    val total = productos.sumOf { it.precio }
    println("Total de la compra: $total")
}
```

## Estructura del Proyecto

- **Ejercicio1**: Sistema de Vehículos (Herencia y Clases)
- **Ejercicio2**: Interfaz de Pago
- **Ejercicio3**: Lista de Estudiantes
- **Ejercicio4**: Tienda de Productos (Herencia, Interfaces y Listas)
- **HolaMundo**: Primer programa en Kotlin

## Requisitos

Para ejecutar los ejercicios de este repositorio, asegúrate de tener instalados los siguientes componentes:

- **Kotlin Compiler**: Para compilar y ejecutar programas en Kotlin.
- **IntelliJ IDEA** o cualquier otro IDE compatible con Kotlin.

## Instrucciones de Uso

1. Clona el repositorio:
   ```bash
   git clone https://github.com/francixcode2004/Kotlin-Ejercicios.git
   ```

2. Abre el proyecto en tu IDE favorito.

3. Navega por las carpetas de los ejercicios y ejecuta los ejemplos proporcionados.

## Contribución

Si deseas contribuir con más ejercicios o mejoras en el código, siéntete libre de hacer un **fork** de este repositorio y enviar un **pull request** con tus cambios.

---

**Autor:** [francixcode2004](https://github.com/francixcode2004)
```

Este `README.md` está organizado de manera que resalte el propósito de cada ejercicio, proporcionando ejemplos y una estructura clara, ideal para usuarios con conocimientos previos en programación. ¡Espero que te sirva!
