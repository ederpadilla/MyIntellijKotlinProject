/**
 * Created by ederpadilla on 31/05/17.
 */


fun main(arg : Array<String>){
    print("this is our first line,\n")
    print("Hello worl of kotlin")

    var user = User()
    user.age=12
    println("User ${user.toString()}")
    User(name = "Foo") // returns User("Foo", 0, null)
    var userTest1 =UserTest(name = "Foo", age = 21) // returns User("Foo", 21, null)
    var userTest2 =UserTest(id = "x") // returns User(null, 0, "x")
    var userTest3 =UserTest("Foo", 21, "x") // returns User("Foo", 21, "x")
    var userTest4 =UserTest(id = "x", name = "Foo", age = 21) // returns User("Foo", 21, "x")
    userTest1.id="13"
    println("el usuario es ${userTest1.toString()}")
}
data class UserTest(var name: String? = null, var age: Int = 0, var id: String? = null)