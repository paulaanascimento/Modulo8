package ex02

class Conjunto {
    companion object{
        fun adicionarNumeros(): Set<Int> {
            return setOf(1,5,5,6,7,8,8,8)
        }
    }
}

fun main() {
    val conjuntoNumeros = Conjunto.adicionarNumeros()
    println(conjuntoNumeros)
}

// a diferença é que o conjunto não aceita valores duplicados, logo só armazenará o elemento uma vez