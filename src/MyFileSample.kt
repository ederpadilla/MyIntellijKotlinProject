import java.io.FileReader
import java.io.FileWriter

/**
 * Created by ederpadilla on 04/06/17.
 */
fun main (args : Array<String>){
    println("1.- Escribir \n2.- Leer")
    val op = readLine()!!.toInt()
    when(op){
        1->{
            println("ingresa lo que quieres escribir")
            var str = readLine()!!.toString()
            writeToFile(str)
        }
        2->readFromFile()
    }
}
fun writeToFile(str : String){
    try {
        val file = FileWriter("test file.txt",true) //si no esta el archivo crealo y sobreescribelo
        file.write("$str \n")
        file.close()
        println("Se salvo la data")
    }catch (exc:Exception){
        print(exc.message)
    }

}

fun readFromFile(){
    try {
        val fin = FileReader("test file.txt")
        var cin: Int ?
        do {
            cin = fin.read()
            print(cin.toChar())
        }while (cin!=-1)
    }catch (e : Exception){
        print(e.message)
    }
}