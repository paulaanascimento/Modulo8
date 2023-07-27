import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PedidoTest {

    @Test
    fun calcularTotal() {
        val pedido = Pedido()
        val resultado = pedido.calcularTotal(listOf(Maca(), Maca(), Laranja(), Maca()))
        assertEquals(2.05, resultado)
    }

    @Test
    fun informarPedido() {
        val pedido = Pedido()
        val resultado = pedido.informarPedido(listOf("Maçã", "Maçã", "Laranja", "Maçã"))
        assertTrue(resultado is List<Fruta>)
        assertEquals(4, resultado.size)
    }
}