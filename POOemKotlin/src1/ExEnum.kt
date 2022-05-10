enum class Tamanho(val value: Int){
    PP(1){
        override fun toString(): String {
            return "Pequeno Pequeno"
        }
      } ,

    P(2),
    G(3),
    GG(4){
        override fun toString(): String {
            return "Grande Grande"
        }
         },
    M(5);



}

fun main() {
    println(Tamanho.PP)
    for (t in Tamanho.values())
        if (t.value == 4)
            println(t)
}