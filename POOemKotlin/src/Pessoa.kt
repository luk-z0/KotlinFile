class Pessoa() {

    var nome: String? = null
    var idade: Int = 0


    constructor(nome: String, idade: Int) : this() {
        this.idade = idade;
        this.nome = nome;
    }
}


fun main() {





    var p: Pessoa = Pessoa()
//    p.nome = "lucas"
//    println(p.nome)
    p.nome = readLine()
    println(p.nome)

//    var cliente : Cliente = Cliente()
//    cliente.nome
//    cliente.nome = "lucas"
//    println(cliente.nome)

}