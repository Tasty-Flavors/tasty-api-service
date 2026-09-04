package br.com.tasty.restaurant.model;

import br.com.tasty.common.model.AddressModelImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RestauranteModelImpl {
    private String nomeEstabelecimento;
    private String email;
    private String telefone;
    private String cnpj;
    private String role;
    private Boolean ativo;
    private String imagem;
    private String descricao;
    private AddressModelImpl endereco;
}