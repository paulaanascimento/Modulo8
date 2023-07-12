package ex06.model

class ContaPoupanca : Conta(){

    override fun depositar(valor:Double) {
        println("---------- Depositando ----------")
        while (true){
            println("O deposíto está sendo efetuado pelo dono da conta?\n" +
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
                    println("\nConta Poupança só pode receber depósito do dono!\n")
                    break
                }
                else -> println("\nOpção Inválida!\n")
            }
        }
    }
}