package Exercicios

fun countVowels(phrase: String, ) : Int {

    val vowels = "aeiou"
    var totalVowels = 0

    for(letter in phrase) {
        if(letter.lowercaseChar() in vowels) {
            totalVowels++
        }
    }
    return totalVowels
}

fun countConsonants(phrase: String) : Int {

    val consonants = "bcdfghjklmnpqrstvwxyz"
    var totalConsonants = 0

    for (letter in phrase) {
        if (letter.lowercaseChar() in consonants) {
            totalConsonants++
        }
    }
    return totalConsonants
}

fun countVowelsFilter(phrase: String) = phrase.filter {it.lowercaseChar() in "aeiou"}.length