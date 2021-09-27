package one.digitalinnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean {
        return senha == "123456"
    }

    override fun toString(): String {
        return """
        Nome: $nome
        CPF: $cpf
        Tipo: $clienteTipo - ${clienteTipo.descricao}
        """.trimIndent()
    }
}