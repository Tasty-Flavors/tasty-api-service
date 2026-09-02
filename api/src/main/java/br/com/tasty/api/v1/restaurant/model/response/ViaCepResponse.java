package br.com.tasty.api.v1.restaurant.model.response;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ViaCepResponse {
    @NotBlank(message = "Erro CEP inválido")
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
}