/**
 * Created by ederpadilla on 04/06/17.
 */
class SimpleClassConstructor(){ //El hecho de que no reciba nada se puede definir como un construcor

    var owner : String ? = null

    var price : Double ? = null

    var miles : Int ? = null

    var model : String ? = null
    constructor(type : String , model : Int , price : Double , milesDrive : Int, owner : String) : this() {
        println("type $type")
        println("model $model")
        println("price $price")
        println("miles drive $milesDrive")
        println("owner $owner")
        this.owner = owner
        this.price = price
        this.miles = milesDrive
    }

    //constructor(mode l) : this {   Este constructor no seria posible ya que se estaria repitiendo
    //}
    constructor(model : String) : this(){
        this.model=model
        println("El modelo es $model")
    }
    fun GetOwner(): String ? {
        return this.owner
    }

    fun GetPrice() : Double ? {
        return this.price!! - (this.miles!!.toDouble()*10)
    }

}

fun main (args : Array<String>){
var simpleConsWithNoParameters = SimpleClassConstructor("Modelo chido")
}