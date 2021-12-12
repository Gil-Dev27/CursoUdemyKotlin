package Collection

fun operator2(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    val ret = op(x, y)
    return ret
}

fun semNome(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun main() {

    operator2(1, 2, fun(n1: Int, n2: Int): Int {
        val sum = n1 + n2
        println(sum)
        return sum
    })

    operator2(1, 2, ::semNome)
}