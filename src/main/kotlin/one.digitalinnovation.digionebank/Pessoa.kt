package one.digitalinnovation.digionebank

class Pessoa {
    var _nome: String = "Jorge"
    var _cpf: String = "123.456.789-10"
}

fun main() {
    val jorge = Pessoa()
    println(jorge._nome)
    println(jorge._cpf)
}