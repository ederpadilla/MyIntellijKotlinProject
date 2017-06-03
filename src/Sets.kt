/**
 * Created by ederpadilla on 02/06/17.
 */
fun main (args : Array<String>){
    var setement = setOf(1,2,3,11,123,123,123)//no puedes agregar mas elementos no es mutable
    for (element in setement){
        println(element)
    }
    var setementMutable = mutableSetOf(1,2,3,11,123,123,123)//puedes modificar elementros
    setementMutable.add(123333)
    for (element in setementMutable){
        println(element)
    }
}