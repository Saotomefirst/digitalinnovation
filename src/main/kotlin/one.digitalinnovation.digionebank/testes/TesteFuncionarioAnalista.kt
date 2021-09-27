package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista


fun main () {

    val joao = Analista(nome = "Joao da Silva", cpf = "987.654.321-00", salario = 1000.00)

    println ("${joao.nome} -> ${joao.cpf} : ${joao.salario} ")

    ImprimeRelatorioFuncionario.imprime(joao)

}
