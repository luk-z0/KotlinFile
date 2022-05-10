
open class Humano(var nome: String?) {
   fun vivo(){}
}

class Tecnico(nome: String?) : Humano(nome)
public class Cliente(nome: String?) : Humano(nome)

fun main() {

    var c: Cliente = Cliente("lucas");

    c.vivo()


}