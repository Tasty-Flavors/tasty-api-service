package br.com.tasty.api.v1.dadosdoestabelecimento.model;

import lombok.Builder;

@Builder
public class EnderecoModel {
    private String cep;
    private String rua;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
}
