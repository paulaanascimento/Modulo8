class Pedido {
    private val status = listOf("Pendente", "Em separação", "Enviado")
    private var statusId = -1

    private var estoqueLaranja = 6
    private var estoqueMaca = 4

    val listaFrutas = mutableListOf<Fruta>()

    fun calcularTotal(): Double {
        aplicarPromocao()

        var total = 0.0
        for (fruta in listaFrutas) {
            total += fruta.preco
        }

        return total
    }

    fun informarPedido(lista: List<String>){
        for (fruta in lista) {
            when (fruta.lowercase()) {
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

    private fun aplicarPromocao(){

        val laranjas = listaFrutas.filterIsInstance<Laranja>()
        val macas = listaFrutas.filterIsInstance<Maca>()

        if(laranjas.size >= 3){
            for(i in 2 until  laranjas.size step 3){
                laranjas[i].preco = 0.0
            }
        }

        if(macas.size >= 2){
            for(i in 1 until  macas.size step 2){
                macas[i].preco = 0.0
            }
        }

        listaFrutas.clear()
        listaFrutas.addAll(laranjas)
        listaFrutas.addAll(macas)
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