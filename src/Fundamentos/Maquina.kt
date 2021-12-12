package Fundamentos

class Maquina(var marca: String) {
    //  MONTANDO GET/SET MANUALMENTE E O USO DO FIELD;

    var nucleos: Int = 0
        get() {
            println("Get chamado!")
            return field

        } set(value) {
        println("Set chamado")
        field = value
    }

    fun ligar() {

    }

    fun processar() {

    }

    fun desligar() {

    }
}

fun main() {

    var m = Maquina("xpto")
    println(m.nucleos)
    m.nucleos

    // USANDO WITH PARA USO DE METODOS NA MESMA VARIAVEL DENTRO DA MESMA CLASSE;
    m.ligar()
    m.processar()
    m.desligar()

    with(m) {
        ligar()
        processar()
        desligar()
    }
}