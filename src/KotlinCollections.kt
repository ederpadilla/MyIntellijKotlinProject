/**
 * Created by ederpadilla on 02/06/17.
 */
fun main (args : Array<String>){
    var map = hashMapOf(1 to "houssein",2 to "Mundo")
    map.put(3,"elemento tres")
    println("con el get sale ${map.get(3)}")
    println("con el map y [] ${map[3]}")

    var ar = arrayOf(1,10,22,11)
    println("obteniendo el ar{0} ${ar[0]}")
    var list = listOf(11,22,33,55)//este tipo de listas no pueden cambiar el valor de ninguno de sus valores
    //si la declaras como mutable
    var listMutable = mutableListOf(11,22,33,44)
    listMutable[0]=22 //en estas listas si puedes cambiar el valor de algun elemento de la lista mutable
    for (item in list){
        println("el item ${item}")
    }
}