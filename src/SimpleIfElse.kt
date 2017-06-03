/**
 * Created by ederpadilla on 02/06/17.
 */
fun main (args : Array<String>){
    println("Ingresa tu edad ")
    var grade : Double = readLine()!!.toDouble()

    if (grade<20){
        println("Tienes menos de 20")
    }else{
        print("Tienes mas de 20 que viejo estas")
    }

}