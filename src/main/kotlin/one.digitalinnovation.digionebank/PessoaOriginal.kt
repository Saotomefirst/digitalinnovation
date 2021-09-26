package one.digitalinnovation.digionebank

class PessoaOriginal () {
    /*
    Todos os atributos nascem com métodos Get e Set por padrão
    colocando [ private set ], impedimos que a propriedade seja
    modificada de fora da classe
     */
    var nome: String = "Jorge"
    var cpf: String = "123.456.789-10"
    private set

//    inner class Endereco {
//        var rua: String = "Rua Teste"
//    }

    // Exemplo de construtor secundario
    //constructor()

    fun pessoaInfo() = "Nome: $nome e CPF: $cpf"

}

