/**
 * Created by ederpadilla on 03/06/17.
 */
class SimpleClassSample(type : String , model : Int , price : Double , milesDrive : Int, owner : String){ //Digamos que es un carro

    var owner : String ? = null

    var price : Double ? = null

    var miles : Int ? = null
    init {
        println("type $type")
        println("model $model")
        println("price $price")
        println("miles drive $milesDrive")
        println("owner $owner")
        this.owner = owner
        this.price = price
        this.miles = milesDrive
     }
    fun GetOwner(): String ? {
        return this.owner
    }

    fun GetPrice() : Double ? {
        return this.price!! - (this.miles!!.toDouble()*10)
    }

}

fun main (args : Array<String>){
    var simpleClassObject = SimpleClassSample("Nuevo",2017,13.0,120,"Eder")
    println("price of the first ${simpleClassObject.GetPrice()}")
    var simpleClassObjectTwo = SimpleClassSample("Nuevo dos ",20172,14.0,140,"Eder dos")
    println("Especificas propiedades de el segundo ejemplo ${simpleClassObjectTwo.GetPrice()} y el dueño ${simpleClassObjectTwo.GetOwner()}")
}