package ex01

val caixa = Caixa()

fun main() {
    iniciar()

    var opcao:Int
    while (true){
        println( "\n--------------- MENU PRINCIPAL---------------\n"+
                "\t1 - Acessar Como Funcionário\n" +
                "\t2 - Acessar Como Cliente\n" +
                "\t3 - Sair\n")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0

        when(opcao){
            1 -> funcionario()
            2 -> cliente()
            3 -> break
            else -> println("Opção Inválida!")
        }
    }
}

fun funcionario(){
    var opcao:Int
    while (true){
        println( "\n--------------- MENU DO FUNCIONÁRIO ---------------\n"+
                "\t1 - Cadastrar Produtos\n" +
                "\t2 - Exibir Produtos Cadastrados\n" +
                "\t3 - Exibir Valor Total dos Produtos\n" +
                "\t4 - Voltar ao Menu Principal\n")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0

        when(opcao){
            1 -> caixa.cadastrarProdutos()
            2 -> caixa.exibirProdutosCadastrados()
            3 -> caixa.exibirValorTotalProdutosCadastrados()
            4 -> break
            else -> println("Opção Inválida!")
        }
    }
}

fun cliente(){
    val carrinho = ArrayList<Produto>()
    var opcao:Int
    while (true){
        println( "\n--------------- MENU DO CLIENTE ---------------\n"+
                "\t1 - Adicionar Produto ao Carrinho\n" +
                "\t2 - Remover Produto do Carrinho\n" +
                "\t3 - Exibir Carrinho\n" +
                "\t4 - Finalizar Compra\n" +
                "\t5 - Voltar ao Menu Principal\n")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0

        when(opcao){
            1 -> caixa.adicionarProdutoCarrinho(carrinho)
            2 -> caixa.removerProdutoCarrinho(carrinho)
            3 -> caixa.exibirCarrinho(carrinho)
            4 -> caixa.finalizarCompra(carrinho)
            5 -> return
            else -> println("Opção Inválida!")
        }
    }
}

fun iniciar(){
    val listaProdutos = ArrayList<Produto>()
    listaProdutos.add(Produto("Arroz", 20.0, 25))
    listaProdutos.add(Produto("Feijão", 10.0, 50))
    listaProdutos.add(Produto("Macarrão", 20.0, 15))
    listaProdutos.add(Produto("Óleo", 8.99, 35))
    listaProdutos.add(Produto("Azeite", 15.0, 30))

    caixa.cadastrarProdutoLista(listaProdutos)
}