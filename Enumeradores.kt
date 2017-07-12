/**
 * Created by root on 12/07/17.
 */
enum class Moneda(val simbolo: String) {
    USD("$"), EUR("€"), BSF("\$BSF."), BR("\$þ");

    fun formato(monto: Double) = "$simbolo $monto"
}

fun main(args:Array<String>){
    println(Moneda.BSF)
    println(Moneda.EUR.simbolo)
    println(Moneda.USD.formato(1219.99))
}