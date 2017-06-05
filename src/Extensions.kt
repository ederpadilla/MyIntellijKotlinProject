/**
 * Created by ederpadilla on 04/06/17.
 */

fun ArrayList<String>.swap(index1 : Int,index2 : Int){
    var temp=this.get(index1)
    this.set(index1,this.get(index2))
}
fun main (args : Array<String>){
    var array = ArrayList<String>()
    array.add("Elemento 1")
    array.add("Elemento 2")
    array.add("Elemento 3")
    array.add("Elemento 4")
    array.add("Elemento 5")
    array.swap(3,4) //cambiamos el elemento por otro
    println(array)
}
