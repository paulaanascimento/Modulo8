package ex06.model

class ContaSalario : Conta() {
    override var saldo = 1212.0

    override fun depositar(valor:Double) {
        println("---------- Depositando ----------")
        while (true){
            println("O deposíto está sendo efetuado pela pessoa empregadora?\n" +
                    "\t1 - Sim\n" +
                    "\t2 - Não\n")
            print("Digite o número referente a opção desejada: ")

            when(readln().toIntOrNull()?:0){
                1 -> {
                    saldo += valor
                    consultarSaldo()
                    break
                }
                2 -> {
                    println("\nConta Salário só pode receber depósito do empregador!\n")
                    break
                }
                else -> println("\nOpção Inválida!\n")
            }
        }
    }
}