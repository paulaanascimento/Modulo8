package ex01

class EscolherProduto {
    fun informarProdutoMaisBarato(listaProdutos:List<Produto>):String{
        var produtoMenorValor = listaProdutos.first()

        for(produto in listaProdutos){
            if (produto.preco < produtoMenorValor.preco){
                produtoMenorValor = produto
            }
        }
        return produtoMenorValor.nome
    }
}

fun main() {
    val listaProdutos = mutableListOf<Produto>()

    for(i in 1.. 3){
        print("\nDigite o nome do $i° produto: ")
        val nome = readln()

        print("Digite o preço do $i° produto: ")
        val preco = readln().toDouble()

        listaProdutos.add(Produto(nome, preco))
    }

    val escolherProduto = EscolherProduto()
    println("\nO produto com menor preço é: ${escolherProduto.informarProdutoMaisBarato(listaProdutos)}")
}