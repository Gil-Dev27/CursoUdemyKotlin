package POO.Heranca

 /*
     UMA CLASSE ABSTRATA NAO PODE SER INSTANCIADA, VOCE PODE DEFINIR METODOS() E IMPLEMENTA-LOS, MAS ELA DEVE SER HERDADA;
     GERALMENTE, CRIA-SE UMA CLASSE ABSTRATA QUANDO NÃO SE SABE EXATAMENTE PARA ONDE VAI AS IMPLEMENTAÇÕES, ENTÃO É USADO
     EM UMA CLASSE MAIS GENÉRICA;
 */

abstract class Mamifero(nome: String) {

    var peso: Float = 0f

    abstract fun falar()
    open fun dormir() {
        println("Zzzz!")
    }
}

// AS CLASSES QUE HERDAM OS COMPORTAMENTOS DA CLASSE ABSTRATA É QUE VÃO DEFINIR COMO VÃO FUNCIONAR;
class Cachorro(nome: String, peso: Float) : Mamifero(nome) {

    //O INIT IMEDIATAMENTE INICIA O CÓDIGO IMPLEMENTADO NELE;
    init {
//      peso = 100f // ou USAR O "THIS" PARA CHAMAR OUTRO CONSTRUTOR;
        this.peso = peso
    }

    override fun falar() {
        println("Au au au!")
    }
}

class Gato(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("Miau!")

    }
}

fun main() {

    var cao : Cachorro = Cachorro("Banche", 15f)
    println("Banche: ${cao.falar()}")

    var gato : Gato = Gato("Jussara")
    println("Jussara: ${gato.falar()}")
}