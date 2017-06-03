/**
 * Created by ederpadilla on 02/06/17.
 */
fun main (args : Array<String>){

    println("Ingresa tu edad")
    var grade : Double = readLine()!!.toDouble()

    if (grade<=20){
        println("Tienes menos de 20")
    }else if (grade>20&&grade <=30){
        print("Aun eres joven")
    }else{
        println("Ya estas grande cainal")
    }

}