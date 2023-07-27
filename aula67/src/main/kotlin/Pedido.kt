class Pedido {
    private val status = listOf("Pendente", "Em separação", "Enviado")
    private var statusId = -1

    private var estoqueLaranja = 3
    private var estoqueMaca = 3

    val listaFrutas = mutableListOf<Fruta>()

    fun calcularTotal(): Double {
        var total = 0.0
        for (fruta in listaFrutas) {
            total += fruta.preco
        }

        return aplicarPromocao(listaFrutas, total)
    }

    fun informarPedido(lista: List<String>){
        for (nome in lista) {
            when (nome.trim().lowercase()) {
                "maçã" -> {
                    if (estoqueMaca == 0){
                        throw (UnsupportedOperationException("\nFalha no pedido!"))
                    } else {
                        estoqueMaca--
                        listaFrutas.add(Maca())
                    }
                }
                "laranja" -> {
                    if (estoqueLaranja == 0){
                        throw (UnsupportedOperationException("\nFalha no pedido!"))
                    } else {
                        estoqueLaranja--
                        listaFrutas.add(Laranja())
                    }
                }
                else -> throw (UnsupportedOperationException("\nFalha no pedido!"))
            }
        }
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

    fun correio():String{
        return if(statusId < 2){
            statusId++
            "Status do Pedido: ${status[statusId]} - Tempo Estimado de Entrega: 1 dia"
        } else{
            "Status do Pedido: ${status[statusId]} - Tempo Estimado de Entrega: 3 horas"
        }
    }
}