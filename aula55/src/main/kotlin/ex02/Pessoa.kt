package ex02

import java.time.LocalDate

class Pessoa(private var nome:String) {
    private var idade:Int? = 0
    private var dia:Int = 0
    private var mes:Int = 0
    private var ano:Int = 0

    fun calcularIdade(diaAtual:Int, mesAtual:Int, anoAtual:Int){
        if(dia==0){
            println("\nData de Nascimento não informada")
            idade = null
        } else {
            idade = anoAtual - ano
            if (mesAtual < mes|| (mesAtual == mes && diaAtual < dia)) {
                idade = idade!! - 1
            }
        }
    }

    fun informarIdade(): Int? {
        return idade
    }

    fun informarNome():String{
        return nome
    }

    fun informarDataNascimento():String{
        return "$dia/$mes/$ano"
    }

    fun ajustaDataDeNascimento(dia:Int, mes:Int, ano:Int){
        if (dataValida(dia, mes, ano)) {
            this.dia = dia
            this.mes = mes
            this.ano = ano
        } else {
            println("\nData inválida!")
        }
    }

    private fun dataValida(dia: Int, mes: Int, ano: Int): Boolean {
        return try {
            LocalDate.of(ano, mes, dia)
            true
        } catch (e:Exception){
            false
        }
    }
}