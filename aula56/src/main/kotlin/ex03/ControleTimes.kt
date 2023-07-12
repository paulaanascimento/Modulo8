package ex03

import ex03.model.*

val times = ArrayList<Time>()

fun main(){
    var opcao:Int
    while (true){
        println( "\n--------------- MENU ---------------\n"+
                "\t1 - Registrar Time\n" +
                "\t2 - Mostrar Times Cadastrados\n" +
                "\t3 - Sair")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0

        when(opcao){
            1 -> registrarTime()
            2 -> mostrarTimesCadastrados()
            3 -> break
            else -> println("\nOpção Inválida!")
        }
    }
}


fun registrarTime() {
    var opcao:Int
    while (true){
        println( "\n--------------- REGISTRANDO TIME ---------------\n"+
                "\t1 - Basquete\n" +
                "\t2 - Futebol\n" +
                "\t3 - Volei\n" +
                "\t4 - Voltar")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0

        lateinit var nome:String
        var quantidadeJogadores = 0
        var quantidadeVitorias = 0

        if(opcao!=4 && opcao > 0 && opcao <4){

            do{
                print("Digite o nome do time: ")
                nome = readln()

                if(nome == ""){
                    println("\nInforme o nome do time!\n")
                }
            }while (nome == "")

            do{
                print("Digite a quantidade de jogadores: ")
                quantidadeJogadores = readln().toIntOrNull()?:0

                if(quantidadeJogadores <= 0){
                    println("\nInforme a quantidade de jogadores!\n")
                }
            }while (quantidadeJogadores <= 0)

            do{
                print("Digite a quantidade de vitórias: ")
                quantidadeVitorias = readln().toIntOrNull()?:0

                if(quantidadeVitorias <= 0){
                    println("\nInforme a quantidade de jogadores!\n")
                }
            }while (quantidadeVitorias <= 0)
        }

        when(opcao){
            1 -> times.add(Time(nome, quantidadeJogadores, quantidadeVitorias, Basquete(10, 48)))
            2 -> times.add(Time(nome, quantidadeJogadores, quantidadeVitorias, Futebol(22, 90)))
            3 -> times.add(Time(nome, quantidadeJogadores, quantidadeVitorias, Handebol(14, 60)))
            4 -> break
            else -> println("\nOpção Inválida!")
        }
    }
}

fun mostrarTimesCadastrados() {
    if (times.isEmpty()){
        println("\nNenhum time foi cadastrado!")
    } else {
        println("\n--------------- TIMES CADASTRADOS ---------------")
        times.forEach { time: Time -> time.mostrarDetalhes() }
    }
}