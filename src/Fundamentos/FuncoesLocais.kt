package Fundamentos

import java.text.SimpleDateFormat
import java.util.*

fun log(str: String) {
    println(str)
}

fun top() {

    fun log(str: String) {
        val calendar = Calendar.getInstance()
        val formated = SimpleDateFormat("HH:mm:ss")
        println("$str - ${formated.format(calendar.time)}")
    }

    log("Inicio")
    Fundamentos.log("") //PARA ACESSAR A FUNÇÃO EXTERNA, USA-SE O "nomeDaPasta.funcao";

    val interval = 1..10000000
    var sum: Double = 0.0
    for (i in interval) {
        sum += 1 * 2 * 1
    }

    log("Fim")
}

fun main() {

    top()
    log("")
}