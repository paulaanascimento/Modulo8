package ex01.model

class CD(nome:String, preco:Double, codigoBarras:String, private val numeroFaixas:Int) : Produto(nome, preco, codigoBarras) {
    override fun mostrarDetalhes() {
        println("Nome: $nome\n" + //get da classe mae
                "Tipo: ${tipo()}\n" +
                "Preço: $preco\n" + //get da classe mae
                "Número de Faixas: $numeroFaixas\n")
    }

    override fun tipo():String{
        return "CD"
    }
}