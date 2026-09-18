package br.com.tasty.api.v1.dadosdoestabelecimento.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoRequest {
    @NotNull(message = "É obrigatório informar o cep")
    private String cep;
    @NotNull(message = "É obrigatório informar a rua")
    private String rua;
    private Integer numero;
    private String complemento;
    @NotNull(message = "É obrigatório informar o bairro")
    private String bairro;
    @NotNull(message = "É obrigatório informar a cidade")
    private String cidade;
    @NotNull(message = "É obrigatório informar o estado")
    private String estado;
}