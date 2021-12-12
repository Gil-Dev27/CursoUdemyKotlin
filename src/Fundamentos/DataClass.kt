package Fundamentos

// DATA CLASS SERVE PARA TRANSIÇÃO DE DADOS, COM PARAMETROS;

data class Triangulo(var area: Float)

class Quadrado(var area: Float)

class Parametro(var b: Boolean, var s: String, var i: Int)

fun teste(p: Parametro) {

}

fun main() {

    var q1 = Quadrado(10f)
    var q2 = Quadrado(10f)

    var t1 = Triangulo(10f)
    var t2 = Triangulo(10f)

    println(q1)
    println(q2)
    println(q1 == q2)

    println(t1)
    println(t2)
    println(t1 == t2)
}