/**
 * Created by ederpadilla on 04/06/17.
 */
fun main (args : Array<String>){
    println("Ingresa numero")
    var n2 : Int = readLine()!!.toInt()
    try {
        var div = 100/n2
        println("La division es $div")
    }catch (e : Exception){
        println(e.message)
    }

    println("app is done")
}