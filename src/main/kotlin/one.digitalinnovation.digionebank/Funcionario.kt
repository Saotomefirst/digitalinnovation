package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario (
    nome : String,
    cpf : String,
    val salario : Double
    ) : Pessoa(nome, cpf) {
        // protected permite apenas às classes filhas desta de usar este método
        protected abstract fun calculaAuxilio() : Double

    override fun toString(): String {
        return """
            Nome: $nome
            CPF: $cpf
            Salário: $salario
            Auxílio: ${this.calculaAuxilio()}
        """.trimIndent()
    }
}