package `clases y propiedades`

/**
 * Created by root on 11/07/17.
 */
fun main(arg:Array<String>){
    val libro = Libro("Matematicas", 0)
    println(libro.nombre)
    println(libro.año)
    println(libro.EsMatematica)

    libro.año = 2
    println(libro.año)
    println(libro.EsMatematica)
}

class Libro(val nombre: String, var año: Int){
    val EsMatematica: Boolean
        get()= if(año >=1) true else false
}
