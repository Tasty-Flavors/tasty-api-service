package br.com.tasty.restaurant.service;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import br.com.tasty.restaurant.model.RestauranteModelImpl;
import br.com.tasty.restaurant.repository.RestaurantRepository;

import static br.com.tasty.common.properties.MensagemProperties.MSG_COMR_DATA;
import static br.com.tasty.exception.ExceptionMaker.buildGenericException;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@Service
public class RestauranteService {
    private final RestaurantRepository restauranteRepository;

    public RestauranteService(RestaurantRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }

    public RestauranteModelImpl dashboard(Integer codigoUsuario) {
        try {
            return restauranteRepository.dashboard(codigoUsuario);
        } catch (DataAccessException e) {
            throw buildGenericException(MSG_COMR_DATA, e.getMessage(), INTERNAL_SERVER_ERROR);
        }
    }
}
