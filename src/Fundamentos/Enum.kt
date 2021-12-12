package Fundamentos

enum class Prioridades {
    BAIXO, MEDIA, ALTA
}

enum class Prioridade2(val id: Int) {
    BAIXO(1) {
        override fun toString(): String {
            return "SUPER BAIXA!!!"
        }
    },
    MEDIA(5), ALTA(10)
}

class Alarme(var desc: String, p: Prioridade2)

fun main() {

    println(Prioridades.BAIXO)
    println(Prioridades.MEDIA)
    println(Prioridades.ALTA)

    println(Prioridade2.BAIXO.id)
    println(Prioridade2.MEDIA.id)
    println(Prioridade2.ALTA.id)

    //Alarme("Aviso!", Prioridade2.ALTA)

    for (p in Prioridade2.values()) {
        println("$p - ${p.id} - ${p.ordinal}")// .ordinal = posição;
    }
}
//  for (p in Prioridade2.values()) {
//      if (p.toString() == "MEDIA") {
//            println("Esse é real!")
//      }
//       println("$p - ${p.id} - ${p.ordinal}")// .ordinal = posição;
//     }