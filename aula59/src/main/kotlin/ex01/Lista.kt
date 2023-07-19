package ex01

class Lista {
    companion object{
        fun adicionarNumeros(): List<Int> {
            return listOf(1,5,5,6,7,8,8,8)
        }
    }
}

fun main() {
    val listaNumeros = Lista.adicionarNumeros()
    println(listaNumeros)
}