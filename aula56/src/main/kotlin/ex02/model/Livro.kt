package ex02.model

open class Livro(private val nome:String, private val autor: Autor) {
    fun mostrarDetalhes(){
        println("Nome: $nome\n" +
                "Autor: ${autor.retornarNome()}\n")
    }
}