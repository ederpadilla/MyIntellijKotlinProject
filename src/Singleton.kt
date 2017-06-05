/**
 * Created by ederpadilla on 04/06/17.
 */
class Singleton{
    var name : String? = null
    private constructor(){
        println("instance its creeated")
    }
    companion object{
         val instance : Singleton by lazy{ Singleton() }
    }
}
fun main (args : Array<String>){
    var s1 = Singleton.instance
    s1.name="Eder"
    println(s1.name)

    var s2 = Singleton.instance
    println(s2.name)

    var s3 = Singleton.instance
    println(s3.name)
}