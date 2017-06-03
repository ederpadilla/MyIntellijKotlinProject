/**
 * Created by ederpadilla on 02/06/17.
 */
fun main (args : Array<String>){
    var count = 1
    do {
        println("Entra al loop")
        if (count==2){
            println("coutn: $count")
        }
        count++
    }while (count<=5)
    print("Se acaba el looop")
}