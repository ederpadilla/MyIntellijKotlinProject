/**
 * Created by ederpadilla on 04/06/17.
 */
open class Overriding(){   //esta clase se declara con open que es como declarar final ya con eso puedes heredar

    var processName : String? = null  // no tenemos que declarar que es publica

    protected  var protec : String ? = null // no se puede acceder a esta variable

    private var varPrivate :  String ? = null // estas variables no se pueden verni obtener

    open fun sum (n1 : Int, n2 : Int ,n3 : Int) : Int{ // significa que la puedes sobreescribir
        return n1+n2+n3
    }
    fun div (n1 : Int , n2 : Int) : Int{
        return n1/ n2
    }

}

class TestForOverRidig() : Overriding() {
    override fun sum (n1 : Int, n2 : Int ,n3 : Int) : Int{ // sobreescribimos asi es que si llamamos este metodo
        return n1+n2+n3*3
    }

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
fun main (args : Array<String>) {
    var op1 = Overriding()
    var sum = op1.sum(1, 2, 4)
    println("La suma que se tiene es $sum")
    var div = op1.div(4, 2)
    println("La division que se muestra es $div")
    println("La variable publica es ${op1.processName}")
    // segunda clase
    var operations2 = TestForOverRidig() as Overriding // este es un casteo
    sum = operations2.sum(1, 2, 4)//Este metodo se hereda de la clase padre
    println("La suma con la segunda clase tiene es $sum")
    div = operations2.div(4, 2)//Este metodo se hereda de la clase padre
    println("La division con la segunda clase  es $div")
    //operations2. como lo casteamos ya solo podemos ver los metodos de la calse padre
}