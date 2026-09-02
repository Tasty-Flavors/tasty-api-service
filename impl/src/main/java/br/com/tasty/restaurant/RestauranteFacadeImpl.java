package br.com.tasty.restaurant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import br.com.tasty.restaurant.model.RestauranteModelImpl;
import br.com.tasty.restaurant.service.RestauranteService;

@Component
@AllArgsConstructor
public class RestauranteFacadeImpl {
    private final RestauranteService restauranteService;

    public RestauranteModelImpl dashboard(Integer codigoUsuario) {
        return restauranteService.dashboard(codigoUsuario);
    }

}
