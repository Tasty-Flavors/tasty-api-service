package br.com.tasty.common.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.com.tasty.common.model.response.ViaCepResponse;

@FeignClient(name = "${application.feign.viacep-name}", url = "${application.feign.viacep-url}")
public interface ViaCepClient {
    @GetMapping("/{cep}/json")
    ViaCepResponse findAddressByCep(@PathVariable("cep") String cep);
}