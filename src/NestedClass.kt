/**
 * Created by ederpadilla on 04/06/17.
 */
class Outer(){
    private val name : String? = null

     class Nested{
        fun show(){
            println("nested")
           // println(name) no podriamos mandar a llamr la variable name si quisieramos usarla aqui se tendria que
           // invocar inner class
        }
    }
}
fun main (args : Array<String>){
    var outer = Outer()
    var nested = Outer.Nested()
    nested.show()

}