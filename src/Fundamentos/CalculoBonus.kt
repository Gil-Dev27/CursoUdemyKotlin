fun calcularBonus(cargo: String, salario: Float): Float {

    // Gerente Júnior, Gerente Sênior, Coordenador;

    val bonus : Float

    if (cargo == "Coordenador") {
        bonus =  salario * 1.2f
    } else if (cargo == "Gerente Júnior") {
        bonus = salario * 1.5f
    } else {
        bonus = salario * 2
    }
    return bonus
}

fun main() {

    println(calcularBonus("Coordenador", 2500f))
    println(calcularBonus("Gerente Júnior", 3500f))
    println(calcularBonus("Gerente Sênior", 5000f))
}