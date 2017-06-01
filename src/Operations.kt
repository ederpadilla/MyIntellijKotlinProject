/**
 * Created by ederpadilla on 01/06/17.
 */
fun main (args : Array<String>){


    print("Ingrese el primr numero ")
    var n1 : Float = readLine()!!.toFloat()
    print("Ingrese el segundo numero")
    var n2 : Float = readLine()!!.toFloat()
    var sum : Float?
    sum = n1+n2
    var multiplicacion : Float?
    multiplicacion = n1*n2
    print("El valor de la suma es ${sum} y la multiplicacion es ${multiplicacion}")
}