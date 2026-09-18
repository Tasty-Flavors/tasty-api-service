package br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.model.response;

import br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.model.EnderecoModelImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class DadosDoEstabelecimentoModelImpl {
    private Integer codigoUsuario;
    private String nome;
    private String descricao;
    private EnderecoModelImpl endereco;
}
