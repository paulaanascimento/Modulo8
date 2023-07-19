package ex05

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

class Aluno(val matricula:String, var nome:String, var dataNascimento:String, var sexo:Char){

    companion object{
        fun validardata(data:String) : Boolean{
            val formatoBrasileiro = DateTimeFormatter.ofPattern ("dd/MM/yyyy")
            return try {
                LocalDate.parse (data, formatoBrasileiro)
                true
            } catch (e: DateTimeParseException) {
                false
            }
        }
    }

    fun mostrarDados(){
        println("Matrícula: $matricula\n" +
                "Nome: $nome\n" +
                "Data de nascimento: $dataNascimento\n" +
                "Sexo: $sexo\n")
    }

    fun calcularIdade():Int{
        val formatoBrasileiro = DateTimeFormatter.ofPattern ("dd/MM/yyyy")
        return Period.between(LocalDate.parse(dataNascimento, formatoBrasileiro), LocalDate.now()).years
    }
}