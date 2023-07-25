package com.SantiagoBurgos05.my_mobil_app

class Ciclos {
}
fun main() {
    /*  for (i in 1..5)
        print(i)
        println()

    //Recorrido en el orden inverso
    for (i in 5 downTo 1)
        print(i)
        println()

    //Hacer in intersalto entre los valores
    for (i in 1..5 step 2)
        print(i)

    //Ciclo for con contadores. Ejercicio 1
    println("Ingrese 6 numeros")
    var p: Int=0
    var I: Int=0
    var resi: Int=0
    var resp: Int=0

    for (i in 1..6) {

        var num1: Int = readLine()!!.toInt()
        if (num1 % 2 == 0) {
            println("Es par")
            p++
            resp=resp+num1
        }else {
            println("Es impar")
            I++
            resi=resi+num1
        }
    }
    println("El total de numeros pares ingresados son ${p} y la cantidad de impares son ${I} ")
    println("El total de la suma de pares es ${resp} y la de los impares es ${resi}")


    //Recorrer caracteres
    for (i in 'a'..'f')
        println(i)

    var con: String = "Si"
    while (con == "Si" || con == "SI" || con == "sI" || con == "si"){
        println("Ingresa un valor")
        var num: Int = readLine()!!.toInt()
        println("Desea digitar otro valor?")
       con = readLine()!!.toString()
}
    println("Gracias por usar el programa")*/

    var con: String
    do {
        println("Ingresa un valor")
        var num: Int = readLine()!!.toInt()
        println("Desea digitar otro valor?")
        con = readLine()!!.toString()
    } while (con == "Si" || con == "SI" || con == "sI" || con == "si")
    println("Gracias por usar el programa")
}