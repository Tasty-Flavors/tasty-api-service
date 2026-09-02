package br.com.tasty.api.v1.restaurant;

import br.com.tasty.restaurant.RestauranteFacadeImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import br.com.tasty.api.v1.restaurant.model.response.RestaurantResponse;

import static br.com.tasty.api.v1.restaurant.mapper.RestaurantMapper.mapToRestauranteResponse;

@Component
@AllArgsConstructor
public class RestauranteFacade {
    private final RestauranteFacadeImpl restauranteFacadeImpl;

    public RestaurantResponse dashboard(Integer codigoUsuario) {
        return mapToRestauranteResponse(restauranteFacadeImpl.dashboard(codigoUsuario));
    }
}