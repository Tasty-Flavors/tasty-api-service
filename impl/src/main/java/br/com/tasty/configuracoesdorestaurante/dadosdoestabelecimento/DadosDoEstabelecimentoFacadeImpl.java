package br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento;

import br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.model.response.DadosDoEstabelecimentoModelImpl;
import br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.service.DadosDoEstabelecimentoService;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DadosDoEstabelecimentoFacadeImpl {
    private final DadosDoEstabelecimentoService dadosDoEstabelecimentoService;

    public DadosDoEstabelecimentoFacadeImpl(DadosDoEstabelecimentoService dadosDoEstabelecimentoService) {
        this.dadosDoEstabelecimentoService = dadosDoEstabelecimentoService;
    }

    @Transactional
    public void atualizarDadosDoEstabelecimento(DadosDoEstabelecimentoModelImpl modelImpl) {
        dadosDoEstabelecimentoService.atualizarDadosDoEstabelecimento(modelImpl);
        dadosDoEstabelecimentoService.atualizarEnderecoDoEstabelecimento(modelImpl.getEndereco());
    }

    public Integer buscarCodigoRestaurantePorCodigoUsuario(Integer codigoUsuario) {
        return dadosDoEstabelecimentoService.buscarCodigoRestaurantePorCodigoUsuario(codigoUsuario);
    }
}
