package ex01

import ex01.model.*

val produtosCadastrados = ArrayList<Produto>()

fun main(){
    var opcao:Int
    while (true){
        println( "\n--------------- MENU ---------------\n"+
                "\t1 - Registrar Produto\n" +
                "\t2 - Mostrar Produtos Cadastrados\n" +
                "\t3 - Sair")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0

        when(opcao){
            1 -> registrarProdutos()
            2 -> mostrarProdutosCadastrados()
            3 -> break
            else -> println("\nOpção Inválida!")
        }
    }
}

fun registrarProdutos(){
    var opcao:Int
    while (true){
        println( "\n--------------- REGISTRANDO PRODUTO ---------------\n"+
                "\t1 - Bebida\n" +
                "\t2 - Comida\n" +
                "\t3 - Higiene Pessoal\n" +
                "\t4 - Limpeza\n" +
                "\t5 - Voltar")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0

        lateinit var nome:String
        lateinit var codigo:String
        lateinit var data:String

        if(opcao!=5 && opcao > 0 && opcao <5){

            do{
                print("Digite o nome do produto: ")
                nome = readln()

                if(nome == ""){
                    println("\nInforme o nome do produto!\n")
                }
            }while (nome == "")

            do{
                print("Digite o código de barras do produto: ")
                codigo = readln()

                if(codigo == ""){
                    println("\nInforme o código do produto!\n")
                }
            }while (codigo == "")

            do{
                print("Digite a data de validade do produto: ")
                data = readln()

                if(data == ""){
                    println("\nInforme a data de validade do produto!\n")
                }
            }while (data == "")

        }

        when(opcao){
            1 -> produtosCadastrados.add(Bebida(nome, codigo, data))
            2 -> produtosCadastrados.add(Comida(nome, codigo, data))
            3 -> produtosCadastrados.add(HigienePessoal(nome, codigo, data))
            4 -> produtosCadastrados.add(Limpeza(nome, codigo, data))
            5 -> break
            else -> println("\nOpção Inválida!")
        }
    }
}

fun mostrarProdutosCadastrados(){
    if (produtosCadastrados.isEmpty()){
        println("\nNenhum produto foi cadastrado!")
    } else {
        println("\n--------------- PRODUTOS CADASTRADOS ---------------")
        println("-----Bebida-----")
        produtosCadastrados.filterIsInstance<Bebida>().forEach { produto: Produto -> produto.mostrarDetalhes() }

        println("\n-----Comida-----")
        produtosCadastrados.filterIsInstance<Comida>().forEach { produto: Produto -> produto.mostrarDetalhes() }

        println("\n-----Higiene Pessoal-----")
        produtosCadastrados.filterIsInstance<HigienePessoal>().forEach { produto: Produto -> produto.mostrarDetalhes() }

        println("\n-----Limpeza-----")
        produtosCadastrados.filterIsInstance<Limpeza>().forEach { produto: Produto -> produto.mostrarDetalhes() }
    }
}