package one.digitalinnovation.digionebank

enum class ClienteTipo(descricao: String) {
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    // Opção de criar funções estáticas! - acessadas via Class, não Objeto
    companion object {

    }
}