package br.com.tasty.api.v1.restaurant.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestaurantResponse {
    private String nomeEstabelecimento;
    private String email;
    private String telefone;
    private String cnpj;
    private String role;
    private Boolean ativo;
    private String imagem;
    private String descricao;
    private AddressResponse endereco;
}