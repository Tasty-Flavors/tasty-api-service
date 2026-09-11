package br.com.tasty.api.v1.restaurant.controller;

import br.com.tasty.api.v1.restaurant.RestauranteFacade;
import br.com.tasty.api.v1.restaurant.model.response.RestaurantResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/restaurante")
public class RestauranteController {
    private final RestauranteFacade restauranteFacade;

    public RestauranteController(RestauranteFacade restauranteFacade) {
        this.restauranteFacade = restauranteFacade;
    }

    @GetMapping("/dashboard")
    @ResponseStatus(HttpStatus.OK)
    public RestaurantResponse dashboard(@RequestParam("codigoUsuario") Integer codigoUsuario) {
        return restauranteFacade.dashboard(codigoUsuario);
    }

}
