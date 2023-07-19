package ex04

fun main() {
    while(true) {
        println("\n---------- APLICAÇÃO DE IMPOSTO ----------\n" +
                "\t1 - Cadastrar habitante\n" +
                "\t2 - Mostrar informações cadastradas\n" +
                "\t3 - Mostrar salários cadastrados\n" +
                "\t4 - Calcular imposto de cada mês\n" +
                "\t5 - Encerrar o programa")
        print("Digite o número referente a opção desejada: ")

        when(readln().toIntOrNull()?:0){
            1 -> SimCity.cadastrar()
            2 -> SimCity.mostrarInformacoes()
            3 -> SimCity.mostrarSalarios()
            4 -> SimCity.calcularImposto()
            5 -> break
            else -> println("\nOpção Inválida!")
        }
    }
}