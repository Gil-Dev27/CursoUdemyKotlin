package Collection

fun operator(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    val ret = op(x, y)
    return ret
}

fun sum(x: Int, y: Int) = x + y

fun multiply(x: Int, y: Int) = x * y

fun <T> Iterable<T>.paraCada(op: (T) -> Unit) {
    for (i in this) {
        op(i)
    }
}

//fun <T> List<T>.paraCada(op: (T) -> Unit) {
//    for (i in this) {
//        op(i)
//    }
//}

fun main() {
    val list = listOf(1, 2, 3, 4)
    list.forEach { println(it) }
    list.paraCada { println(it) }

    val strList = listOf("", "", "", "")
    strList.paraCada{ println(it) }

    val map = mapOf(Pair("Paris", "França"))
    map.values.paraCada { println(it) }

    operator(1, 2, ::sum)
    operator(1, 2, ::multiply)


    // LAMBDAS

    val l1 = { a: Int, b: Int -> a + b }
    val l2: (Int, Int) -> Int = { u, i -> u + i }

    operator(1, 20, l1)
    operator(1, 20, l2)
//  operator(10, 20,  { a, b -> a + b })
}