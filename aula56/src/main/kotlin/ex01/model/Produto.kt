package ex01.model

open class Produto(private var nome:String, private var codigoBarras:String, private var dataValidade:String) {
    fun mostrarDetalhes(){
        println("Nome: $nome\n" +
                "Codigo de Barras: $codigoBarras\n" +
                "Data de Validade: $dataValidade\n")
    }
}