fun calcularBonus3(cargo: String, salario: Float): Float {

    //EXERCICIO REFATORADO SIMPLIFICANDO O USO DO IF - ELSE

    // Gerente Júnior, Gerente Sênior, Coordenador;

    // USANDO WHEN - ENQUANTO
    return when (cargo) {
        "Coordenador" -> {
            salario * 1.2f
        }
        "Gerente Júnior" -> {
            salario * 1.5f
        }
        else -> {
            salario * 2
        }
    }
}

fun main() {

    println(calcularBonus3("Coordenador", 2500f))
    println(calcularBonus3("Gerente Júnior", 3500f))
    println(calcularBonus3("Gerente Sênior", 5000f))
}
