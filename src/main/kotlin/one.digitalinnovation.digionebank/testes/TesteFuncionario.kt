package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main () {
    val jorge = Pessoa(nome = "Jorge Freitas", cpf = "123.456.789-10")

    println (jorge.nome)

    val joao = Funcionario(nome = "Joao da Silva", cpf = "987.654.321-00", salario = BigDecimal.valueOf(1000))

    println ("${joao.nome} -> ${joao.salario}")
}