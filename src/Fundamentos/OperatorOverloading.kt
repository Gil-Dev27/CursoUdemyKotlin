package Fundamentos

data class Fraction(val numerator: Int, val denominator: Int) {
    operator fun plus(add: Fraction): Fraction {
        return if (denominator == add.denominator) {
            Fraction(numerator + add.numerator, denominator)
        } else {
            val commun = denominator * add.denominator
            Fraction(((commun / denominator) * numerator) + ((commun / add.denominator) * add.numerator), commun)
        }
    }

    operator fun inc(): Fraction {
        return this
    }
}

fun main() {
// O OPERATOR PERMITE QUE SE POSSIVEL CALCULAR VALORES DE 2 INSTANCIAS;

    var f1: Fraction = Fraction(3,2)
    val f2: Fraction = Fraction(5,3)

    println(f1 + f2)
    f1++
}