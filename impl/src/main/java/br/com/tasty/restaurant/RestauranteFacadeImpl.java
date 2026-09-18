package br.com.tasty.restaurant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import br.com.tasty.restaurant.model.RestauranteModelImpl;
import br.com.tasty.restaurant.service.RestauranteService;

import static br.com.tasty.restaurant.mapper.RestauranteModelImplMapper.mapToRestauranteModelImpl;

@Component
@AllArgsConstructor
public class RestauranteFacadeImpl {
    private final RestauranteService restauranteService;

    public RestauranteModelImpl dashboard(Integer codigoUsuario) {
        var dados = restauranteService.buscarDadosRestaurante(codigoUsuario);
        var endereco = restauranteService.buscarEndereco(codigoUsuario);
        return mapToRestauranteModelImpl(dados, endereco);
    }

}
