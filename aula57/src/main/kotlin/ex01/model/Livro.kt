package ex01.model

class Livro(nome:String, preco:Double, codigoBarras:String, private val autor:String) : Produto(nome, preco, codigoBarras){
    override fun mostrarDetalhes() {
        println("Nome: $nome\n" + //get da classe mae
                "Tipo: ${tipo()}\n" +
                "Preço: $preco\n" + //get da classe mae
                "Autor: $autor\n")
    }

    override fun tipo():String{
        return "Livro"
    }
}