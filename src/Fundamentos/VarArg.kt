package Fundamentos

//  VARARG SE PARECE COM UMA LISTA, PORÉM, ENTRA EM PARAMETROS
//    PARA QUE NAO SEJA NECESSÁRIOS ESCREVER VÁRIAS VARIÁVEIS COMO PARAMETROS

//fun media(n1: Float, n2: Float, n3 : Float, n4 : Float) {}

fun media(vararg notas: Float) {

    if (notas.isNotEmpty()) {
        var soma = 0f

        for(nota in notas) {
            soma += nota

        }

        println("A média é: ${soma / notas.size}")
    }
}

//NESSA CONFIG, EU ATRIBUO O RETORNO ANY, ACEITANDO QUANQUEL TIPO;
fun <T> media2 (vararg valores: T) { // E FICA DENTRO DE UM ARRAY;

    for(valor in valores) {
        println(valor)
    }
}

fun main() {

    media(5.6f, 8.7f, 9.6f, 8.2f)
    media(3.2f, 7.6f, 9f, 10f)

    media2("", 8, 5.9, 100000L, 0.3)
}