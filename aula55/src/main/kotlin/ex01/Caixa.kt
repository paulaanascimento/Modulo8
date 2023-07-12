package ex01

class Caixa {
    private val listaProdutos = ArrayList<Produto>()

    fun cadastrarProdutos(){
        var quantidade:Int

        println("----------Cadastrando Produtos----------")

        do{
            print("Digite a quantidade de produtos que deseja cadastrar: ")
            quantidade = readln().toIntOrNull()?:0

            if(quantidade <= 0){
                println("\nQuantidade inválida!\n")
            } else{
                for(i in 1..quantidade){
                    var nome:String
                    var valor:Double
                    var estoque:Int

                    do{
                        print("\nDigite o nome do $i° produto: ")
                        nome = readln()

                        if(nome.isBlank()){
                            println("\nPor favor, digite um nome para o produto!")
                        } else if(listaProdutos.any { it.nome.equals(nome, ignoreCase = true) }){
                            println("\nProduto já cadastrado!")
                            return
                        }
                    }while (nome.isBlank())

                    do {
                        print("Digite o valor unitário do $i° produto: ")
                        valor = readln().toDoubleOrNull()?:0.0

                        if(valor <= 0.0){
                            println("\nPor favor, digite um valor válido\n")
                        }
                    }while(valor <= 0.0)

                    do{
                        print("Digite a quantidade de estoque do $i° produto: ")
                        estoque = readln().toIntOrNull()?:0

                        if(estoque <= 0){
                            println("\nPor favor, digite uma quantidade de estoque válida\n")
                        }
                    }while (estoque <= 0)

                    listaProdutos.add(Produto(nome, valor, estoque))
                }
            }
        }while(quantidade <=0)
    }

    fun cadastrarProdutoLista(produtos:ArrayList<Produto>){
        for(produto in produtos){
            listaProdutos.add(produto)
        }
    }

    fun exibirProdutosCadastrados(){
        if(listaProdutos.isEmpty()){
            println("\nNenhum produto foi cadastrado!")
        } else {
            println("\n----------Produtos Cadastrados----------")
            for(i in 0 until listaProdutos.size){
                println("${i+1} - ${listaProdutos[i]}")
            }
        }
    }

    fun exibirValorTotalProdutosCadastrados(){
        var total = 0.0

        listaProdutos.forEach { produto: Produto -> total += produto.valor * produto.quantidade }

        println("\n----------Valor Total dos Produtos----------\n" +
                "O valor total do estoque é $total")
    }

    fun adicionarProdutoCarrinho(carrinho: ArrayList<Produto>) {
        exibirProdutosCadastrados()
        var escolha: Int
        do {
            print("\nDigite o número do produto que deseja adicionar: ")
            escolha = readln().toIntOrNull() ?: 0
            if (escolha <= 0 || escolha > listaProdutos.size) {
                println("\nOpção inválida!")
            } else {
                val produto = listaProdutos[escolha - 1]
                var quantidade: Int
                do {
                    print("Digite a quantidade que deseja comprar: ")
                    quantidade = readln().toIntOrNull() ?: 0
                    if (quantidade <= 0) {
                        println("\nQuantidade inválida!\n")
                    } else if (quantidade > produto.quantidade) {
                        println("\nQuantidade indisponível!\n")
                    } else {
                        carrinho.add(Produto(produto.nome, produto.valor, quantidade))
                        produto.quantidade -= quantidade
                        println("Produto adicionado ao carrinho!")
                        return
                    }
                } while (quantidade <= 0 || quantidade > produto.quantidade)
            }
        } while (escolha <= 0 || escolha > listaProdutos.size)
    }

    fun removerProdutoCarrinho(carrinho: ArrayList<Produto>) {
        if(carrinho.isEmpty()){
            println("\nNenhum produto foi adicionado ao carrinho!")
        } else {
            println("\n----------Carrinho----------")
            for(i in 0 until carrinho.size){
                println("${i+1} - ${carrinho[i]}")
            }

            var escolha: Int
            do {
                print("\nDigite o número do produto que deseja remover: ")
                escolha = readln().toIntOrNull() ?: 0
                if (escolha <= 0 || escolha > carrinho.size) {
                    println("Opção inválida!")
                } else {
                    val produto = carrinho[escolha - 1]
                    var quantidade: Int
                    do {
                        print("Digite a quantidade que deseja devolver: ")
                        quantidade = readln().toIntOrNull() ?: 0
                        if (quantidade <= 0) {
                            println("Quantidade inválida!")
                        } else if (quantidade > produto.quantidade) {
                            println("Quantidade maior do que a que está no carrinho!")
                        } else if(quantidade == produto.quantidade) {
                            carrinho.remove(Produto(produto.nome, produto.valor, quantidade))
                        } else {
                            carrinho[escolha - 1] = Produto(produto.nome, produto.valor, produto.quantidade - quantidade)
                            for(i in listaProdutos){
                                if(i.nome == produto.nome){
                                    i.quantidade += quantidade
                                }
                            }
                            println("\nProduto removido do carrinho!")
                        }
                    } while (quantidade <= 0 || quantidade > produto.quantidade)
                }
            } while (escolha <= 0 || escolha > carrinho.size)
        }
    }

    fun finalizarCompra(carrinho: ArrayList<Produto>){
        println("----------Finalizando Compra----------")
        if(carrinho.isEmpty()){
            println("\nNenhum produto foi adicionado ao carrinho!")
        } else {
            for(i in 0 until carrinho.size){
                println("${i+1} - ${carrinho[i]}")
            }

            var total = 0.0
            carrinho.forEach { produto: Produto -> total += produto.valor * produto.quantidade }
            println("\nO valor total a ser pago é $total")

            carrinho.clear()
        }
    }

    fun exibirCarrinho(carrinho: ArrayList<Produto>){
        if(carrinho.isEmpty()){
            println("\nNenhum produto foi adicionado ao carrinho!")
        } else {
            println("\n----------Carrinho----------")
            for (i in 0 until carrinho.size) {
                println("${i + 1} - ${carrinho[i]}")
            }
        }
    }
}