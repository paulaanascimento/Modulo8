package ex05

fun main() {
    while(true) {
        println("\n---------- CONTROLE DE TURMA ----------\n" +
                "\t1 - Cadastrar aluno\n" +
                "\t2 - Listar todos os alunos\n" +
                "\t3 - Listar todos os alunos com o sobrenome informado\n" +
                "\t4 - Listar o nome do aluno mais idoso\n" +
                "\t5 - Listar a média de idade dos alunos\n" +
                "\t6 - Atualizar os dados de um aluno\n" +
                "\t7 - Remover os dados de um aluno\n" +
                "\t8 - Encerrar o programa")
        print("Digite o número referente a opção desejada: ")

        when(readln().toIntOrNull()?:0){
            1 -> Turma.cadastrarAluno()
            2 -> Turma.listarTodosAlunos()
            3 -> Turma.listarAlunosSobrenome()
            4 -> Turma.mostrarAlunoMaisIdoso()
            5 -> Turma.mediaIdade()
            6 -> Turma.atualizarDados()
            7 -> Turma.removerAluno()
            8 -> break
            else -> println("\nOpção Inválida!")
        }
    }
}