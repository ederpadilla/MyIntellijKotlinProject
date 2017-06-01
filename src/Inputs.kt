/**
 * Created by ederpadilla on 31/05/17.
 */
fun main(arg : Array<String>){
/*Variables**/
    print("Ingresa un nombre")
    var x = readLine()// this its an input
    var y = 12
    var age = 28
    print("Ingresa una edad")
    var agetwo : Int = readLine()!!.toInt()//estamos esperando un input null y lo convierte a int por que espera un int
    var dep : String? //tal vez la variable tenga valor o tal vez no tenga valor
    dep = "Variable string no nula"
    print("Enter pi")
    var pi : Double = readLine()!!.toDouble()// lo mismo lo casteamos a double
    val valSample = "Esta variable solo se le puede dar valor una sola vez "
    //valSample ="" /**Si le intentamos volver a dar valor no nos dejaria compilar*/

    print("${x} es el valor de x \n ${y} es el valor de y \n${age} es el valor de la edad \n" +
            "${agetwo} es el valor de age dos y \n${dep} es el valor de dep" +
            "y la variable de pi es ${pi} \n")
}