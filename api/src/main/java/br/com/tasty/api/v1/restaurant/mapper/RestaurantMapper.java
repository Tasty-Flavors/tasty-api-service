package br.com.tasty.api.v1.restaurant.mapper;

import br.com.tasty.api.v1.restaurant.model.response.RestaurantResponse;
import br.com.tasty.restaurant.model.RestauranteModelImpl;

public class RestaurantMapper {
    public static RestaurantResponse mapToRestauranteResponse(RestauranteModelImpl restaurantModel) {
        return RestaurantResponse.builder()
                .nomeEstabelecimento(restaurantModel.getNomeEstabelecimento())
                .email(restaurantModel.getEmail())
                .role(restaurantModel.getRole())
                .descricao(restaurantModel.getDescricao())
                .imagem(restaurantModel.getImagem())
                .build();
    }
}
