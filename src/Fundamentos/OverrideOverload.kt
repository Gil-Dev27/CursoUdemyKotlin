package Fundamentos

open class MaquinaTeste(var marca: String) { // OPEN PERMITE QUE A FUNÇÃO SEJA HERDADA;
    open fun minhaMarca() { // OPEN PERMITE QUE A FUNÇÃO PASSE POR OVERRIDE;
        println("Minha marca é: $marca")
    }
}

// MODIFICADOR DE VISIBILIDADE: PUBLIC E PRIVATE, QUE PARA QUE SEJAM USUAIS, DEVEM SER HERDADAS;
class Computador(marca: String, var nucleos: Int) : MaquinaTeste(marca) {

    override fun minhaMarca() {
        "Estou mudando minha marca"
    }

    fun ligar() {}
    fun desligar() {}
}

    //Sobrecarga: METODOS COM MESMO NOME MAS, COM ASSINATURAS DIFERENTES;
    fun overload(i: Int) = println("Primeiro OverLoad!")
    fun overload(i: Int, s: String) = println("Segundo OverLoad!")
    fun overload(i: Int, s: String, f: Float) = println("Terceiro OverLoad!")

fun main() {

    val c : Computador = Computador("G-Fire", 16)
    with(c) {
        ligar()
        desligar()
        minhaMarca()

        overload(12)
        overload(16, "Meu Overload!")
        overload(10, "Meu segundo Overload", 15.4f)
    }
}