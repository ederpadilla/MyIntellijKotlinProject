/**
 * Created by ederpadilla on 04/06/17.
 */

enum class Direction{
    NORTH,SOUTH,EAST,WEST

}

enum class WEBPETITION(val url : String){
    GET_POKEMON("http://pokeapi.co/api/v2/")
}

fun main(args : Array<String>){

    var userDirection = Direction.SOUTH

    if (userDirection==Direction.NORTH){
        println("Se fue al norte")
    }else{
        println("No se fue al norte")
    }

    var url = WEBPETITION.GET_POKEMON
    println(url.url)
}