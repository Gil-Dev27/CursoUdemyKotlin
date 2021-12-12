package Fundamentos

/* A INTERFACE É PARECIDA COM A CLASSE ABSTRATA, PORÉM, ELA DEVE SER IMPLEMENTADA E VAI SER TIPO UM CONTRATO COM QUEM VAI
     HERDAR ESSA CLASSE;

   A INTERFACE NÃO ACEITA VALORES EM VARIÁVEIS: var numero : Int = 2;

   UMA CLASSE PODE RECEBER MAIS DE 1 INTERFACE;
*/

interface MaquinaZ {

    // var peso : Float

    fun ligar()
    fun desligar() {
        println("Desligando... OFF!")
    }
}



// O KOTLIN JA IMPLEMENTA SOZINHO A VARIÁVEL DESSA FORMA;
// USA-SE O OVERRIDE NAS FUNÇÕES DA CLASSE QUE RECEBE DA INTERFACE QUANDO PRECISAM DE UM COMPORTAMENTO ESPECÍFICO;

// class ComputadorZ(override var peso: Float) : MaquinaZ {

class ComputadorZ : MaquinaZ {
    override fun ligar() {
        println("To ligado!")
    }
}

fun main() {

    val c : ComputadorZ = ComputadorZ()
    c.ligar()
    c.desligar()

}

// EM CASO DE HERANÇA DE MAIS DE 1 INTERFACE;

interface interface1 {
    fun Ola() {
        println("Sou a Interface1!")
    }
}

interface interface2 {
    fun Ola() {
        println("Sou a Interface2!")
    }
}

class receptorInterface : interface1, interface2  {
    override fun Ola() {
        super<interface1>.Ola() // POR HERDAR 2 INTERFACES COM FUNÇOES PARECIDAS, O KOTLIN PEDE QUE VOCE ESPECIFÍQUE
        super<interface2>.Ola() //      QUAL SERÁ A FUNÇÃO QUE SERÁ UTILIZADA;
    }
}