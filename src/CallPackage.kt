//import sample.main.MyCar solo importamos una clase que es la MyCar
import sample.main.* //Con ese asterisco importamos todas las clases de ese paquete

/**
 * Created by ederpadilla on 04/06/17.
 */

fun main (args : Array<String>){
    var packageSample = MyCar()
    packageSample.showInfo()

}