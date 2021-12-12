//If - Else em Kotlin é uma EXPRESSAO

// TUDO EM KOTLIN É UM OBJETO;

fun calculoIdade(idade : Int) {

    if (idade >= 18) {
        println("É maior de idade! :)")
    } else {
        println("É menor de idade! :(")
    }
}

fun main() {

    calculoIdade(18)
    calculoIdade(25)
    calculoIdade(12)
    calculoIdade(17)
}