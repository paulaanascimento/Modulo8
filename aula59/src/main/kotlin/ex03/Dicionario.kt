package ex03

class Dicionario {
    companion object{
        private val dicionario = mutableMapOf<String, String>()

        fun adicionarTermo(){
            println("\n---------- ADICIONANDO TERMO ----------")
            do{
                print("Digite a palavra que deseja adicionar ao dicionário: ")
                val palavra = readln()

                if(palavra == ""){
                    println("Entrada inválida!")
                } else if(dicionario.contains(palavra)){
                    println("\nA palavra já está no dicionário.")
                } else {
                    do {
                        print("Agora digite o significado de $palavra: ")
                        val significado = readln()

                        if(significado == "") {
                            println("Entrada inválida!")
                        } else dicionario[palavra] = significado
                    }while (significado == "")
                }
            } while (palavra == "")
        }

        fun procutarTermo(){
            println("\n---------- PROCURANDO TERMO ----------")
            do{
                print("Digite o termo que deseja procurar: ")
                val termo = readln()

                if(termo == ""){
                    println("Entrada inválida!")
                } else if(dicionario.contains(termo)){
                    println("\n$termo - ${dicionario[termo]}")
                } else println("\nEsse termo ainda não foi adicionado ao dicionário.")

            } while (termo == "")
        }

        fun listarTermosExistentes(){
            if(dicionario.isEmpty()){
                println("\nO dicionário está vazio!")
            } else {
                println("\n---------- LISTANDO TERMOS DO DICIONÁRIO ----------")
                val ordemAlfabetica = dicionario.toSortedMap()
                for(palavra in ordemAlfabetica){
                    println("${palavra.key} - ${palavra.value}")
                }
            }
        }
    }
}