package ex05.model

open class Animal(protected val nome:String, private val raca:String, protected val responsavel: Responsavel) {

    open fun movimentar(){

    }

    open fun comer(){

    }

    open fun dormir(){

    }
}