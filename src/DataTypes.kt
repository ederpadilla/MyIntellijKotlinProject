/**
 * Created by ederpadilla on 31/05/17.
 */
fun main(arg : Array<String>){
/*Variables**/
    var x = 10
    var y = 12
    var age = 28
    var agetwo : Int = 28
    var dep : String? //tal vez la variable tenga valor o tal vez no tenga valor
    dep = "Variable string no nula"
    var pi : Float = 3.1416f
    val valSample = "Esta variable solo se le puede dar valor una sola vez "
    //valSample ="" /**Si le intentamos volver a dar valor no nos dejaria compilar*/

    print("${x} es el valor de x ${y} es el valor de y +${age} es el valor de la edad ${agetwo} es el valor de age dos y ${dep} es el valor de dep")
}