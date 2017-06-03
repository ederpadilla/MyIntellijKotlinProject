/**
 * Created by ederpadilla on 02/06/17.
 */
fun main (args : Array<String>){
    var arrayInit = Array<Int>(5){0}
    println("Array "+arrayInit[3])
    arrayInit[3] = 55
    println("Se imprime "+arrayInit[3])
    println("todos los elementos por objeto")
    for (element in arrayInit){
        println("Los objetos $element")
    }
    println("Por indice")
    for (index in 0..4){
        println(arrayInit[index])
    }
    var arrayStr = Array<String>(4){""}
    for (index in 0..3){
        print("Ingresa el elemento $index")
        arrayStr[index]= readLine()!!
    }
    for(index in 0..3){
        println("arrayStr[ $index ]="+arrayStr[index])
    }
}