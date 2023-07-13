package ex02

fun main() {
    val listaFormas = ArrayList<Forma>()

    listaFormas.add(Circulo(10f))
    listaFormas.add(Retangulo(7.5f, 14f))
    listaFormas.add(Quadrado(20f))
    listaFormas.add(Circulo(150f))
    listaFormas.add(Retangulo(9f, 3f))

    println("-----Circulo-----")
    listaFormas.filterIsInstance<Circulo>().forEach { circulo : Circulo ->
        println("Area: ${circulo.calcularArea()}")
        println("Perimetro: ${circulo.calcularPerimetro()}\n")
    }

    println("-----Retangulo-----")
    listaFormas.filterIsInstance<Retangulo>().forEach { retangulo : Retangulo->
        println("Area: ${retangulo.calcularArea()}")
        println("Perimetro: ${retangulo.calcularPerimetro()}\n")
    }

    println("-----Quadrado-----")
    listaFormas.filterIsInstance<Quadrado>().forEach { quadrado : Quadrado ->
           println("Area: ${quadrado.calcularArea()}")
        println("Perimetro: ${quadrado.calcularPerimetro()}\n")
    }
}