package ex06.model

open class Conta (){
    protected open var saldo = 0.0

    open fun depositar(valor:Double){

    }

    open fun sacar(valor:Double){
        println("---------- Sacando ----------")
        if(valor > saldo){
            println("\nSaldo Insuficiente\n")
        } else {
            saldo -= valor
            consultarSaldo()
        }
    }

    open fun consultarSaldo(){
        println("\nSaldo Atual: $saldo\n")
    }
}