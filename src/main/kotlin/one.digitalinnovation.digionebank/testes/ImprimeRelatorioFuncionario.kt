package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

// Método Estático a ser invocado via Classe, nao instância!
class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime (funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}