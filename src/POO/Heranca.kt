package POO

open class Maquina(var marca: String) { // OPEN PERMITE QUE A FUNÇÃO SEJA HERDADA;
    fun minhaMarca() {
        println("Minha marca é: $marca")
    }
}

class Computador(marca: String, var nucleos: Int) : Maquina(marca) {
    fun ligar() {}
    fun desligar() {}
}

fun main() {

    val c : Computador = Computador("G-Fire", 16)
    with(c) {
        ligar()
        desligar()
        minhaMarca()
    }
}