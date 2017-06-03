/**
 * Created by ederpadilla on 03/06/17.
 */
class SimpleClassSample(type : String , model : Int , price : Double , milesDrive : Int, owner : String){ //Digamos que es un carro
     init {
         println("type $type")
         println("model $model")
         println("price $price")
         println("miles drive $milesDrive")
         println("owner $owner")
     }

}

fun main (args : Array<String>){
    var simpleClassObject = SimpleClassSample("Nuevo",2017,13.0,120,"Eder")
    var simpleClassObjectTwo = SimpleClassSample("Nuevo dos ",20172,14.0,140,"Eder dos")
}