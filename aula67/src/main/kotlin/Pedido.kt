class Pedido {
    fun calcularTotal(listaFrutas:List<Fruta>): Double {
        var total = 0.0
        for (fruta in listaFrutas) {
            total += fruta.preco
        }
        return total
    }

    fun informarPedido(listaFrutas: List<String>):List<Fruta>{
        val produtos = mutableListOf<Fruta>()
        for (nome in listaFrutas) {
            when (nome.trim().lowercase()) {
                "maçã" -> produtos.add(Maca())
                "laranja" -> produtos.add(Laranja())
                else -> println("Produto inválido: $nome")
            }
        }

        return produtos
    }
}

fun main() {
    val pedido = Pedido()
    println(pedido.calcularTotal(pedido.informarPedido(listOf("Maçã", "Maçã", "Laranja", "Maçã"))))
}