/**
 * Created by ederpadilla on 04/06/17.
 */
abstract class Credit (){ // para usar esta clase hay que heredar de ella
    fun creditId() : String{return "sdfsdfsdf"}
    abstract fun newCredit() // esta no puede tener cuerpo {}
}

class UserInfo() : Credit(){
    fun getInfo() : String{
        return creditId()
    }

    override fun newCredit() {
            println("prueva de override en abtract")
    }
}

fun main (args : Array<String>){
    //var credit = Credit() nadie puede acceder a esta clase
    //println(credit.creditId())

    var user = UserInfo()
    println(user.getInfo())
    println(user.newCredit())
}