class Pedido {
    fun calcularTotal(listaFrutas: List<Fruta>): Double {
        var total = 0.0
        for (fruta in listaFrutas) {
            total += fruta.preco
        }

        return aplicarPromocao(listaFrutas, total)
    }

    fun informarPedido(listaFrutas: List<String>): List<Fruta> {
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

    private fun aplicarPromocao(listaFrutas:List<Fruta>, total:Double):Double{
        var novoValor = total

        if(listaFrutas.count{it is Laranja} >= 3){
            novoValor -= 0.25
        }

        if(listaFrutas.count{it is Maca} >= 2){
            novoValor -= 0.60
        }

        return novoValor
    }
}

fun main() {
    val pedido = Pedido()
    println(pedido.calcularTotal(pedido.informarPedido(listOf("Maçã", "Maçã", "Laranja", "Maçã"))))
}