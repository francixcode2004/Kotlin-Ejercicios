import java.io.File
import java.io.IOException
import kotlin.jvm.Throws
@Throws(IOException::class)
fun escribirarchivo(archivo:File, texto:String):Boolean{
    val bandera=true
    val buffer= archivo.bufferedWriter()
    buffer.write(texto)
    buffer.close()
    return bandera
}
@Throws(IOException::class)
private fun leer(fichero: File): String {
    //val bufferedReader = fichero.bufferedReader()
    //val text: List<String> = bufferedReader.readLines()
    val inputString = fichero.bufferedReader ().use {
        it.readText ()
    }
    fichero.bufferedReader().close()
    //return text.toString()
    return inputString
}
fun main() {
    val ruta="test.txt"
    val archivo=File(ruta)
    val texto="hola mundo desde kotlin con archivos"
    try {
        println("Manejo de ficheros")
        if (escribirarchivo(archivo, texto)) {
            println("Fichero $ruta escrito ok")
        }
        println("Archivo leído:\n" + leer(archivo))
    } catch (e: IOException) {
        println ("Error: " + e.message.toString())
    }
}