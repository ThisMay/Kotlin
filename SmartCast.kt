/**
 * Created by root on 12/07/17.
 */
//1x6 3x3 2+1 4+4

interface Expresion

class Numero(val valor:Int) : Expresion
class Sumar(val valorA:Expresion, val valorB:Expresion) : Expresion
class Multiplicar(val valorA:Expresion, val valorB:Expresion) : Expresion

fun evaluarExpresion(expresion: Expresion):Int{
    if(expresion is Numero){
        return expresion.valor
    } else if (expresion is Sumar){
        return evaluarExpresion(expresion.valorA) + evaluarExpresion(expresion.valorB)
    } else if (expresion is Multiplicar){
        return evaluarExpresion(expresion.valorA) * evaluarExpresion(expresion.valorB)
    } else {
        throw IllegalArgumentException("No se puede reconocer la expresión")
    }
}

fun main(args: Array<String>){
    println (evaluarExpresion(Sumar(Sumar(Multiplicar(Multiplicar(Numero(3),Numero(4)), Numero(2)),Numero(2)),Numero(4))))
    println(evaluarExpresion(Multiplicar(Numero(3),Numero(3))))
    println(evaluarExpresion(Sumar(Numero(5),Numero(5))))
}