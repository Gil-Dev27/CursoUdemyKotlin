import java.lang.NullPointerException

fun main() {

    // ? OPERADOR SAFE CALL PARA INDICAR SE A VARIÁVEL SERÁ NULA OU NÃO;

    var nome: String?
    nome = null

    // ?: OPERADOR ELVIS SÓ SERA NULO SE A VARIÁVEL ANTERIOR FOR NULO TAMBEM E SERÁ REPRESENTADO POR UM SÍMBOLO;

    var a: Int?
    var b: Int
    a = null
    b = a ?: 0
    println("a vale: " + a)
    println("b vale: " + b)

    // !! OPERADOR NULLCHECK PERMITE QUE A OPERAÇAO SEJA RETRATADA E NAO PERMITE QUE O PROGRAMA DÊ ERRO;

    var c: Int?
    var d: Int = 0
    c = null

    try {
        d = c!!

    } catch (e: NullPointerException) {
        println("Tivemos um problemas as, estamos resolvendo!")

    } finally { // TRATAMENTO
        println("c vale: " + c)
        println("d vale: " + d)

    }
}

