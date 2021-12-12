package Classes

class Computer(val processorModel: String) {

    inner class Memory(val level : Int) {
        fun getMemmoryLevel() : Int {
            println(processorModel)
            return 70
        }
    }
}

fun main() {

    val m1: Computer.Memory = Computer("AMD").Memory(8)
    m1.getMemmoryLevel()
}