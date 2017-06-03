/**
 * Created by ederpadilla on 02/06/17.
 */
fun main (args : Array<String>){
  // for (count in 1..10){
  //     if (count!=4){
  //         println("No es 4")
  //         continue
  //     }
  //     println("contador +$count")
  // }
 // for (count2 in 1..5){
 //     if (count2==4){
 //         continue// la diferencia entre continue y break
 //                 // consiste en que el break termina con el loop
 //                 // y el continue solo ignora el caso para cuando count = 4

 //     }
 //     println("count $count2")
 // }
    //for (count in 1..10){
    //    for (count2 in 1..5){
    //        println("count $count")
    //        if (count2==2){
    //            break
    //        }
    //    }
    //}
    //println(" loop done")
    loop@for (count in 1..10){  // en este caso asignamos una etiqueta a este loop
        for (count2 in 1..5){
            println("count $count")
            if (count2==2){
                break@loop //y aqui decimos que rompa con el loop externo
            }
        }
    }
    println(" loop done")
}