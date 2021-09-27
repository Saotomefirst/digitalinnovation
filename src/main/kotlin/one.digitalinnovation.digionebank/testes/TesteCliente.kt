package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    val jorge = Cliente(
        nome = "Jorge Freitas",
        cpf = "123.456.789-10",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jorge.toString())
    TesteAutenticacao().autentica(jorge)
}