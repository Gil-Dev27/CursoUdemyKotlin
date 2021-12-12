fun calcularBonus2(cargo: String, salario: Float): Float {

    //EXERCICIO REFATORADO SIMPLIFICANDO O USO DO IF - ELSE

    // Gerente Júnior, Gerente Sênior, Coordenador;

//  val bonus = if (cargo == "Coordenador") {
    return if (cargo == "Coordenador") {
        salario * 1.2f
    } else if (cargo == "Gerente Júnior") {
        salario * 1.5f
    } else {
        salario * 2
    }
}

fun main() {

    println(calcularBonus2("Coordenador", 2500f))
    println(calcularBonus2("Gerente Júnior", 3500f))
    println(calcularBonus2("Gerente Sênior", 5000f))
}