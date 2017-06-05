/**
 * Created by ederpadilla on 04/06/17.
 */
fun main(args : Array<String>){
    var thread1 = thread("thread1")
    thread1.start()
    var thread2 = thread("thread2")
    thread2.start()
    var thread3 = thread("thread3")
    thread3.start()
    thread3.join()//deten en esta linea no se ejecuta lo siguiente
    println(" thread is runnning ")
}
class thread : Thread{
    var threadName : String? = null

    constructor(threadName : String) : super(){
        this.threadName = threadName
        println("$threadName is started")
    }

    override fun run() {
        var count = 0
        while (count<=10){
            println("$threadName El count $count")
            count++
            try {
                Thread.sleep(500)
            }catch (e : Exception){
                println(e.message)
            }
        }
    }
}