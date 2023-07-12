package ex04.model

open class Funcionario (private var nomeCompleto: String, private var setor: String, private var salario: Double, private val dataAdmissao: String) {
    fun mostrarDetalhes(){
        println("Nome: $nomeCompleto\n" +
                "Setor: $setor\n" +
                "Salário: $salario\n" +
                "Data de Admissão: $dataAdmissao\n")
    }
}