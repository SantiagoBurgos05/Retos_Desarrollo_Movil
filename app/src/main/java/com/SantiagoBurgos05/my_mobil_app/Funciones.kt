package com.SantiagoBurgos05.my_mobil_app

class Funciones {
}

fun main() {
    /*println("Ingrese su edad")
    var edad: Int= readLine()!!.toInt()
    val mayor= if(edad>=18) true else false
    println(mayor)*/
        var pi: Float=3.1416F
        do {
            println("Bienvenido, que desea calcular?\n 1: Para el area del circulo || 2: Para el perimetro del circulo || 3: Para el area deltriangulo ||\n" +
                    " 4: Para el perimetro del triangulo || 5: Para el area del rectangulo || 6: Para el perimetro del rectangulo ")
            var option: Int= readLine()!!.toInt()
            if(option==1){
                println("Ingrese el radio del circulo: ")
                var radio: Double= readLine()!!.toDouble()

                fun area(){
                    var result=pi*(radio*2)
                    println("El area de su circulo es: ${result}")
                }
                area()
            }else if(option==2){
                println("Ingrese el diametro del circulo: ")
                var diametro: Double= readLine()!!.toDouble()

                fun perimetro(){
                    var resul1=pi*diametro
                    println("El perimetro de su circulo es: ${resul1}")
                }
                perimetro()
                //FUNCIONES CON PARAMETROS
            }else if (option==3){
                println("Ingrese la base del triangulo")
                var base= readLine()!!.toDouble()
                println("Ingrese la altura del triangulo")
                var altura= readLine()!!.toDouble()

                fun aTriangulo(base:Double, altura:Double){
                    var resultado1=(base*altura)/2
                    println("El area de su triangulo es: ${resultado1}")
                }
                aTriangulo(base, altura)
            }else if(option==4){
                println("Ingrese el valor de sus lados")
                var lado: Double= readLine()!!.toDouble()

                fun pTriangulo(lado:Double){
                    var resultado=lado*3
                    println("El perimetro de su triangulo es: ${resultado}")
                }
                pTriangulo(lado)
            }
            //FUNCIONES CON VALOR DE RETORNO
            else if (option==5){
                println("Ingrese el largo del rectangulo: ")
                var largo:Double= readLine()!!.toDouble()
                println("Ingrese el ancho del rectangulo: ")
                var ancho:Double= readLine()!!.toDouble()

                fun aRectangulo(largo:Double, ancho:Double): Double{
                    var resulR=largo*ancho
                    println("El area del rectangulo es: ${resulR}")
                    return resulR
                }
                aRectangulo(largo,ancho)
            }else if (option==6) {
                println("Ingrese la longitud del rectangulo")
                var longitud:Double= readLine()!!.toDouble()
                println("Ingrese el ancho del rectangulo")
                var ancho:Double= readLine()!!.toDouble()
                fun pRectangulo(longitud:Double, ancho:Double):Double{
                    var resulR2=((2*longitud)*(2*ancho))
                    println("El perimetro del rectangulo es: ${resulR2}")
                    return resulR2
                }
                pRectangulo(longitud, ancho)
            }else{
                println("Su opcion es incorrecta.")
            }
            println("Desea registrar otra opcion? ")
            var i: String= readLine()!!.toString()
        }while (i=="si"|| i=="Si" ||i=="sI"||i=="SI")
            println("Gracias por usar mi programa :D")
}


