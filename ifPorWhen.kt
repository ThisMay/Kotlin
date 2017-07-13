/**
 * Created by root on 13/07/17.
 */
//1x6 3x3 2+1 4+4

interface Operacion

class Num(val valor:Int) : Operacion
class Sum(val valorA:Operacion, val valorB:Operacion) : Operacion
class Mult(val valorA:Operacion, val valorB:Operacion) : Operacion

fun evaluarOperacion(operacion: Operacion):Int = when(operacion){
         is Num -> operacion.valor
         is Sum -> evaluarOperacion(operacion.valorA) + evaluarOperacion(operacion.valorB)
         is Mult-> evaluarOperacion(operacion.valorA) * evaluarOperacion(operacion.valorB)
         else ->
             throw IllegalArgumentException("No se puede reconocer la expresión")
    }

fun main(args: Array<String>){
    println (evaluarOperacion(Sum(Sum(Mult(Mult(Num(3),Num(4)), Num(2)),Num(2)),Num(4))))
    println(evaluarOperacion(Mult(Num(3),Num(3))))
    println(evaluarOperacion(Sum(Num(5),Num(5))))
}