package ex06

abstract class Peca (private var marca:String, private var modelo:String){
    abstract fun retirada()

    fun mostrarInformacoes(){
        println("\nMarca: $marca\n" +
                "Modelo: $modelo")
    }
}