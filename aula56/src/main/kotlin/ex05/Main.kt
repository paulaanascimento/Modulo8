package ex05

import ex05.model.*

fun main() {
    val animais = ArrayList<Animal>()

    animais.add(Cachorro("Max", "Labrador", Responsavel("Jéssica")))
    animais.add(Cachorro("Megan", "Poodle", Responsavel("Pedro")))

    animais.add(Gato("Perllo", "Vira-Lata" , Responsavel("Guilherme")))
    animais.add(Gato("Luna", "Persa", Responsavel("Lara")))

    animais.add(Peixe("Nemo", "Palhaço", Responsavel("Mirella")))
    animais.add(Peixe("Dory", "Tang", Responsavel("João")))

    for(animal in animais){
        animal.movimentar()
        animal.comer()
        animal.dormir()
        println()
    }
}