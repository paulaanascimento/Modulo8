package ex01

import ex01.model.CD
import ex01.model.DVD
import ex01.model.Livro
import ex01.model.Produto

fun main() {
    val produtos = ArrayList<Produto>()

    produtos.add(Livro("1984", 39.99, "1234567890123", "George Orwell"))
    produtos.add(Livro("O Pequeno Príncipe", 24.99, "9876543210987", "Antoine de Saint-Exupéry"))
    produtos.add(CD("Thriller", 9.99, "4567890123456", 9))
    produtos.add(CD("Proof", 500.0, "7890123456789", 48))
    produtos.add(DVD("Os Vingadores", 24.99, "2345678901234", 142))
    produtos.add(DVD("O Senhor dos Anéis: A Sociedade do Anel", 14.99, "8765432109876", 178))

    println("---------- PRODUTOS CADASTRADOS ----------")
    produtos.forEach { produto: Produto -> produto.mostrarDetalhes() }

    val produtoMesmoCodigo = CD("Proof", 500.0, "7890123456789", 48)
    val produtoCodigoDiferente = CD("Proof", 500.0, "7890123456780", 48)

    buscarProduto(produtoMesmoCodigo, produtos)
    buscarProduto(produtoCodigoDiferente, produtos)
}

fun buscarProduto(produtoProcurado: Produto, listaProdutos:ArrayList<Produto>){
    println("---------- PROCURANDO PRODUTO ----------")
    for(i in 0 until listaProdutos.size){
        if(produtoProcurado.equals(listaProdutos[i])){
            println("O produto está na posição $i da lista.")
            return
        }
    }
    println("Produto não encontrado.")
}