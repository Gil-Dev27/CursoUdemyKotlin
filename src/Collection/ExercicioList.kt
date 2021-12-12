package Collection

import kotlin.math.roundToInt

data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())

data class Ingredients(val name: String, val quantity: Int)

fun main() {

    val data = listOf(
        Food(
            "Lasanha", 1200.0,
            listOf(
                Ingredients("Farinha", 1),
                Ingredients("Presunto", 5),
                Ingredients("Queijo", 1),
                Ingredients("Molho de Tomate", 2),
                Ingredients("Manjericão", 3)
            )
        ),
        Food("Panqueca", 500.0),
        Food("Omelete", 200.0),
        Food("Parmegiana", 700.0),
        Food("Sopa de Feijão", 300.0),
        Food(
            "Hamburguer",
            2000.0,
            listOf(
                Ingredients("Pão", 1),
                Ingredients("Hambuguer", 3),
                Ingredients("Queijo", 1),
                Ingredients("Catupiry", 1),
                Ingredients("Bacon", 3),
                Ingredients("Alface", 1),
                Ingredients("Tomate", 1)
            )
        )
    )
    // Tenho receitas na lista?
    println ("Tenho receitas? ${if (data.any()) "sim" else "não"}.")

    // Quantas receitas tenho na coleção?
    println ("Tenho ${data.count()} receitas.")

    // Tenho alguma receita de Lasanha?
    println ("Tenho receitas de Lasanha? ${if (data.any { it.name.contains("Lasanha") }) "sim" else "não"}.")

    // Quantas receitas de Lasanha?
    println ("Tenho ${data.count { it.name.contains("Lasanha") }} receitas de Lasanha.")

    // Qual a primeira e última receita?
    println ("A primeira receita é: ${data.first().name}.")
    println ("A última receita é: ${data.last().name}.")

    // Qual a soma de calorias?
    val sumCalories = data . sumBy { it.calories.roundToInt() }
    println("A soma de calorias é: $sumCalories")

    // Me dê as duas primeiras receitas
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.name}")
    }

    // Sei como fazer panqueca? E sushi?
    val knowPanqueke = data.filter { it.name == "Panqueca" }.any()
    println("Sei fazer panqueca? ${if (knowPanqueke) "sim" else "não"}")

    val knowSushi = data.filter { it.name == "Sushi" }.any()
    println("Sei fazer sushi? ${if (knowSushi) "sim" else "não"}")

    // Quais são as comidas com mais de 500 calorias?
    data.filter { it.calories > 500 }.forEach { println(it.name) }

    // Qual a receita mais calórica? E a menos calórica?
    val maisCal = data.maxByOrNull { it.calories }
    println("Mais calórica: ${maisCal?.name}")

    val menosCal = data.minByOrNull { it.calories }
    println("Menos calórica: ${menosCal?.name}")

    // Faça uma lista com o nome dos pratos
    data.map { it.name }

    // Qual a média de calor de todas as receitas?
    val media = data.map { it.calories }.average()
    println("A média de calorias é: $media.")

    // Lista de dados simples
    val listaInteiros = listOf(1, 2, 6, 67, 7, 3, 34, 56, 3, 3, 2, 5, 34, 2)
    println("Lista distinta: ${listaInteiros.distinct()}.")
    println("Máximo: ${listaInteiros.maxOrNull()}.")
    println("Mínimo: ${listaInteiros.minOrNull()}.")

    // Eliminar receitas com mesmo nome
    println(data.distinctBy { it.name })

    // Ordenar uma lista
    listaInteiros.sorted()
    listaInteiros.sortedDescending()

    // Inverter uma lista
    listaInteiros.reversed()
}