package ex01.model

abstract class Produto (protected val nome:String, protected var preco:Double, protected val codigoBarras:String){
    abstract fun mostrarDetalhes()
    abstract fun tipo():String

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Produto

        return codigoBarras == other.codigoBarras
    }

    override fun hashCode(): Int {
        return codigoBarras.hashCode()
    }
}