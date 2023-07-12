package ex04

import ex04.model.Aprendiz
import ex04.model.Estagiario
import ex04.model.Funcionario
import ex04.model.Gestor


val funcionarios = ArrayList<Funcionario>()

fun main(){
    var opcao:Int
    while (true){
        println( "\n--------------- MENU ---------------\n"+
                "\t1 - Registrar Funcionario\n" +
                "\t2 - Mostrar Funcionarios Cadastrados\n" +
                "\t3 - Sair")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0

        when(opcao){
            1 -> registrarFuncionario()
            2 -> mostrarFuncionariosCadastrados()
            3 -> break
            else -> println("\nOpção Inválida!")
        }
    }
}


fun registrarFuncionario() {
    var opcao:Int
    while (true){
        println( "\n--------------- REGISTRANDO FUNCIONARIO ---------------\n"+
                "\t1 - Aprendiz\n" +
                "\t2 - Estagiário\n" +
                "\t3 - Gestor\n" +
                "\t4 - Voltar")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0

        lateinit var nome:String
        lateinit var setor:String
        var salario = 0.0
        lateinit var dataAdmissao:String

        if(opcao!=4 && opcao > 0 && opcao <4){

            do{
                print("Digite o nome do funcionário: ")
                nome = readln()

                if(nome == ""){
                    println("\nInforme o nome completo do funcionário!\n")
                }
            }while (nome == "")

            do{
                print("Digite o setor em que o funcionário trabalha: ")
                setor = readln()

                if(setor == ""){
                    println("\nInforme o setor!\n")
                }
            }while (setor == "")

            do{
                print("Digite o salário do funcionário: ")
                salario = readln().toDoubleOrNull()?:0.0

                if(salario <= 0){
                    println("\nInforme o salário!\n")
                }
            }while (salario <= 0)

            do{
                print("Digite a data de admissão do funcionário: ")
                dataAdmissao = readln()

                if(dataAdmissao == ""){
                    println("\nInforme o salário!\n")
                }
            }while (dataAdmissao == "")
        }

        when(opcao){
            1 -> funcionarios.add(Aprendiz(nome, setor, salario, dataAdmissao))
            2 -> funcionarios.add(Estagiario(nome, setor, salario, dataAdmissao))
            3 -> funcionarios.add(Gestor(nome, setor, salario, dataAdmissao))
            4 -> break
            else -> println("\nOpção Inválida!")
        }
    }
}

fun mostrarFuncionariosCadastrados() {
    if (funcionarios.isEmpty()){
        println("\nNenhum funcionário foi cadastrado!")
    } else {
        println("\n--------------- FUNCIONÁRIOS CADASTRADOS ---------------")
        println("-----Aprendiz-----")
        funcionarios.filterIsInstance<Aprendiz>().forEach { funcionario: Funcionario -> funcionario.mostrarDetalhes() }

        println("\n-----Estagiário-----")
        funcionarios.filterIsInstance<Estagiario>().forEach { funcionario: Funcionario -> funcionario.mostrarDetalhes() }

        println("\n-----Gestor-----")
        funcionarios.filterIsInstance<Gestor>().forEach { funcionario: Funcionario -> funcionario.mostrarDetalhes() }
    }
}