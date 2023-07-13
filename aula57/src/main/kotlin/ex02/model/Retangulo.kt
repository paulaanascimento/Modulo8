package ex02.model

open class Retangulo (private var lado:Float, private var altura:Float) : Forma(){
    override fun calcularArea(): Float {
        return lado * altura
    }

    override fun calcularPerimetro(): Float {
        return 2 * (lado + altura)
    }
}