package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jorge"

    /*
    Todos os atributos nascem com métodos Get e Set por padrão
    colocando [ private set ], impedimos que a propriedade seja
    modificada de fora da classe
     */
    var cpf: String = "123.456.789-10"
    private set

//    inner class Endereco {
//        var rua: String = "Rua Teste"
//    }

}

fun main() {
    val jorge = Pessoa()
    println(jorge.nome)
    println(jorge.cpf)

//    println(jorge.Endereco().rua)
}