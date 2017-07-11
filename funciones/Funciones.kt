/**
 * Created by root on 09/07/17.
 */
fun main(arg: Array<String>){
    println("Funciones")
    println(sumar(6,6))
    println(restar(6,3))
    println(MayorDeEdad(17))
    println(MayorDeEdad(18))
}

fun sumar(a: Int, b: Int) = a + b
fun restar(a: Int, b: Int) = a - b

fun MayorDeEdad(edad: Int) = if (edad>=18) true else false