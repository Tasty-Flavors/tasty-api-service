package br.com.tasty.restaurant.service;

import br.com.tasty.common.model.AddressModelImpl;
import br.com.tasty.restaurant.model.RestauranteModelImpl;
import br.com.tasty.restaurant.repository.RestaurantRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import static br.com.tasty.common.properties.MensagemProperties.MSG_COMR_DATA;
import static br.com.tasty.exception.ExceptionMaker.buildGenericException;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@Service
public class RestauranteService {
    private final RestaurantRepository restauranteRepository;

    public RestauranteService(RestaurantRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }

    public RestauranteModelImpl buscarDadosRestaurante(Integer codigoUsuario) {
        try {
            return restauranteRepository.buscarDadosRestaurante(codigoUsuario);
        } catch (DataAccessException e) {
            throw buildGenericException(MSG_COMR_DATA, e.getMessage(), INTERNAL_SERVER_ERROR);
        }
    }

    public AddressModelImpl buscarEndereco(Integer codigoUsuario) {
        try {
            return restauranteRepository.buscarEndereco(codigoUsuario);
        } catch (DataAccessException e) {
            throw buildGenericException(MSG_COMR_DATA, e.getMessage(), INTERNAL_SERVER_ERROR);
        }
    }
}
