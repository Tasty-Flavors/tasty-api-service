package br.com.tasty.api.v1.dadosdoestabelecimento.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DadosDoEstabelecimentoRequest {
    @NotNull(message = "É obrigatório informar o código do usuário")
    private Integer codigoUsuario;
    @NotNull(message = "É obrigatório informar o nome do restaurante")
    private String nome;
    @NotNull(message = "É obrigatório informar a descrição do restaurante")
    private String descricao;
    @NotNull(message = "É obrigatório informar o endereço do restaurante")
    private EnderecoRequest endereco;
}
