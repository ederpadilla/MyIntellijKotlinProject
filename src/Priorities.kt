/**
 * Created by ederpadilla on 01/06/17.
 */


/**
 Las prioridades en operaciones son de la siguiente manera
 1.-() todo lo que este adentro del parentesis
 2.^ exponencial
 3.- *, / division
 4.- +,-
 5.- =*/
fun main (args : Array<String>){
    var n1 : Int = 10
    var n2 : Int = 20
    var n3 : Int = 4
    var sum : Int ?
    sum = n1+n2*n3-3
    print("El valor de la suma es $sum")
}
