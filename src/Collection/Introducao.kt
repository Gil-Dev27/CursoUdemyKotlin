package Collection

fun main() {

    // List - ARRAY, SET E HASHMAP;

    val list1 = listOf("Madrid", "São Paulo", "Berlin")// Imutavel;
    val list2 = mutableListOf("Madrid", "São Paulo", "Berlin")// Mutável;

    val array = arrayListOf("Madrid", "São Paulo", "Berlin")// Array vem do Java, Mutável;

    val set = setOf("Madrid", "São Paulo", "Berlin")// Set não aceita repetição, Imutável;
    val set2 = mutableSetOf("Madrid", "São Paulo", "Berlin")// Aceita alteraçao, Mutável;

    val hashmap = hashMapOf<String, String>(Pair("key", "value"), Pair("França", "Paris"))//Chave e Valor, Mutável;
    val map = mapOf(Pair("key", "value"), Pair("França", "Paris"))// Imutável;
    val mutMap = mutableMapOf(Pair("key", "value"), Pair("França", "Paris"))// Mutável;

}
