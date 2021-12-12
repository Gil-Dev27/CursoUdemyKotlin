fun main() {

    // For() - Para cada;
    // Laço de repetiçao

    val str : String = "Vinicius"
    str.length

    for (i in str) { // Character
        print("$i ")
    }

    for (n in 1..100) {
        print("$n ")
    }

    for (num in 0..100 step 2) { // de 2 em 2
        if (num != 90) { // Se for diferente != imprima, não imprime o numero na expressao;
            print("$num ")
        }
    }

    for (num2 in 100 downTo 0) {
        print("$num2 ")
    }
}
