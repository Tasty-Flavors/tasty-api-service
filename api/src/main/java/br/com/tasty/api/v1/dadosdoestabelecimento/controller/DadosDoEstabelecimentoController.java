package br.com.tasty.api.v1.dadosdoestabelecimento.controller;

import br.com.tasty.api.v1.dadosdoestabelecimento.DadosDoEstabelecimentoFacade;
import br.com.tasty.api.v1.dadosdoestabelecimento.model.request.DadosDoEstabelecimentoRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/dados-estabelecimento")
public class DadosDoEstabelecimentoController {

    private final DadosDoEstabelecimentoFacade dadosDoEstabelecimentoFacade;

    public DadosDoEstabelecimentoController(DadosDoEstabelecimentoFacade dadosDoEstabelecimentoFacade) {
        this.dadosDoEstabelecimentoFacade = dadosDoEstabelecimentoFacade;
    }

    @PutMapping("/atualizar")
    @ResponseStatus(HttpStatus.OK)
    public void atualizarDadosDoEstabelecimento(@RequestBody DadosDoEstabelecimentoRequest request) {
        dadosDoEstabelecimentoFacade.atualizarDadosDoEstabelecimento(request);
    }
}
