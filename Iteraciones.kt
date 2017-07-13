/**
 * Created by root on 13/07/17.
 */

fun main(arg: Array<String>){

    val arreglo = arrayListOf("J","B","C","D","E")

    for ((index, a) in arreglo.withIndex())
        println("$index,$a")
   /* for (a in 2..18){
    println(a+2)
    }

    for (b in 3 until 30)
        println(b)

    for (c in 30 downTo 10 step 2)
        println(c)
    var b = 0
    while (b<3){
        println(b)
        b++
    }
    do {
        println(b)
        b++
    } while (b < 10)*/
}