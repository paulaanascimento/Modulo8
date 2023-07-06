package ex01

class Funcionario(var nome:String, var sobrenome:String, var horasTrabalhadas:Double, var valorPorHora:Double) {

    fun nomeCompleto(){
        println("$nome $sobrenome")
    }

    fun calcularSalario(){
        println("Salário a ser recebido: ${horasTrabalhadas*valorPorHora}")
    }

    fun incrementarHoras(horasAdicionais:Double){
        horasTrabalhadas += horasAdicionais
    }

    override fun toString(): String {
        return "Nome: $nome $sobrenome, Horas Trabalhadas: $horasTrabalhadas, Valor Por Hora: $valorPorHora"
    }
}
