package ex02

import ex02.model.Circulo
import ex02.model.Forma
import ex02.model.Quadrado
import ex02.model.Retangulo

fun main() {
    val listaFormas = ArrayList<Forma>()

    listaFormas.add(Circulo(10f))
    listaFormas.add(Retangulo(7.5f, 14f))
    listaFormas.add(Quadrado(20f))
    listaFormas.add(Circulo(150f))
    listaFormas.add(Retangulo(9f, 3f))

    listaFormas.forEach { forma: Forma ->
        when (forma) {
            is Circulo -> {
                println("----- CIRCULO -----")
            }

            is Quadrado -> {
                println("----- QUADRADO -----")
            }

            is Retangulo -> {
                println("----- RETANGULO -----")
            }
        }
        println("Area: ${forma.calcularArea()}")
        println("Perimetro: ${forma.calcularPerimetro()}\n")
    }
}