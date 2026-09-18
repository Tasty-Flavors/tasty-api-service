package br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class EnderecoModelImpl {
    private Integer codigoRestaurante;
    private String cep;
    private String rua;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
}
