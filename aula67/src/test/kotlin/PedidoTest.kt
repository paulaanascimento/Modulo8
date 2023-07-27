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

    @Test
    fun aplicarPromocaoLaranja() {
        val pedido = Pedido()
        val resultado = pedido.calcularTotal(listOf(Laranja(), Laranja(), Laranja()))
        assertEquals(0.50, resultado)
    }

    @Test
    fun aplicarPromocaoMaca() {
        val pedido = Pedido()
        val resultado = pedido.calcularTotal(listOf(Maca(), Maca()))
        assertEquals(0.60, resultado)
    }

    @Test
    fun aplicarPromocaoLaranjaMaca() {
        val pedido = Pedido()
        val resultado = pedido.calcularTotal(listOf(Laranja(), Laranja(), Laranja(), Maca(), Maca()))
        assertEquals(1.10, resultado)
    }
}