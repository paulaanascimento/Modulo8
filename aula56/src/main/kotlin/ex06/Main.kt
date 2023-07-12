package ex06

import ex06.model.ContaCorrente
import ex06.model.ContaPoupanca
import ex06.model.ContaSalario

fun main() {
    println("---------- Conta Salário ----------")
    println("---------- Conta 1 ----------")
    val contaSalario1 = ContaSalario()
    contaSalario1.consultarSaldo()
    contaSalario1.depositar(1212.0)
    contaSalario1.sacar(1500.0)

    println("---------- Conta 2 ----------")
    val contaSalario2 = ContaSalario()
    contaSalario2.consultarSaldo()
    contaSalario2.depositar(500.0)
    contaSalario2.sacar(1000.0)

    println("---------- Conta Poupança ----------")
    println("---------- Conta 1 ----------")
    val contaPoupanca1 = ContaPoupanca()
    contaPoupanca1.consultarSaldo()
    contaPoupanca1.depositar(2000.0)
    contaPoupanca1.sacar(1500.0)

    println("---------- Conta 2 ----------")
    val contaPoupanca2 = ContaPoupanca()
    contaPoupanca2.consultarSaldo()
    contaPoupanca2.depositar(2000.0)
    contaPoupanca2.sacar(1500.0)

    println("--------- Conta Corrente ----------")
    println("---------- Conta 1 ----------")
    val contaCorrente1 = ContaCorrente(1000.0)
    contaCorrente1.consultarSaldo()
    contaCorrente1.depositar(5000.0)
    contaCorrente1.sacar(2000.0)

    println("---------- Conta 2 ----------")
    val contaCorrente2 = ContaCorrente(100.0)
    contaCorrente2.consultarSaldo()
    contaCorrente2.depositar(4999.0)
    contaCorrente2.sacar(1500.0)
}