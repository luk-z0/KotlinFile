abstract class Mamifero(var nome: String) {
    abstract fun dorme()
    abstract fun falar();

}

class Cachorro(nome: String) : Mamifero(nome) {
    override fun dorme() {
        println("ah mimir ZzzZZZzz")
    }

    override fun falar() {
        println("auau")
    }

}

fun main() {
    var dog :Cachorro=Cachorro("Malu");
    dog.falar()
    dog.falar()
    dog.dorme()
}