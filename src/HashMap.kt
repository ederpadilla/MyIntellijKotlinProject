/**
 * Created by ederpadilla on 02/06/17.
 */
fun main (args : Array<String>){
var map = HashMap<Int,String>()
    map.put(1,"elemento uno")
    map.put(2,"Elemento dos")
    map.put(3,"elemento tres")
    map.put(4,"Elemento cuatro")
    map.put(5,"elemento cinco")
    map.put(6,"Elemento seis")
    //println(map.get(3))
    for (key in map.keys){
        println(map.get(key))
    }
}