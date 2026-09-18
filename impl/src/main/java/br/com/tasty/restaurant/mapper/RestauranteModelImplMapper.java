package br.com.tasty.restaurant.mapper;

import br.com.tasty.common.model.AddressModelImpl;
import br.com.tasty.restaurant.model.RestauranteModelImpl;

public class RestauranteModelImplMapper {
    public static RestauranteModelImpl mapToRestauranteModelImpl(RestauranteModelImpl restaurantModel, AddressModelImpl endereco) {
        return RestauranteModelImpl.builder()
                .nomeEstabelecimento(restaurantModel.getNomeEstabelecimento())
                .email(restaurantModel.getEmail())
                .role(restaurantModel.getRole())
                .descricao(restaurantModel.getDescricao())
                .imagem(restaurantModel.getImagem())
                .endereco(endereco)
                .build();
    }

}
