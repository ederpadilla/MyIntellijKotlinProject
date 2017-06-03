/**
 * Created by ederpadilla on 03/06/17.
 */
fun main(args : Array<String>){
    show("Hola mundo")
    show(2)
    show(false)
}
    fun show(name : String):Unit{
        println("name : $name")
    }
    fun show(number : Int):Unit{
        println("numero : $number")
    }
    fun show(bol : Boolean):Unit{
        println("boolean : $bol")
    }