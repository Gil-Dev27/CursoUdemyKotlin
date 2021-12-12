package Exercicios

fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reverse().toString()
//  return "BSniltok"
}

fun reverseUsingLoop(str: String): String {

    var sbPhrase = StringBuilder()
    var i = str.length - 1 // para a String ser contada a partir do 0
//  return "pooLniltok"

    while (i >= 0) {
        sbPhrase.append(str[i])
        i--
    }
    return sbPhrase.toString()
}