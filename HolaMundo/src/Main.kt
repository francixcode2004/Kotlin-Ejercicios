fun main() {
    /*Hola mundo*/
    println("Hola, mundo")
    /*
    * vraibles con var
    * */
    var myString="mystring"
    println("Hola, $myString")
    var myNumber=10
    println("Mi numero es, $myNumber")
    var myBoolean= true
    println("Mi boleano es, $myBoolean")
    var myDouble= 3.14
    println("Mi double es, $myDouble")
    var myFloat= 2.15f
    println("Mi double es, $myFloat")
    /*
    * variables tipadas
    * */
    var myString1:String="mystring1"
    println("Mi string, $myString1")

    var myInt1:Int=10
    println("Mi int, $myInt1")

    var myFloat1= 2.15f
    println("Mi float es, $myFloat1")
    /*
    * variables inmutables
    * constantes
    * */
    val myVal="myval"
    println("Mi val es, $myVal")
    var myValCon =  readlnOrNull().toString()
    println("Mi myValCon, $myValCon")
    /*
    * error
    *myVal="zd"
    * */

    /*
    * if else
    * */
    if(myNumber==10){
        println("es igual")
    }else{
        println("no es igual")
    }
    /*
    * operadores logicos
    * && (y)
    * || (o)
    * */
    if(myNumber==10 && myBoolean==true){
        println("es igual")
    }else if (myNumber==11 || myBoolean==false){
        println("no es igual")
    }

    /*
    * lista inmutable
    * */
    var myList= listOf<String>("francisco","alex","maria")
    println(myList.get(0))

    /*
    * lista mutables
    * */
    var mylistmut= mutableListOf<String>("hola","como","estas")
    println(mylistmut)
    mylistmut.add("muy bien")
    println(mylistmut)
    /*
    * sets
    * */
    var mySets= setOf(1,2,4,5)
    println(mySets)

    /*
    * maps
    * */

    var myMaps= mutableMapOf("nombre" to "francisco","apellido" to "lopez")
    println(myMaps["nombre"])

    /*
    * bucle for
    * */

    for (value in myList){
        println(value)
    }
    for (value in mySets){
        println(value)
    }
    for (value in myMaps){
        println(value.value)
    }
    /*
     * bucle while
     * */
    var contador=0
    while (contador < myList.count()){
        println(myList.get(contador))
        contador++
    }
    //opcionales
    var myOptional:String?=null
    println(myOptional)
    myOptional="mi opcional"
    println(myOptional)
    /*
    * uso de funcion
    * */
    myFunction()
    /*
    * uso de clases
    * */
    var myClass:MyClass=MyClass("francisco",23)
    println(myClass.salutary())


}
/*
* funciones
* */
fun myFunction(){
    println("mi funcion")
}
/*
* clases
* */
class MyClass(val name:String,val age:Int):MyInterface{

    override fun salutary(): String {
        return "Hola $name"
    }
}