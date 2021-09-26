package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main () {

    //Quando chamamos o [ forEach ], o Kotlin define sozinho o elemento a ser usado como [ it ]
    ClienteTipo.values().forEach {
        println ("${it.name} -> $it")
    }

    // Alternativamente, podemos dar um nome ao elemento a ser usado
    ClienteTipo.values().forEach { elemento ->
        println ("${elemento.name} -> $elemento")
    }
}