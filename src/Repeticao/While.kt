fun main() {

    // WHILE - ENQUANTO; RETORNA BOOLEAN;

    var index : Int = 0
    while (index < 100) {
        println("Vinicius")
        index++ // vai acrescentar +1 a cada repetiçao; sem el seria infinito
                // uma vez que o valor esá fixo;
        if (index == 20) {
            break
        }
    }
}