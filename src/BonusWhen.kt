fun main() {
    println(BonusWhen("Gerente"))

}

fun BonusWhen(cargo : String):Float{

    return when (cargo){
        "Gerente" -> 2000f
        "Estagiário" -> 500f
        "Engenheiro" -> 1000f

        else -> 0f
    }



}