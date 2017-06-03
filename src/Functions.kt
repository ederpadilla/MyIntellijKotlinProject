/**
 * Created by ederpadilla on 03/06/17.
 */
fun main (args : Array<String>){
    noInput()
    var r = sum(1.toDouble(),3.toDouble())
    println("la suma es ${r}")

    r = sum(15.toDouble(),15.toDouble())
    println("la suma es ${r}")

    r = sum(20.toDouble(),13.toDouble())
    println("la suma es ${r}")

    display(2)
    displayWithUnit(2)

}
fun sum(n1: Double, n2 : Double) : Double{ //este es el tipo de funciones que reciben dos
                                            // parametros y regresan una variable de tipo double
    var sum = n1+n2
    return sum
}

fun display(n1:Int){
    println("Esto solo debe de imprimir $n1")
}

fun displayWithUnit(n1:Int): Unit{  //metodo que no espera que regrese nada
    println("Este unit solo debe de imprimir $n1")
}

fun noInput(){
    println("En esta funcion no se recibe ninguna entrada ")
}