/**
 * Created by ederpadilla on 01/06/17.
 */
fun main (args : Array<String>) {
    print("Enter your grade \n")
    var grade = readLine()!!.toDouble()
    if (grade >= 90) {
        print("Damm you are to old bro!!!")
    } else {
        print("You are to young dude")
    }
    println(" you enter $grade")

    if (grade >= 50 && grade <= 70){
        grade = grade +10
        print("you get +10 extra point ")
    }

}