package com.SantiagoBurgos05.my_mobil_app
// SIMULADOR DE NEQUI
class RetoIntegrado {
}
fun main() {
    var intentos:Int=3
    var saldo:Double=4500.0
    var listaT = mutableListOf("0123456789")
    var listaC = mutableListOf(1234)

    fun random(){
        println("Cuanto deseas retirar? ")
        var montoR: Int= readLine()!!.toInt()
        saldo=saldo-montoR
        var seis: Int=(100000..999999).random()
        println("Su número de retiro es: ${seis}")
    }
    fun nequi(){
        while (intentos > 0) {
            println("Ingrese su número de telefono: ")
            var numero: String = readLine()!!.toString()
            println("Ingrese su contraseña de 4 digitos: ")
            var contraseña: Int = readLine()!!.toInt()

            if (listaT.contains(numero) && listaC.contains(contraseña)) {
                fun inicio() {
                    println("Bienvenido a Nequi Colombia!!")
                    println("El saldo disponible en su cuenta es: ${saldo}")
                    println("Qué deseas hacer el día de hoy? \n 1:Saca \n 2:Envia \n 3:Recarga \n 4:Salir")
                    var option: Int = readLine()!!.toInt()
                    if (option == 1) {
                        if (saldo < 2000) {
                            println("No te alcanza")
                            inicio()
                        }
                        println("Desea retirar en: 1:Cajero || 2:Punto Físico")
                        var retiro: Int = readLine()!!.toInt()
                        if (retiro == 1) {
                            random()
                            inicio()
                        } else if (retiro == 2) {
                            random()
                            inicio()
                        }

                    }else if (option==2){
                        println("Ingrese el número al que desea enviar: ")
                        var enviar:Long= readLine()!!.toLong()
                        println("Ingrese el monto que desea enviar: ")
                        var monto:Double= readLine()!!.toDouble()
                        if (monto>saldo) {
                            println("No es posible enviar el dinero. Saldo insuficiente")
                            inicio()
                        }
                        else {
                            println("Transaccion realizada al número: ${enviar} por un precio de: ${monto}")
                            saldo=saldo-monto
                            inicio()
                        }

                    }else if (option ==3){
                        println("Ingrese el monto que desea recargar: ")
                        var recarga:Int= readLine()!!.toInt()
                        saldo=saldo+recarga
                        println("Transaccion realizada exitosamente!!")
                        inicio()
                    }else if (option==4){
                        nequi()
                    }

                }
                inicio()
            }else {
                intentos--
                if (intentos > 0) {
                    println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes tres intentos más")
                } else {
                    println("La cuenta ha sido bloqueada. Intente mas tarde")
                }
            }
        }
    }
    nequi()
}