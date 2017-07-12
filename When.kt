import Moneda

/**
 * Created by root on 12/07/17.
 */

/*
Operador condicional When
 */

fun convertirANuevosBolivares(monto:Double, moneda: Moneda) = when(moneda){
    Moneda.USD -> monto * 9.9
    Moneda.BSF -> monto * 2.1
    Moneda.EUR -> monto * 10.0
    Moneda.BR -> monto * 6.2
}

fun obtenerLaRegionDeLaMoneda(moneda: Moneda)= when (moneda){
    Moneda.USD -> "Norteamerica"
    Moneda.EUR -> "Europa"
    Moneda.BSF, Moneda.BR  -> "Suramerica"
}


fun main(arg:Array<String>){
    println(convertirANuevosBolivares(200.0, Moneda.USD))
    println(obtenerLaRegionDeLaMoneda(Moneda.USD))
    println(obtenerLaRegionDeLaMoneda(Moneda.BSF))
    println(obtenerLaRegionDeLaMoneda(Moneda.EUR))
}