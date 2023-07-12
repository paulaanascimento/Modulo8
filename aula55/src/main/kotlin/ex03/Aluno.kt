package ex03

class Aluno {
    companion object{
        private val notas = DoubleArray(4)

        fun informarNotas(){
            for(i in 0 until 4){
                do{
                    print("Digite a nota da prova ${i+1}: ")
                    val nota = readln().toDoubleOrNull()?:-1.0

                    if(nota < 0 || nota > 10){
                        println("\nNota inválida!\n")
                    } else {
                        notas[i] = nota
                    }
                }while (nota < 0 || nota > 10)
            }

            calcularMedia()
        }

        private fun calcularMedia(){
            println("\nMédia = ${notas.average()}")
        }
    }
}