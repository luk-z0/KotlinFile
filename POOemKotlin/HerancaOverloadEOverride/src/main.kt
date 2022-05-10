open class Eletronico(var marca: String) {
    private fun corrente(ativo: Boolean) {}
    fun ligar() {
        corrente(true)
    }

    open fun desligar() {
        corrente(false)
    }
}

class Computador(marca: String) : Eletronico(marca) {
    fun save(){}
    override fun desligar()
    {
        save()
        super.desligar()
    }
}

fun main() {
    var c: Computador = Computador("Dell")

    c.ligar()

}