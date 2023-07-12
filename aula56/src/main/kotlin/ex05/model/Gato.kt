package ex05.model

class Gato(nome:String, raca:String, responsavel: Responsavel) : Animal(nome, raca, responsavel) {

    override fun movimentar() {
        println("$nome está andando e saltando em 4 patas")
    }

    override fun comer() {
        println("$nome está comendo whiskas sachê")
    }

    override fun dormir() {
        println("$nome está dormindo na caixa")
    }
}