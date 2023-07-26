package ex03

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class NumerosTest {

    @Test
    fun informarMaiorNumero() {
        val numeros = Numeros()
        val listaNumeros = listOf(1,10,10000,100,1000)
        assertEquals(10000, numeros.informarMaiorNumero(listaNumeros))
    }
}