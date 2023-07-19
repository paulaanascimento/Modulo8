package ex05

class Turma {
    companion object{
        private val alunosCadastrados = mutableMapOf<String, Aluno>()

        fun cadastrarAluno(){
            println("\n---------- CADASTRANDO ALUNO ----------")

            var matricula:String
            do {
                print("Digite a matrícula do aluno: ")
                matricula = readln()

                if(matricula == ""){
                    println("Entrada inválida!")
                } else if(alunosCadastrados.contains(matricula)){
                    println("\nMatrícula já cadastrada!")
                    return
                }
            } while (matricula == "")

            var nome:String
            do {
                print("Digite o nome completo do aluno: ")
                nome = readln()

                if(nome == ""){
                    println("Entrada inválida!")
                }
            } while (nome == "")

            var data:String
            do {
                print("Digite a data de nascimento do aluno (dd/mm/aaaa): ")
                data = readln()

                if(data == ""){
                    println("Entrada inválida!")
                } else if (!Aluno.validardata(data)){
                    println("Data inválida!")
                }
            } while (data == "" || !Aluno.validardata(data))

            var sexo:Char
            do {
                print("Digite o sexo do aluno (M/F): ")
                 sexo = readln().uppercase().first()

                if((sexo != 'F' && sexo != 'M')) {
                    println("Entrada inválida!")
                }
            } while ((sexo != 'F' && sexo != 'M'))

            alunosCadastrados[matricula] = Aluno(matricula, nome, data, sexo)
            println("\nAluno cadastrado com sucesso!")
        }

        fun listarTodosAlunos(){
            println("\n---------- LISTANDO ALUNOS CADASTRADOS ----------")
            if(alunosCadastrados.isEmpty()){
                println("\nNenhum aluno foi cadastrado!")
            } else {
                for(aluno in alunosCadastrados){
                    aluno.value.mostrarDados()
                }
            }
        }

        fun listarAlunosSobrenome(){
            println("\n---------- BUSCAR ALUNOS PELO SOBRENOME ----------")
            var sobrenome:String
            do{
                print("\nDigite o sobrenome que deseja buscar: ")
                sobrenome = readln()

                if(sobrenome ==""){
                    println("Entrada inválida!")
                }
            } while (sobrenome =="")

            val alunosEncontrados = alunosCadastrados.values.filter { it.nome.contains(sobrenome, ignoreCase = true) }
            if(alunosEncontrados.isEmpty()){
                println("\nNão alunos com o sobrenome $sobrenome!")
            } else {
                println("\n---------- ALUNOS COM SOBRENOME ${sobrenome.uppercase()} ----------")
                for(aluno in alunosEncontrados){
                    aluno.mostrarDados()
                }
            }
        }

        fun mostrarAlunoMaisIdoso(){
            if(alunosCadastrados.isEmpty()){
                println("\nNenhum aluno foi cadastrado!")
            } else {
                val maisIdoso = alunosCadastrados.values.maxByOrNull { it.calcularIdade() }
                println("\n---------- ALUNO MAIS VELHO ----------\n" +
                        "O aluno mais idoso se chama ${maisIdoso?.nome}")
            }
        }

        fun mediaIdade(){
            var soma = 0

            if(alunosCadastrados.isEmpty()){
                println("\nNenhum aluno foi cadastrado!")
            } else {
                for(aluno in alunosCadastrados){
                    soma += aluno.value.calcularIdade()
                }
                println("\n---------- MÉDIA DAS IDADES ----------\n" +
                "A média das idades dos alunos é ${soma/ alunosCadastrados.size}")
            }
        }

        fun atualizarDados(){
            println("\n---------- ATUALIZANDO DADOS ----------")
            var matricula:String
            do {
                print("Digite a matrícula do aluno: ")
                matricula = readln()

                if(matricula == ""){
                    println("Entrada inválida!")
                }

            } while (matricula == "")

            if (alunosCadastrados.contains(matricula)){
                val aluno = alunosCadastrados[matricula]
                println()
                aluno?.mostrarDados()

                println("Qual dado deseja atualizar?\n" +
                        "\t1 - Nome\n" +
                        "\t2 - Data de Nascimento\n" +
                        "\t3 - Sexo")
                print("Digite o número referente a opção desejada: ")

                when(readln().toIntOrNull()?:0){
                    1 -> {
                        var nome:String
                        do {
                            print("Digite o nome completo do aluno: ")
                            nome = readln()

                            if(nome == ""){
                                println("Entrada inválida!")
                            }
                        } while (nome == "")
                        alunosCadastrados[matricula]?.nome = nome
                    }

                    2 -> {
                        var data:String
                        do {
                            print("Digite a data de nascimento do aluno (dd/mm/aaaa): ")
                            data = readln()

                            if(data == ""){
                                println("Entrada inválida!")
                            } else if (!Aluno.validardata(data)){
                                println("Data inválida!")
                            }
                        } while (data == "" || !Aluno.validardata(data))
                        alunosCadastrados[matricula]?.dataNascimento = data
                    }

                    3 -> {
                        var sexo:Char
                        do {
                            print("Digite o sexo do aluno (M/F): ")
                            sexo = readln().uppercase().first()

                            if((sexo != 'F' && sexo != 'M')) {
                                println("Entrada inválida!")
                            }
                        } while ((sexo != 'F' && sexo != 'M'))
                        alunosCadastrados[matricula]?.sexo = sexo
                    }

                    else -> println("\nOpção inválida!")
                }

                println("\nDados atualizados com sucesso!")

            } else println("\nMatrícula não encontrada!")
        }

        fun removerAluno(){
            println("\n---------- REMOVENDO ALUNO ----------")
            var matricula:String
            do {
                print("Digite a matrícula do aluno: ")
                matricula = readln()

                if(matricula == ""){
                    println("Entrada inválida!")
                }

            } while (matricula == "")

            if (alunosCadastrados.contains(matricula)){

                alunosCadastrados.remove(matricula)
                println("Aluno removido com sucesso!")

            } else println("\nMatrícula não encontrada!")
        }
    }
}