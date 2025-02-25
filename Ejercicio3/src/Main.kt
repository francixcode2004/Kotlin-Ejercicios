/*
* Ejercicio 3: Lista de Estudiantes
Descripción
Crea una clase Estudiante con atributos nombre, edad y promedio.
Usa una lista mutable para almacenar varios estudiantes.
Implementa funciones para:
Agregar un estudiante a la lista.
Mostrar la lista de estudiantes con sus datos.
Filtrar estudiantes con promedio mayor a 8.0.
* */
data class Estudiante(val nombre: String, val edad: Int, val promedio: Double)


fun main() {
    /*
    * 1.- Lista mutable de estudiantes
    * */
    val estudiantes = mutableListOf(
        Estudiante("Francisco", 18, 7.0),
        Estudiante("Julia", 17, 8.0),
        Estudiante("Homero", 16, 3.0),
        Estudiante("Bart", 17, 5.0),
        Estudiante("Liza", 18, 9.0),
        Estudiante("Jose", 15, 10.0)
    )
    /*
    * 2.- Agregar un estudiante a la lista.
    * */
    agregarEstudiante(estudiantes, "Mateo", 16, 5.0)
    /*
    * 3.- Mostrar la lista de estudiantes con sus datos.
    * */
    println("\nLista de Estudiantes:")
    mostrarEstudiantes(estudiantes)
    /*
    * Filtrar estudiantes con promedio mayor a 8.0.
    * */
    println("\nEstudiantes con promedio mayor a 8.0:")
    promedioMayor(estudiantes)

}
fun agregarEstudiante( listaEstudiantes:MutableList<Estudiante> , nombre:String,edad: Int,promedio: Double) {
    listaEstudiantes.add(
        Estudiante(nombre,edad,promedio)
    )
    println("Estudiante $nombre, ingresado correctamene")
}
fun mostrarEstudiantes(listaEstudiantes: MutableList<Estudiante>){
    var cont=0
    for (i in listaEstudiantes){
        cont++
        println("$cont.- ${i.nombre} - ${i.edad} - ${i.promedio}")
    }
}
fun promedioMayor(listaEstudiantes: MutableList<Estudiante>){
    var listaNueva=listaEstudiantes.filter { it.promedio > 8 }
    for (value in listaNueva){
        println("${value.nombre} - ${value.edad} - ${value.promedio}")
    }
}