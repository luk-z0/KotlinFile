fun main() {
    val str = "Programação Kotlin!"

    println("Tamanho da String ${str.length}")

    //Procura no começo do vetor de char(strings)
    //é retorna um valor booleano
    println(str.startsWith("Programação"))
    //Procura no fim do vetor de char(strings)
    //é retorna um valor booleano
    println(str.endsWith("Kotlin!"))

    //Pega uma string entre os intervalos propostos na função
    println(str.substring(0, 11))

    //Altera a string passando um novo valor
    println(str.replace("Kotlin!", "Kotlin é BRABOO"))
    println(str.lowercase()) //Coloca tudo para minusculo
    println(str.uppercase()) //Colocatudo para maiuscilo
    println(" MEU NOME É                        LUCAS            ".trim().lowercase())


}




