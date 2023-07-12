package ex06.model

class ContaCorrente(override var saldo:Double) : Conta() {

    override fun sacar(valor: Double) {
        println("---------- Sacando ----------")
        saldo -= valor
        consultarSaldo()
    }

    override fun depositar(valor: Double) {
        println("---------- Depositando ----------")
        if (valor >= 5000){
            println("\nOperação inválida, procure a sua agência\n")
        } else {
            saldo += valor
            consultarSaldo()
        }
    }
}