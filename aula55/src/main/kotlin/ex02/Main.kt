package ex02

import java.time.LocalDate

val data: LocalDate = LocalDate.now()

fun main() {
    iniciar()
    val pessoa = cadastrar()

    var opcao:Int
    while (true){
        println( "\n--------------- MENU ---------------\n"+
                "\t1 - Ajustar Data de Nascimento\n" +
                "\t2 - Mostrar Informações\n" +
                "\t3 - Sair")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0

        when(opcao){
            1 -> ajustarDataNascimento(pessoa)
            2 -> mostrarInformacoes(pessoa)
            3 -> break
            else -> println("Opção Inválida!")
        }
    }
}

fun iniciar(){
    val pessoa1 = Pessoa("Albert Einstein")
    pessoa1.ajustaDataDeNascimento(14,3,1879)
    pessoa1.calcularIdade(data.dayOfMonth,data.monthValue, data.year)

    val pessoa2 = Pessoa("Isaac Newton")
    pessoa2.ajustaDataDeNascimento(4,1,1643)
    pessoa2.calcularIdade(data.dayOfMonth,data.monthValue, data.year)

    println("CURIOSIDADE: Se estivessem vivos, ${pessoa1.informarNome()} teria ${pessoa1.informarIdade()} anos e o ${pessoa2.informarNome()} ${pessoa2.informarIdade()}.\n")
}

fun cadastrar():Pessoa{
    print("Digite o seu nome: ")
    return Pessoa(readln())
}

fun ajustarDataNascimento(pessoa: Pessoa){
    print("Digite o dia do nascimento: ")
    val dia = readln().toIntOrNull()?:0

    print("Digite o mes do nascimento: ")
    val mes = readln().toIntOrNull()?:0

    print("Digite o ano do nascimento: ")
    val ano = readln().toIntOrNull()?:0

    pessoa.ajustaDataDeNascimento(dia, mes, ano)
}

fun mostrarInformacoes(pessoa: Pessoa){
    pessoa.calcularIdade(data.dayOfMonth,data.monthValue, data.year)
    println("\nNome: ${pessoa.informarNome()}\n" +
            "Data de Nascimento: ${pessoa.informarDataNascimento()}\n" +
            "Idade: ${pessoa.informarIdade()}")
}