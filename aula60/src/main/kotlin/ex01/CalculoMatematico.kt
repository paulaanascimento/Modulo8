package ex01

class CalculoMatematico {
    fun divisao(dividendo:Int, divisor:Int):Int {
        return try {
            dividendo / divisor
        } catch (exception: ArithmeticException ){
            println("Não é possível dividir por zero!")
            0
        }
    }
}