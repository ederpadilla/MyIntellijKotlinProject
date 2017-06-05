/**
 * Created by ederpadilla on 04/06/17.
 */
class UserAdmins<T,F>(credit : T,id : F){
    init {
        println("credit $credit y su id $id")
    }
}
fun <T> displayProcess(process : T){
    println(process)
}
fun main (args : Array<String>){
 var userAdmin = UserAdmins<String,Int>("Eder",1) //Aqui definimos lo que le vamos a pasar
 var userAdmin2 = UserAdmins<Int,String>(2,"Hola generic")
 var userAdmin3 = UserAdmins<Double,Int>(3.0,12)
    displayProcess<String>("Que es esto???")
    displayProcess<Int>(12)
}