package Classes

class Car (val model: String, val maxSpeed: Int) {

    var currentSpeed: Int = 0
    set(value) {
        if (value > maxSpeed) {
            throw Exception("Velocidade maior do que  permitida!")
        } else {
            field = value
        }
    }

    get() {
        return field
    }
}

fun main() {

    val c1 = Car("", 220)
    c1.currentSpeed = 50
    println(c1.currentSpeed)
}