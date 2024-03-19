package br.com.fiap.Word4All
import java.net.URL
import com.google.gson.Gson

data class Endereco(
    val cep: String,
    val logradouro: String,
    val complemento: String,
    val bairro: String,
    val localidade: String,
    val uf: String,
    val ibge: String,
    val gia: String,
    val ddd: String,
    val siafi: String
)

fun main() {
    val cep = "Seu CEP Aqui"
    val endereco = consultarCEP(cep)
    if (endereco != null) {
        println("CEP: ${endereco.cep}")
        println("Logradouro: ${endereco.logradouro}")
        println("Complemento: ${endereco.complemento}")
        println("Bairro: ${endereco.bairro}")
        println("Localidade: ${endereco.localidade}")
        println("UF: ${endereco.uf}")
        println("IBGE: ${endereco.ibge}")
        println("GIA: ${endereco.gia}")
        println("DDD: ${endereco.ddd}")
        println("SIAFI: ${endereco.siafi}")
    } else {
        println("CEP não encontrado.")
    }
}

fun consultarCEP(cep: String): Endereco? {
    val url = URL("https://viacep.com.br/ws/$cep/json/")
    val jsonString = url.readText()
    return Gson().fromJson(jsonString, Endereco::class.java)
}
