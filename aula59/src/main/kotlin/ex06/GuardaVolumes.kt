package ex06

class GuardaVolumes {
    companion object{
        private val dicionario = mutableMapOf<Int, ArrayList<Peca>>()
        private var contador = 0

        fun guardarPecas(listaDePeca:ArrayList<Peca>):Int{
            contador++
            dicionario[contador] = listaDePeca
            return contador
        }

        fun mostrarPecas(){
            if(dicionario.isEmpty()){
                println("\nO dicionário está vazio!")
            } else {
                for((id, listaPecas) in dicionario){
                    println("\n------ ID $id -------")
                    for(peca in listaPecas){
                        peca.mostrarInformacoes()
                    }
                }
            }
        }

        fun mostrarPecas(numero:Int){
            if(dicionario[numero] != null){
                println("\n------ ID $numero -------")
                for(peca in dicionario[numero]!!){
                    peca.mostrarInformacoes()
                }
            } else println("\nNão há peças associadas ao número informado!")
        }

        fun devolverPecas(numero:Int){
            if(dicionario.contains(numero)){
                dicionario.remove(numero)
                println("\nPeças devolvidas com sucesso!")
            } else println("\nNão há peças associadas ao número informado!")
        }

        fun cadastrarPecas() : ArrayList<Peca> {
            println("\n---------- GUARDANDO PEÇAS ----------")

            val pecas = ArrayList<Peca>()

            var quantidade:Int
            do{
                print("Digite a quantidade de peças: ")
                quantidade = readln().toIntOrNull()?:0

                if(quantidade <= 0){
                    println("Entrada inválida!")
                }
            }while (quantidade <= 0)

            for(i in 0 until quantidade){
                var marca:String
                do{
                    print("\nDigite a marca da ${i+1}º peça: ")
                    marca = readln()

                    if(marca == ""){
                        println("Entrada inválida!")
                    }
                } while (marca == "")

                var modelo:String
                do{
                    print("Digite o modelo da ${i+1}º peça: ")
                    modelo = readln()

                    if(modelo == ""){
                        println("Entrada inválida!")
                    }
                } while (modelo == "")

                pecas.add(Roupa(marca, modelo))
            }

            return pecas
        }
    }
}