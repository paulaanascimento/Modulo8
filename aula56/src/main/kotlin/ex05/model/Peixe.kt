package ex05.model

class Peixe(nome:String, raca:String, responsavel: Responsavel) : Animal(nome, raca, responsavel) {

    override fun movimentar() {
        println("$nome está nadando")
    }

    override fun comer() {
        println("$nome está comendo ração molhada")
    }

    override fun dormir() {
        println("$nome está dormindo de olho aberto")
    }
}