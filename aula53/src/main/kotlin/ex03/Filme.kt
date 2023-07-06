package ex03

class Filme(var titulo:String, var duracaoEmMinutos:Int) {

    fun exibirDuracaoEmHoras(){
        println("O filme '$titulo' possui ${duracaoEmMinutos/60} horas e ${duracaoEmMinutos%60} minutos de duração.")
    }
}