package holamundo

import java.util.*

/**
 * Created by root on 09/07/17.
 */
fun main(arg: Array<String>){
    println("Escribir tu nombre o pulsa (Enter o Entrar) para seguir anónimo:")
    val scanner = Scanner(System.`in`)
    val nextLine = scanner.nextLine()
    val name = if(nextLine != "") nextLine else "Kotlin"

    println("Hola $name!")
}
