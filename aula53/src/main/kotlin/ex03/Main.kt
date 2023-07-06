package ex03

fun main() {
    val filme1 = Filme("Os Vingadores", 142)
    filme1.exibirDuracaoEmHoras()

    val filme2 = Filme("Hotel Transilvânia", 93)
    filme2.exibirDuracaoEmHoras()

    println("\nOs filmes em cartaz são ${filme1.titulo} e ${filme2.titulo}.\n")

    val filmes = ArrayList<Filme>()
    filmes.add(Filme("A Princesa e o Sapo", 97))
    filmes.add(Filme("A Origem dos Guardiões", 99))
    filmes.add(Filme("Com Amor, Simon", 110))
    filmes.add(Filme("Enola Holmes", 123))
    filmes.add(Filme("Moana", 107))

    filmes.forEach{filme -> filme.exibirDuracaoEmHoras() }

    println("\nOs filmes em cartaz são ${filmes[0].titulo}, ${filmes[1].titulo}, ${filmes[2].titulo}, ${filmes[3].titulo} e ${filmes[4].titulo}.\n")
}