package ex02

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class DiasSemanaTest {

    @Test
    fun deveRetornarDiaCorrespondente() {
        val diasSemana = DiasSemana()
        assertEquals("Quarta", diasSemana.exibirDiaCorrespondente(4))
    }

    @Test
    fun deveRetornarValorInvalido() {
        val diasSemana = DiasSemana()
        assertEquals("Valor inválido", diasSemana.exibirDiaCorrespondente(1950))
    }
}