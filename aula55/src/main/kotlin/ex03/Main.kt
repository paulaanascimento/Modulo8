package ex03

fun main() {
    Aluno.informarNotas()

    var opcao:Int
    while (true){
        println( "\nDeseja realizar um novo calculo?\n"+
                "\t1 - Sim\n" +
                "\t2 - Não\n")

        print("Digite o número referente a opção desejada: ")
        opcao = readln().toIntOrNull()?:0
        println()
        when(opcao){
            1 -> Aluno.informarNotas()
            2 -> break
            else -> println("Opção Inválida!")
        }
    }
}