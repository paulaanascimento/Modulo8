package ex02

import kotlin.system.exitProcess

fun main() {
    while (true){
        println("\n---------- LISTA DE COMPRAS ----------\n" +
                "\t1 - VERDURA\n" +
                "\t2 - LEGUME\n" +
                "\t3 - GRAO\n" +
                "\t4 - OUTROS")
        print("Digite o número correspondente ao tipo de alimento que deseja adicionar a lista: ")

        try {
            when(readln().toIntOrNull()?:0){
                1 -> Controle.adicionar("verdura")
                2 -> Controle.adicionar("legume")
                3 -> Controle.adicionar("graos")
                4 -> Controle.adicionar("outros")
                else -> throw IllegalArgumentException("\nTipo de alimento inválido!")
            }
            continuar()
        } catch (exception:NumberFormatException){
            println(exception.message)
        } catch (exception:IllegalArgumentException){
            println(exception.message)
        } catch (exception:UnsupportedOperationException){
            println(exception.message)
        }
    }
}

fun continuar(){
    while (true){
        println("\nDeseja adicionar outro alimento?\n" +
                "\t1 - Sim\n" +
                "\t2 - Não")
        print("Digite o número correspondente a opção desejada: ")

        when(readln().toIntOrNull()?:0){
            1 -> return
            2 -> {
                Controle.mostrarListas()
                exitProcess(0)
            }
            else -> println("Opção inválida!")
        }
    }
}

class Controle{
    companion object{
        private val listaVerduras = mutableListOf<String>()
        private val listaLegumes = mutableListOf<String>()
        private val listaGraos = mutableListOf<String>()
        private val listaOutros = mutableListOf<String>()

        fun adicionar(tipo:String){
            println("\n---------- ADICIONANDO ALIMENTO ----------")
            if(tipo == "verdura" || tipo == "graos"){
                var aux:String
                var quantidade:Double
                do{
                    print("Digite a quantidade em gramas: ")
                    aux = readln()

                    if(aux.isBlank()){
                        throw UnsupportedOperationException("\nNão é permitido inserir valor vazio")
                    }

                    if(!aux.contains(".") && tipo == "verdura"){
                        throw NumberFormatException("\nPara verdura, a quantidade deve ser informada com ponto!")
                    } else if(!aux.contains(".") && tipo == "graos"){
                        throw NumberFormatException("\nPara grãos, a quantidade deve ser informada com ponto!")
                    }

                    quantidade = aux.toDouble()

                    if(quantidade < 0){
                        println("\nNão é possível inserir números negativos!")
                    }
                }while (quantidade < 0)

                print("Digite o nome do alimento: ")
                val alimento = readln()

                if(alimento.isBlank()){
                    throw UnsupportedOperationException("\nNão é permitido inserir nome vazio!")
                }

                when(tipo){
                    "verdura" -> listaVerduras.add("$alimento - $quantidade g")
                    "graos" -> listaGraos.add("$alimento - $quantidade g")
                }
            } else {
                var aux:String
                var quantidade:Int
                do{
                    print("Digite a quantidade em unidades: ")
                    aux = readln()

                    if(aux.isBlank()){
                        throw UnsupportedOperationException("\nNão é permitido inserir valor vazio")
                    }

                    if(aux.contains(".") && tipo == "legume"){
                        throw NumberFormatException("\nPara legume, a quantidade deve ser informada em unidades inteiras!")
                    } else if(aux.contains(".") && tipo == "outros"){
                        throw NumberFormatException("\nPara outros, a quantidade deve ser informada em unidades inteiras!")
                    }

                    quantidade = aux.toInt()

                    if(quantidade < 0){
                        println("\nNão é possível inserir números negativos")
                    }
                }while (quantidade < 0)

                print("Digite o nome do alimento: ")
                val alimento = readln()

                if(alimento.isBlank()){
                    throw UnsupportedOperationException("\nNão é permitido inserir nome vazio!")
                }

                when(tipo) {
                    "legume" -> listaLegumes.add("$alimento - $quantidade unidades")
                    "outros" -> listaOutros.add("$alimento - $quantidade unidades")
                }
            }
        }

        fun mostrarListas(){
            println("\n---------- LISTA FINAL ----------")
            println("Verduras: $listaVerduras")
            println("A quantidade de alimentos do tipo verdura a ser comprada é: ${listaVerduras.size}\n")

            println("Legumes: $listaLegumes")
            println("A quantidade de alimentos do tipo legume a ser comprada é: ${listaLegumes.size}\n")

            println("Grãos: $listaGraos")
            println("A quantidade de alimentos do tipo grão a ser comprada é: ${listaGraos.size}\n")

            println("Outros: $listaOutros")
            println("A quantidade de alimentos do tipo outros a ser comprada é: ${listaOutros.size}")
        }
    }
}