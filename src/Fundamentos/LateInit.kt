package Fundamentos

class Pessoa {

    // INICIO TARDÍO;
    lateinit var nome : String

    fun geradorDeNome() {
        nome = "Vinicius Gil"
    }
}

fun main() {

    val p = Pessoa()
    p.geradorDeNome()
}