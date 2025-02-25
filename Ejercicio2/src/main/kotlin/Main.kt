/*
* Ejercicio 2: Interfaz de Pago
Descripción
Crea una interfaz Pago con un método procesarPago(monto: Double).

Implementa dos clases PagoTarjeta y PagoEfectivo que implementen Pago.
PagoTarjeta debe recibir el número de tarjeta y validar que tenga 16 dígitos.
PagoEfectivo simplemente muestra el mensaje "Pago recibido en efectivo".
* */
interface Pago{
    fun procesarPago(monto:Double)
}
class PagoTarjeta(val numeroTarjeta:String):Pago{
    override fun procesarPago(monto: Double) {
        if(numeroTarjeta.isEmpty() || numeroTarjeta.isBlank()){
            println("Ingrese el numero de la tarjeta")
            return
        }
        if (numeroTarjeta.length != 16) {
            println("Error: Número de tarjeta inválido. Debe contener 16 dígitos.")
            return
        }
        println("Pago de $$monto realizado con tarjeta terminada en ${numeroTarjeta.takeLast(4)}.")
    }
}
class PagoEfectivo():Pago{
    override fun procesarPago(monto: Double) {
        println("Pago de $$monto recibido en efectivo.")
    }
}
fun main() {
    val pagoTarjeta:PagoTarjeta=PagoTarjeta("1234567812345678")
    pagoTarjeta.procesarPago(100.0)
    val pagoTarjeta1:PagoTarjeta=PagoTarjeta("")
    pagoTarjeta1.procesarPago(100.0)

    val pago2: Pago = PagoEfectivo()
    pago2.procesarPago(50.0)

}