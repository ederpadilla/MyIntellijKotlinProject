import java.util.*

/**
 * Created by ederpadilla on 01/06/17.
 */
fun main (args : Array<String>){
    //input
    print("Ingresa tu año de nacimiento\n")
    var DOB :Int = readLine()!!.toInt()
    //process input
    var year = Calendar.getInstance().get(Calendar.YEAR)
    var age :Int?
    age= year - DOB
    //output input
    println("Tu edad es $age años")

}