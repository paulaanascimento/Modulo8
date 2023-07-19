package ex03

fun main() {
    while(true) {
        println("\n---------- APLICAÇÃO DE DICIONÁRIO ----------\n" +
                "\t1 - Adicionar um termo ao dicionário\n" +
                "\t2 - Procurar um termo no dicionário\n" +
                "\t3 - Listar todos os termos existentes em ordem alfabética\n" +
                "\t4 - Encerrar aplicação")
        print("Digite o número referente a opção desejada: ")

        when(readln().toIntOrNull()?:0){
            1 -> Dicionario.adicionarTermo()
            2 -> Dicionario.procutarTermo()
            3 -> Dicionario.listarTermosExistentes()
            4 -> break
            else -> println("\nOpção Inválida!")
        }
    }
}