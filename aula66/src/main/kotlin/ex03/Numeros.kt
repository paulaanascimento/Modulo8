package ex03

class Numeros {
    fun informarMaiorNumero(numerosLista:List<Int>):Int{
        var maiorNumero = numerosLista.first()

        for(numero in numerosLista){
            if(numero > maiorNumero){
                maiorNumero = numero
            }
        }

        return maiorNumero
    }
}

fun main(){
    val listaNumeros = mutableListOf<Int>()
    for(i in 0 until 5){
        print("Digite o ${i+1}° número inteiro: ")
        listaNumeros.add(readln().toInt())
    }

    val numeros = Numeros()
    println("\nO maior número é ${numeros.informarMaiorNumero(listaNumeros)}")
}