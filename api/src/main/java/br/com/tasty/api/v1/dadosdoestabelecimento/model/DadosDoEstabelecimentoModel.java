package br.com.tasty.api.v1.dadosdoestabelecimento.model;

import lombok.Builder;

@Builder
public class DadosDoEstabelecimentoModel {
    private Integer codigoUsuario;
    private String nome;
    private String descricao;
    private EnderecoModel endereco;
}
