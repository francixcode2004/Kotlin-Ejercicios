Ejercicio 3: Lista de Estudiantes
Descripción
Crea una clase Estudiante con atributos nombre, edad y promedio.
Usa una lista mutable para almacenar varios estudiantes.
Implementa funciones para:
Agregar un estudiante a la lista.
Mostrar la lista de estudiantes con sus datos.
Filtrar estudiantes con promedio mayor a 8.0.

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
