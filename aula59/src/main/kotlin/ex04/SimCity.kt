package ex04

class SimCity {
    companion object{
        private val habitante = Habitante()

        fun cadastrar(){
            println("\n---------- CADASTRANDO HABITANTE ----------")
            var nome:String
            do {
                print("Digite o nome do habitante: ")
                nome = readln()

                if(nome == ""){
                    println("Entrada inválida!")
                }
            } while (nome == "")

            habitante.nome = nome

            var profissao:String
            do {
                print("Digite a profissão do habitante: ")
                profissao = readln()

                if(profissao == ""){
                    println("Entrada inválida!")
                }
            } while (profissao == "")

            habitante.profissao = profissao

            for(i in 0 until 12){
                var salario:Double
                do {
                    print("Digite o salário de $nome no ${i+1}ª mês do ano: ")
                    salario = readln().toDoubleOrNull()?:0.0

                    if(salario <= 0){
                        println("Entrada inválida!")
                    }
                } while (salario <= 0)

                habitante.salario[i] = salario
            }

            println("Habitante cadastrado com sucesso!")
        }

        fun mostrarInformacoes(){
            println("\n---------- INFORMAÇÕES CADASTRADAS ----------")
            if(habitante.nome == ""){
                println("Não há habitantes cadastrados!")
            } else {
                println("Nome: ${habitante.nome}\n" +
                        "Profissão: ${habitante.profissao}")
            }
        }

        fun mostrarSalarios(){
            println("\n---------- SALÁRIOS CADASTRADOS ----------")
            if(habitante.salario.isEmpty()){
                println("Salários não cadastrados!")
            } else {
                for(i in 0 until 12){
                    println("${i+1}º mês - ${habitante.salario[i]}")
                }
            }
        }

        fun calcularImposto(){
            println("\n---------- IMPOSTO DE CADA MÊS ----------")
            if (habitante.salario.isEmpty()){
                println("Salários não cadastrados!")
            } else {
                for(i in 0 until 12) {

                    val imposto = if (habitante.salario[i] <= 2000) {
                        0.0
                    } else if (habitante.salario[i] > 2000 && habitante.salario[i] < 3001) {
                        habitante.salario[i] * 0.08
                    } else if (habitante.salario[i] in 3001.0..4500.0) {
                        habitante.salario[i] * 0.18
                    } else habitante.salario[i] * 0.28

                    println("${i+1}º mês - $imposto")
                }
            }
        }
    }
}