package Classes

//CLASSE SELADA
//DESSA FORMA É POSSIVEL FAZER HERANÇA DENTRO DO MESMO ARQUIVO, MAS NAO PODE SER HERDADA POR CLASSES FORA;
//É PARECIDO COM ENUM;

sealed class Result {
    class Sucess(val mesage: String) : Result()
    class Error(val message: String, val errorCode: Int) : Result()
}

class Repo {
    fun execute(): Result {

        return Result.Sucess("Deu certo!")
        //return Result.Error("Deu erro!", 404)
    }
}

fun main() {

    val r1 = Repo()
    val result: Result = r1.execute()
    when (result) {
        is Result.Sucess -> {
            println("Deu certo! :D")
        }
        is Result.Error -> {
            println("Deu erro! :(")
        }
    }
}