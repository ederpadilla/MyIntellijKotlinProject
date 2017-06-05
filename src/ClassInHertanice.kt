/**
 * Created by ederpadilla on 04/06/17.
 */
open class Operations(){   //esta clase se declara con open que es como declarar final ya con eso puedes heredar

    var processName : String? = null  // no tenemos que declarar que es publica

    protected  var protec : String ? = null // no se puede acceder a esta variable

    private var varPrivate :  String ? = null // estas variables no se pueden verni obtener

    fun sum (n1 : Int, n2 : Int ,n3 : Int) : Int{
        return n1+n2+n3
    }
    fun div (n1 : Int , n2 : Int) : Int{
        return n1/ n2
    }

}

class MultiOperations() : Operations() {


    fun sub (n1 : Int , n2 : Int) : Int{
        return n1- n2
    }

    fun multi (n1 : Int , n2 : Int) : Int{
        return n1 * n2
    }

    fun GetName(){
         super.processName
    }
}
fun main (args : Array<String>){
    var op = Operations()
    var sum  = op.sum(1,2,4)
    println("La suma que se tiene es $sum")
    var div = op.div(4,2)
    println("La division que se muestra es $div")
    println("La variable publica es ${op.processName}")
    // segunda clase
    var operations = MultiOperations()
    sum  = operations.sum(1,2,4)//Este metodo se hereda de la clase padre
    println("La suma con la segunda clase tiene es $sum")
    div = operations.div(4,2)//Este metodo se hereda de la clase padre
    println("La division con la segunda clase  es $div")

}