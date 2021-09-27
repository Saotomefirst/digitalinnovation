package one.digitalinnovation.digionebank.testes


import one.digitalinnovation.digionebank.Gerente

fun main () {

    val maria = Gerente(nome = "Maria Pereira", cpf = "987.654.321-00", salario = 5000.00)

    println ("${maria.nome} -> ${maria.cpf} : ${maria.salario} ")

    ImprimeRelatorioFuncionario.imprime(maria)

}
