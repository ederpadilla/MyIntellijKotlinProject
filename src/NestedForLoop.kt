/**
 * Created by ederpadilla on 02/06/17.
 */
fun main (args : Array<String>){
    for(count1 in 1..5){
        println("count1: $count1")
        for (count2  in 1..7){
            println("El valor de count2 : $count2")
        }
        print("Se acabo el nested looop")
    }
    println("Se acabo el loop")


}