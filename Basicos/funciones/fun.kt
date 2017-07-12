package funciones

/**
 * Created by root on 11/07/17.
 */
import la.devcode.kotlin.persona.Persona

fun main(arg: Array<String>){
    val persona = Persona("Roger", 18)
    println(persona.nombre)
    println(persona.edad)
    println(persona.esMayorDeEdad)

    persona.edad = 18
    println(persona.edad)
    println(persona.esMayorDeEdad)
}