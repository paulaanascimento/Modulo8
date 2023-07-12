package ex03.model

class Time(private val nomeTime:String, private var quantidadeJogadores:Int, private var quantidadeVitorias:Int, private val esporte: Esporte) {
    fun mostrarDetalhes(){
        println("Nome: $nomeTime\n" +
                "Quantidade de Jogadores: $quantidadeJogadores\n" +
                "Quantidade de Vitorias: $quantidadeVitorias\n" +
                "Esporte: ${retornarEsporteJogado()}\n")
    }

    private fun retornarEsporteJogado():String{
        return when(esporte){
            is Basquete -> "Basquete"
            is Futebol -> "Futebol"
            is Handebol -> "Handebol"
            else -> "Esporte não identificado"
        }
    }
}