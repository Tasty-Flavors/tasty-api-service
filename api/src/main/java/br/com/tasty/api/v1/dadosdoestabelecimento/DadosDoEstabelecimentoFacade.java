package br.com.tasty.api.v1.dadosdoestabelecimento;

import br.com.tasty.api.v1.dadosdoestabelecimento.model.request.DadosDoEstabelecimentoRequest;
import br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.DadosDoEstabelecimentoFacadeImpl;
import org.springframework.stereotype.Component;

import static br.com.tasty.api.v1.dadosdoestabelecimento.mapper.DadosDoEstabelecimentoMapper.mapToModelImpl;


@Component
public class DadosDoEstabelecimentoFacade {
    private final DadosDoEstabelecimentoFacadeImpl dadosDoEstabelecimentoFacadeImpl;

    public DadosDoEstabelecimentoFacade(DadosDoEstabelecimentoFacadeImpl dadosDoEstabelecimentoFacadeImpl) {
        this.dadosDoEstabelecimentoFacadeImpl = dadosDoEstabelecimentoFacadeImpl;
    }

    public void atualizarDadosDoEstabelecimento(DadosDoEstabelecimentoRequest request) {
        var codigoRestaurante = dadosDoEstabelecimentoFacadeImpl.buscarCodigoRestaurantePorCodigoUsuario(request.getCodigoUsuario());
        dadosDoEstabelecimentoFacadeImpl.atualizarDadosDoEstabelecimento(mapToModelImpl(request, codigoRestaurante));
    }

}
