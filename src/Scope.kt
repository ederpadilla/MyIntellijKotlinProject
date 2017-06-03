/**
 * Created by ederpadilla on 03/06/17.
 */
var fullName = "Juan EL Loco Martinez"
fun main (args : Array<String>){
    var name = "Hussein" //variable local de este metodo solo se usa en este metodo
    print("name : $name")
}
    fun display(){
        //print("name : $name") <- name no esta delcarado aqui
        println(fullName)
    }