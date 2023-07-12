package ex02

import ex02.model.*

val biblioteca = ArrayList<Livro>()

fun main(){
    var opcao:Int
    while (true){
        println( "\n--------------- MENU ---------------\n"+
                "\t1 - Registrar Livro\n" +
                "\t2 - Mostrar Livros Cadastrados\n" +
                "\t3 - Sair")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0

        when(opcao){
            1 -> registrarLivro()
            2 -> mostrarLivrosCadastrados()
            3 -> break
            else -> println("\nOpção Inválida!")
        }
    }
}


fun registrarLivro() {
    var opcao:Int
    while (true){
        println( "\n--------------- REGISTRANDO LIVRO ---------------\n"+
                "\t1 - Autoajuda\n" +
                "\t2 - Aventura\n" +
                "\t3 - Ficção\n" +
                "\t4 - Romance\n" +
                "\t5 - Voltar")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0

        lateinit var nome:String
        lateinit var autor:String

        if(opcao!=5 && opcao > 0 && opcao <5){

            do{
                print("Digite o nome do livro: ")
                nome = readln()

                if(nome == ""){
                    println("\nInforme o nome do livro!\n")
                }
            }while (nome == "")

            do{
                print("Digite o nome do autor do livro: ")
                autor = readln()

                if(autor == ""){
                    println("\nInforme o nome do autor do livro!\n")
                }
            }while (autor == "")
        }

        when(opcao){
            1 -> biblioteca.add(AutoAjuda(nome, Autor(autor)))
            2 -> biblioteca.add(Aventura(nome, Autor(autor)))
            3 -> biblioteca.add(Ficcao(nome, Autor(autor)))
            4 -> biblioteca.add(Romance(nome, Autor(autor)))
            5 -> break
            else -> println("\nOpção Inválida!")
        }
    }
}

fun mostrarLivrosCadastrados() {
    if (biblioteca.isEmpty()){
        println("\nNenhum livro foi cadastrado!")
    } else {
        println("\n--------------- LIVROS CADASTRADOS ---------------")
        println("-----Autoajuda-----")
        biblioteca.filterIsInstance<AutoAjuda>().forEach { livro: Livro -> livro.mostrarDetalhes() }

        println("\n-----Aventura-----")
        biblioteca.filterIsInstance<Aventura>().forEach { livro: Livro -> livro.mostrarDetalhes() }

        println("\n-----Ficção-----")
        biblioteca.filterIsInstance<Ficcao>().forEach { livro: Livro -> livro.mostrarDetalhes() }

        println("\n-----Romance-----")
        biblioteca.filterIsInstance<Romance>().forEach { livro: Livro -> livro.mostrarDetalhes() }
    }
}
