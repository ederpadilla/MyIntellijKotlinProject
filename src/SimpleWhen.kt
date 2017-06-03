/**
 * Created by ederpadilla on 02/06/17.
 */
fun main (args : Array<String>){
    println("Ingresa un numero")
    var x = readLine()!!.toInt()
    when (x){
        1,2-> print("valor es 1 o 2")
        in 10..30-> print("valor entre el rango de 10 a 30")
        3-> print("valor es 3")
        !in 10..30 -> {
            print("No entra en el rango de 10 ni de 30")
        }
        else -> {
            print("No se ha reconozido entre los casos")
        }
    }
}