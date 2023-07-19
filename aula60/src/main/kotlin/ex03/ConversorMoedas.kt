package ex03

import java.math.BigDecimal
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.system.exitProcess


fun main() {
    while (true){
        println("\n---------- BOAS VINDAS AO CONVERSOR DE MOEDAS ----------\n" +
                "\t1 - DOLAR AMERICANO\n" +
                "\t2 - DOLAR CANADENSE\n" +
                "\t3 - EURO\n" +
                "\t4 - LIBRA ESTERLINA")
        print("Digite o número correspondente ao tipo de moeda que deseja converter: ")

        try {
            when(readln().toIntOrNull()?:0){
                1 -> ConversaoMoedas.converter("americano")
                2 -> ConversaoMoedas.converter("canadense")
                3 -> ConversaoMoedas.converter("euro")
                4 -> ConversaoMoedas.converter("libra")
                else -> throw IllegalArgumentException("\nTipo de moeda inválido!")
            }
            continuar()
        } catch (exception:NumberFormatException){
            println(exception.message)
        } catch (exception:IllegalArgumentException){
            println(exception.message)
        }
    }
}

fun continuar(){
    while (true){
        println("\nDeseja fazer outra conversão?\n" +
                "\t1 - Sim\n" +
                "\t2 - Não")
        print("Digite o número correspondente a opção desejada: ")

        when(readln().toIntOrNull()?:0){
            1 -> return
            2 -> {
                exitProcess(0)
            }
            else -> println("Opção inválida!")
        }
    }
}

class ConversaoMoedas{
    companion object{
        fun converter(tipo:String){
            println("\n---------- CONVERTENDO MOEDA ----------")
            println("Esse programa apenas converter para Real(R$)\n")

            when(tipo){
                "americano" -> print("Digite, em dolar americano, o valor que deseja converter: ")
                "canadense" -> print("Digite, em dolar canadense, o valor que deseja converter: ")
                "euro" -> print("Digite, em euro, o valor que deseja converter: ")
                "libra" -> print("Digite, em libra, o valor que deseja converter: ")
            }

            val aux = readln()

            if(!aux.matches("""^-?\d+(\.\d+)?$""".toRegex())){
                throw NumberFormatException("\nPara moeda, o valor monetário deve ser um número decimal")
            }

            val valorParaConversao = BigDecimal(aux)

            if(valorParaConversao <= BigDecimal.ZERO){
                throw IllegalArgumentException("\nValor inválido, por favor, tente novamente")
            }

            when(tipo){
                "americano" -> {
                    val valorConvertido = valorParaConversao.multiply(BigDecimal.valueOf(4.19))
                    println("\nO dolar americano na cotação de hoje ${dataAtual()} está em R$4.19, o valor que pediu para converter de US$$valorParaConversao em reais é R$ $valorConvertido")
                }
                "canadense" -> {
                    val valorConvertido = valorParaConversao.multiply(BigDecimal.valueOf(3.64))
                    println("\nO dolar canadense na cotação de hoje ${dataAtual()} está em R$3.64, o valor que pediu para converter de C$$valorParaConversao em reais é R$ $valorConvertido")
                }
                "euro" -> {
                    val valorConvertido = valorParaConversao.multiply(BigDecimal.valueOf(5.37))
                    println("\nO euro na cotação de hoje ${dataAtual()} está em R$5.37, o valor que pediu para converter de $valorParaConversao€ em reais é R$ $valorConvertido")
                }
                "libra" -> {
                    val valorConvertido = valorParaConversao.multiply(BigDecimal.valueOf(6.19))
                    println("\nA libra esterlina na cotação de hoje ${dataAtual()} está em R$6.19, o valor que pediu para converter de £$valorParaConversao em reais é R$ $valorConvertido")
                }
            }
        }

        private fun dataAtual():String{
            val data = LocalDate.now()
            val dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyy")
            return data.format(dataFormatada)
        }
    }
}