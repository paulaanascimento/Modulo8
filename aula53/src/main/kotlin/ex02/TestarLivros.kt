package ex02

import kotlin.random.Random

fun main() {
    val livroFavorito = Livros()
    livroFavorito.titulo = "O Pequeno Príncipe"
    livroFavorito.qtdPaginas = 98
    println("O livro '${livroFavorito.titulo}' possui ${livroFavorito.qtdPaginas} páginas")
    livroFavorito.paginasLidas = 20
    livroFavorito.verificarProgresso()
    livroFavorito.paginasLidas = 50
    livroFavorito.verificarProgresso()

    val livros = ArrayList<Livros>()
    for(i:Int in 0..9){
        livros.add(Livros())
    }

    livros[0].titulo = "Dragon Omen"
    livros[1].titulo = "Forbidden Tales"
    livros[2].titulo = "Destroy of Heroes"
    livros[3].titulo = "Crash of Trickery"
    livros[4].titulo = "Land and Empire"
    livros[5].titulo = "Extinction and Cult"
    livros[6].titulo = "Hell and Victory"
    livros[7].titulo = "Anarchy and Revolution"
    livros[8].titulo = "Antishot"
    livros[9].titulo = "Ultralust"

    for(i in livros.indices){
        livros[i].qtdPaginas = Random.nextInt(50,500)
        println("\nO livro '${livros[i].titulo}' possui ${livros[i].qtdPaginas} páginas")
        livros[i].paginasLidas = Random.nextInt(0,livros[i].qtdPaginas)
        livros[i].verificarProgresso()
        livros[i].paginasLidas = Random.nextInt(livros[i].paginasLidas,livros[i].qtdPaginas)
        livros[i].verificarProgresso()
    }
}