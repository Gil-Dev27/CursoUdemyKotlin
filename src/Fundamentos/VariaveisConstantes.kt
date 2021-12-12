package Fundamentos

class Constantes {
    companion object BANCO { // MÉTODO ESTÁTICO, NÃO MUDA, ELE É CONSTANTE; E NÃO É OBRIGATÓRIO UM NOME;
        val TABLE = "Pessoa"

        fun teste() {
            println("Sou um Método() Estático!")
        }
    }

    object VENDAS {
        val TABLE_NAME = "Vendas"

        object COLUNAS {
            val ID = "ID"
            val TOTAL = "Total"
        }
    }


}

fun main() {

    println(Constantes.TABLE)
    Constantes.teste()
    Constantes.BANCO.teste()

    Constantes.VENDAS
    Constantes.VENDAS.COLUNAS.TOTAL
}