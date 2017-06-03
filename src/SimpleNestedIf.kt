/**
 * Created by ederpadilla on 02/06/17.
 */
fun main (args : Array<String>){
    println("Ingresa tu edad ")
    var grade : Double = readLine()!!.toDouble()

    if (grade<20){
        println("Tienes menos de 20")
        if (grade<10){
            println("En serio estas muy chico ")
        }
    }else{
        println("Tienes mas de 20 que viejo estas")
        if (grade ==30.toDouble()){
            println("Señoooooooron")
        }
    }

}