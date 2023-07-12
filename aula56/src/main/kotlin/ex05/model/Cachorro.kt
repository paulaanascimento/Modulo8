package ex05.model

class Cachorro(nome:String, raca:String, responsavel: Responsavel) : Animal(nome, raca, responsavel){

    override fun movimentar() {
        println("$nome está andando em 4 patas")
    }

    override fun comer() {
        println("$nome está comendo bife")
    }

    override fun dormir() {
        println("$nome dormindo na cama de ${responsavel.retornarNome()}")
    }
}