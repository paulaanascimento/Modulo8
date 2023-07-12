package ex01

class Produto(internal var nome:String, internal var valor:Double, internal var quantidade:Int) {

    override fun toString(): String {
        return "Nome:'$nome', Valor:$valor, Quantidade:$quantidade"
    }
}