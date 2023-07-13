package ex01.model

class DVD(nome:String, preco:Double, codigoBarras:String, private val duracao:Int) : Produto(nome, preco, codigoBarras) {
    override fun mostrarDetalhes() {
        println("Nome: $nome\n" + //get da classe mae
                "Tipo: ${tipo()}\n" +
                "Preço: $preco\n" + //get da classe mae
                "Duração: $duracao\n")
    }

    override fun tipo():String{
        return "DVD"
    }
}