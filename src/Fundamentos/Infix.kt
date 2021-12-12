package Fundamentos

class Person(val name: String) {
   infix fun isName(value: String): Boolean {
        return value == name
    }
}

infix fun Int.isHalfOf(value: Int) = value / 2 == this

fun main() {

// A FUNÇÃO "INFIX" PERMITE QUE SE ESCREVA COMO NO EXEMPLO ABAIXO, PORÉM, ELA SÓ ACEITA 1 PARAMETRO;

    10.isHalfOf(40)
    10 isHalfOf 30 // Ex.

    val p1: Person = Person("Vinicius")
    p1.isName("Vinicius")
    p1 isName "Vinicius"
}