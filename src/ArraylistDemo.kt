/**
 * Created by ederpadilla on 02/06/17.
 */
fun main (args : Array<String>){
    var arratLit = ArrayList<String>()
    arratLit.add("hola")
    arratLit.add("mundo")
    arratLit.add("como estas")
    println("El primero elemento en el array es ${arratLit.get(0)}")
    println("todos los elementos ${arratLit.toString()}")
    arratLit.set(0,"Ya no es hola ahora es hi ")
    println("Ahora la lista es ${arratLit.toString()}")

    if (arratLit.contains("Ya no es hola ahora es hi ")){
        println("A nu ma si esta")
    }else {
        println("A nu ma no esta")
    }
    for (item in arratLit){
        println(item)
    }
    val size = arratLit.size-1 // es muy importante el menos 1
    for (i in 0..size){
        print(arratLit.get(i))
    }
}