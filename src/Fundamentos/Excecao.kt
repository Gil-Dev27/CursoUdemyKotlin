import java.lang.Exception
import java.lang.NumberFormatException

fun main() {

//  println("asdgas".toInt()) // VAI GERAR UM ERRO;
//  PESQUISAR TRATAMENTO DE ERRO;

    try {
        println("teste".toInt())

    } catch (e: NumberFormatException) {
        println("Este não é um número válido!")

    } catch (e: Exception) {
        println("Deu erro!")

    } finally {
        println("Tente novamente!")

    }
}