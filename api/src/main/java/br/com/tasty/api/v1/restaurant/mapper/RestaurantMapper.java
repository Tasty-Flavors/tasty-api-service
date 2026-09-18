package br.com.tasty.api.v1.restaurant.mapper;

import br.com.tasty.api.v1.restaurant.model.response.AddressResponse;
import br.com.tasty.api.v1.restaurant.model.response.RestaurantResponse;
import br.com.tasty.common.model.AddressModelImpl;
import br.com.tasty.restaurant.model.RestauranteModelImpl;

public class RestaurantMapper {
    public static RestaurantResponse mapToRestauranteResponse(RestauranteModelImpl restaurantModel) {
        return RestaurantResponse.builder()
                .nomeEstabelecimento(restaurantModel.getNomeEstabelecimento())
                .email(restaurantModel.getEmail())
                .role(restaurantModel.getRole())
                .descricao(restaurantModel.getDescricao())
                .imagem(restaurantModel.getImagem())
                .endereco(mapToEnderecoResponse(restaurantModel.getEndereco()))
                .build();
    }

    public static AddressResponse mapToEnderecoResponse(AddressModelImpl endereco) {
        return AddressResponse.builder()
                .cep(endereco.getCep())
                .rua(endereco.getRua())
                .numero(endereco.getNumero())
                .complemento(endereco.getComplemento())
                .bairro(endereco.getBairro())
                .cidade(endereco.getCidade())
                .estado(endereco.getEstado())
                .build();
    }
}
