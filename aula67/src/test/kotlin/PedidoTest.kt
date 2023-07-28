import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PedidoTest {

    @Test
    fun deveAdicionarProdutoALista() {
        val pedido = Pedido()
        assertEquals(0, pedido.listaFrutas.size)
        pedido.informarPedido(listOf("Maçã", "Maçã", "Laranja", "Maçã"))
        assertEquals(4, pedido.listaFrutas.size)
    }

    @Test
    fun deveRetornarOTotalDoPedidoDaLista() {
        val pedido = Pedido()
        pedido.informarPedido(listOf("Maçã", "Laranja", "Laranja"))
        val resultado = pedido.calcularTotal()
        assertEquals(1.10, resultado)
    }

    @Test
    fun deveAplicarPromocaoLaranja() { //a cada três, uma sai de graça
        val pedido = Pedido()
        pedido.informarPedido(listOf("Laranja", "Laranja", "Laranja", "Laranja", "Laranja", "Laranja"))
        val resultado = pedido.calcularTotal()
        assertEquals(1.0, resultado)
    }

    @Test
    fun deveAplicarPromocaoMaca() { //a cada duas, uma sai de graça
        val pedido = Pedido()
        pedido.informarPedido(listOf("Maçã", "Maçã", "Maçã", "Maçã"))
        val resultado = pedido.calcularTotal()
        assertEquals(1.20, resultado)
    }

    @Test
    fun deveAplicarPromocaoLaranjaMaca() {
        val pedido = Pedido()
        pedido.informarPedido(listOf("Laranja", "Laranja", "Laranja", "Maçã", "Maçã"))
        val resultado = pedido.calcularTotal()
        assertEquals(1.10, resultado)
    }

    @Test
    fun deveAtualizarStatusQuatroVezes() {
        val pedido = Pedido()
        assertEquals("Status do Pedido: Pendente - Tempo Estimado de Entrega: 1 dia", pedido.correio())
        assertEquals("Status do Pedido: Em separação - Tempo Estimado de Entrega: 1 dia", pedido.correio())
        assertEquals("Status do Pedido: Enviado - Tempo Estimado de Entrega: 1 dia", pedido.correio())
        assertEquals("Status do Pedido: Enviado - Tempo Estimado de Entrega: 3 horas", pedido.correio())
        assertEquals("Status do Pedido: Enviado - Tempo Estimado de Entrega: 3 horas", pedido.correio())
    }

    @Test
    fun deveLancarExcessaoDeFalhaNoPedido() {
        val pedido = Pedido()
        assertThrows(UnsupportedOperationException::class.java){
            pedido.informarPedido(listOf("Laranja", "Laranja", "Laranja", "Laranja", "Laranja", "Laranja", "Laranja"))
        }
        assertThrows(UnsupportedOperationException::class.java){
            pedido.informarPedido(listOf("Maçã", "Maçã", "Maçã", "Maçã", "Maçã"))
        }
        assertThrows(UnsupportedOperationException::class.java){
            pedido.informarPedido(listOf("Maçã", "Tomate"))
        }
    }
}