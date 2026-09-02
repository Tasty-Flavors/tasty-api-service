package br.com.tasty.common.service;

import org.springframework.stereotype.Service;
import br.com.tasty.common.client.ViaCepClient;
import br.com.tasty.common.model.response.ViaCepResponse;

@Service
public class ViaCepService {

    private final ViaCepClient viaCepClient;

    public ViaCepService(ViaCepClient viaCepClient) {
        this.viaCepClient = viaCepClient;
    }

    public ViaCepResponse findAddressByCep(String cep) {
        cep = cep.replace("-", "");
        return viaCepClient.findAddressByCep(cep);
    }

}
