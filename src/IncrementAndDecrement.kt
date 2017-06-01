/**
 * Created by ederpadilla on 01/06/17.
 */
fun main (args : Array<String>){
    var x = 10
    var y = 11
    var z = ++x+y //++x= (x = x+1) igual si fuera --x

    print("La suma es ${z} y aqui el valor de x es $x")

    var m = x+++y;// esto es valido como una suma
    print("\nEl valor de x que se sumara es $x y la suma es $m")


}