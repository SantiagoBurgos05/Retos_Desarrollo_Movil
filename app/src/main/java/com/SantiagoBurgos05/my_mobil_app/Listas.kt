package com.SantiagoBurgos05.my_mobil_app

class Listas {
}
fun main(){
    //Diferencia con array. Hay un tipo de lista inmutable y otra mutable
    //Tipos de ejecucion para listas
    val instruments = listOf("trumpet","piano","violin")
    println(instruments)

    val instrumentos: List<String> =listOf("trumpet","piano","violin")
    println(instrumentos)

    //Listas mutables
    val myList = mutableListOf("piano","piano","violin")
    myList[1]="saxofon"
    println(myList)
    println("------------------")
    println("------------------")

    //Actividad de investigacion
    //1 primer y ultimo elemento de una lista
    println("Primer punto")
    println(myList.first())
    println(myList.last())
    println("------------------")

    println("Segundo punto")
    //2Agregar elementos a una lista mutable
    myList.add("guitarra")
    println(myList)
    println("------------------")

    println("tercer punto")
    //3 Como quitar elementos a una lista
    myList.remove("piano")
    println(myList)


    println("------------------")
    println("Cuarto punto")
    //4 Que pasa si quitas un elemento que no existe
    myList.remove("piano")
    println(myList)
    //La lista queda de la misma manera

    println("------------------")
    println("Quinto punto")
    //5 Como quitar elementos a traves del index
    myList.removeAt(0)
    println(myList)

    println("------------------")
    println("Sexto punto")
    //6 eliminar una lista
    myList.clear()
    println(myList)
}