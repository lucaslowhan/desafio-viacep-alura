package dev.lucaslowhan.viacep.domain;

public record Endereco(String cep, String logradouro,
                       String complemento,String localidade,
                       String bairro, String uf) {
}
