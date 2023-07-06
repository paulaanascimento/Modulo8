package ex01

fun main() {
    val novoFuncionario = Funcionario("Luis", "Silva", 10.0, 25.50)
    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8.0)
    novoFuncionario.calcularSalario()

    val funcionarios = ArrayList<Funcionario>()
    funcionarios.add(Funcionario("Barbara", "Dias", 12.0, 25.50))
    funcionarios.add(Funcionario("Diogo", "Cunha", 9.0, 25.50))
    funcionarios.add(Funcionario("Kauã", "Barbosa", 15.0, 25.50))
    funcionarios.add(Funcionario("Giovanna", "Almeida", 12.0, 25.50))
    funcionarios.add(Funcionario("Matheus", "Cardoso", 10.5, 25.50))
    funcionarios.add(Funcionario("Nicolas", "Santos", 10.0, 25.50))
    funcionarios.add(Funcionario("Rebeca", "Pereira", 8.0, 25.50))
    funcionarios.add(Funcionario("Luís", "Ribeiro", 12.0, 25.50))
    funcionarios.add(Funcionario("Paulo", "Souza", 9.5, 25.50))
    funcionarios.add(Funcionario("Luana", "Silva", 15.0, 25.50))
    funcionarios.add(Funcionario("Sarah", "Azevedo", 6.0, 25.50))

    println("\n---------- LISTA DE FUNCIONÁRIOS ----------")
    funcionarios.forEach{funcionario -> println(funcionario.toString()) }
}