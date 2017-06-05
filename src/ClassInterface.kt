/**
 * Created by ederpadilla on 04/06/17.
 */
interface op { //by default son open
    fun sum(n1 : Int,n2 : Int){println(n1+n2)}
    fun div(n1 : Int,n2 : Int){println(n1/n2)}
}

class TestForInterface() : op {
    override fun sum(n1: Int, n2: Int) {
        println(n1+n2)
    }

    override fun div(n1: Int, n2: Int) {
        println(n1/n2)
    }

}

class TestForInterfaceTwo() : op {
    override fun sum(n1: Int, n2: Int) {
        println(n1+n2+1)
    }

    override fun div(n1: Int, n2: Int) {
        println((n1/n2)+1)
    }

}
class TestForInterfaceThree() : op { // como se declaro lo que hacian las interfaces ya no neceitamos implementar los metodos

}

fun main(args : Array<String>){
    var admin = TestForInterfaceThree()
    admin.sum(2,3)
}