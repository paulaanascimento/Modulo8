package ex01

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class EscolherProdutoTest {

    @Test
    fun deveInformarNomeProdutoMaisBarato() {
        val escolherProduto = EscolherProduto()
        val listaProdutos = listOf(Produto("Motorola Edge 30 Ultra", 4500.0), Produto("Xiaomi POCO F5", 3000.0), Produto("Galaxy S23 Ultra", 6150.0))
        assertEquals("Xiaomi POCO F5", escolherProduto.informarProdutoMaisBarato(listaProdutos))
    }
}