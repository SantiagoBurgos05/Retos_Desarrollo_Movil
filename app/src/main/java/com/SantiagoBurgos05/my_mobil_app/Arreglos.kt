package com.SantiagoBurgos05.my_app_movil

class Arreglos {
}
fun main(){
    //Palbra reservada para arreglos "arrayOf y para impresiones variable.contentToString()"

    var pets= arrayOf("dog","cat","canary")

    //Cambiar el valor de una posicion (es necesario que sea antes de leer el array)
    pets[2]="cerdito"

    println(pets.contentToString())
    //Escoger un campo del arreglo
    println(pets[1])

    //Recorrer un array con ciclos
    for (element in pets){
        println("La mascota es: ${element}")
    }
    //Mostrar el elemento y la posicion del elemento
    for ((index,element)in pets.withIndex()) {
        println("La mascota numero. $index es: ${element}")
    }
}