package ex02

class Circulo (private var raio:Float) : Forma(){
    override fun calcularArea(): Float {
        return (Math.PI * raio * raio).toFloat()
    }

    override fun calcularPerimetro(): Float {
        return (2 * Math.PI * raio).toFloat()
    }
}