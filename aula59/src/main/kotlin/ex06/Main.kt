package ex06

fun main() {
    while(true) {
        println("\n---------- SaveTheRoupa S.A. ----------\n" +
                "\t1 - Guardar Peça\n" +
                "\t2 - Mostrar todas as peças\n" +
                "\t3 - Mostrar peças associadas a um ID\n" +
                "\t4 - Delvolver peças\n" +
                "\t5 - Encerrar o programa")
        print("Digite o número referente a opção desejada: ")

        when(readln().toIntOrNull()?:0){
            1 -> println("\nAS PEÇAS FORAM SALVAS COM O ID ${GuardaVolumes.guardarPecas(GuardaVolumes.cadastrarPecas())}")
            2 -> GuardaVolumes.mostrarPecas()
            3 -> {
                println("\n---------- MOSTRANDO PEÇAS POR ID ----------")
                var id:Int
                do{
                    print("Digite o ID: ")
                    id = readln().toIntOrNull()?:0

                    if(id <= 0){
                        println("Entrada inválida!")
                    }
                } while (id <= 0)

                GuardaVolumes.mostrarPecas(id)
            }
            4 -> {
                println("\n---------- DEVOLVENDO PEÇAS ----------")
                var id:Int
                do{
                    print("\nDigite o ID: ")
                    id = readln().toIntOrNull()?:0

                    if(id <= 0){
                        println("Entrada inválida!")
                    }
                } while (id <= 0)

                GuardaVolumes.devolverPecas(id)
            }
            5 -> break
            else -> println("\nOpção Inválida!")
        }
    }
}