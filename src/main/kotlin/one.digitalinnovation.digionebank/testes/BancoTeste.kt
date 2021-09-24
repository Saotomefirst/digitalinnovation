package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main () {
    val digionebank = Banco(nome = "DigiOne", numero = 12)

    println (digionebank.nome)
    println (digionebank.numero)
    println (digionebank.info())

    // na cópia de um objeto Data Class, temos a oportunidade de mudar os seus valores
    val banco2 = digionebank.copy(nome = "Banco 2")

    println(banco2.nome)
    println(banco2.numero)
    println (banco2.info())
}