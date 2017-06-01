/**
 * Created by ederpadilla on 31/05/17.
 */
fun main(args : Array<String>){
    var n1 : Int = 10
    var n2 : Int?
    var n2String : String = "12"
    //n2String = n1 no podria ser por el tipo de variables diferentes que son no deja compilar
    var n2Float : Float ?
    n2 = n2String.toInt()
    n2Float = n2.toFloat()
    print("El valor de n1 es ${n1}\n y el valor de n2 es ${n2String}\n y el casteo de n2 a float es ${n2Float}")

}
