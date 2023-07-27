fun main() {
    try {
        val pedido = Pedido()
        pedido.informarPedido(listOf("Maçã", "Maçã", "Laranja", "Maçã"))
        println("\nPedido Concluído\n")

        for(i in 1 .. 4){
            println("${pedido.correio()}\n")
            Thread.sleep(1000)
        }

    } catch (exception:UnsupportedOperationException){
        println(exception.message)
    }
}