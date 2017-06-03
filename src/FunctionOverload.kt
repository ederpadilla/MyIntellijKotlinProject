/**
 * Created by ederpadilla on 03/06/17.
 */
fun main (args : Array<String>){

    var sumTwo = sumNumber(1,2)
    println("Los dos $sumTwo")


    var sumThree = sumNumber(1,2,3)
    println("Los dos $sumThree")


    var sumFour = sumNumber(1,2,3,4)
    println("Los dos $sumFour")


    var sumFive = sumNumber(1,2,4,5)
    println("Los dos $sumFive")
}

fun sumNumber (n1:Int,n2:Int):Int{
    return n1+n2
}

fun sumNumber (n1:Int,n2:Int,n3:Int):Int{
    return n1+n2+n3
}
fun sumNumber (n1:Int,n2:Int,n3:Int,n4:Int):Int{
    return n1+n2+n3
}
fun sumNumber (n1:Int,n2:Int,n3:Int,n4:Int,n5:Int):Int{
    return n1+n2+n3+n4+n5
}