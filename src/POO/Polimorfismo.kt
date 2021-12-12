package POO

interface Funcionarios {
    fun calculaBonus() {

    }
}

class Gerente : Funcionarios {
    override fun calculaBonus() {
        println("Bonus = 500")
    }
}

class Tecnico : Funcionarios {
    override fun calculaBonus() {
        println("Bonus = 250")
    }
}

class Analista : Funcionarios {
    override fun calculaBonus() {
        println("Bonus = 350")
    }
}

fun main() {

    val g: Funcionarios = Gerente()
    val t: Funcionarios = Tecnico()
    val a: Funcionarios = Analista()

    calculo(g)
    calculo(t)
    calculo(a)
}

fun calculo(funcionarios: Funcionarios) {
    funcionarios.calculaBonus()
}