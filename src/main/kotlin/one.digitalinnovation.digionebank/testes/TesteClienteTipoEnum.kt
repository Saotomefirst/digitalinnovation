package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main () {

    //Quando chamamos o [ forEach ], o Kotlin define sozinho o elemento a ser usado como [ it ]
    ClienteTipo.values().forEach {
        println ("${it.name} -> ${it.descricao}")
    }

    // Alternativamente, podemos dar um nome ao elemento a ser usado
    ClienteTipo.values().forEach { elemento ->
        println ("${elemento.name} -> ${elemento.descricao}")
    }

    // Podemos tambem carregar em uma variável e usar assim
    val pf = ClienteTipo.PF
    println ("${pf.name} -> ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println ("${pj.name} -> ${pj.descricao}")
}