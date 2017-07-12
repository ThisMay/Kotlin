/**
 * Created by root on 11/07/17.
 */
package la.devcode.kotlin.persona

class Persona(val nombre: String, var edad: Int){
    val esMayorDeEdad: Boolean
    get() = if (edad >= 18) true else false
}
/*
comentario
fun crearPersona(nombre:String):Persona=Persona(nombre, 1 + Random().nextInt(85))
        */