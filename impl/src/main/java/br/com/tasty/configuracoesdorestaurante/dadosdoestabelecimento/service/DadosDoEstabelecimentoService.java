package br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.service;


import br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.model.EnderecoModelImpl;
import br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.model.response.DadosDoEstabelecimentoModelImpl;
import br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.repository.DadosDoEstabelecimentoRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import static br.com.tasty.exception.ExceptionMaker.buildGenericException;

@Service
public class DadosDoEstabelecimentoService {
    private final DadosDoEstabelecimentoRepository dadosDoEstabelecimentoRepository;

    public DadosDoEstabelecimentoService(DadosDoEstabelecimentoRepository dadosDoEstabelecimentoRepository) {
        this.dadosDoEstabelecimentoRepository = dadosDoEstabelecimentoRepository;
    }

    public Integer buscarCodigoRestaurantePorCodigoUsuario(Integer codigoUsuario) {
        try {
            return dadosDoEstabelecimentoRepository.buscarCodigoRestaurantePorCodigoUsuario(codigoUsuario);
        } catch (DataAccessException e) {
            throw buildGenericException("erro.comr.data", e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public void atualizarDadosDoEstabelecimento(DadosDoEstabelecimentoModelImpl modelImpl) {
        try {
            dadosDoEstabelecimentoRepository.atualizarDadosDoEstabelecimento(modelImpl);
        } catch (DataAccessException e) {
            throw buildGenericException("erro.comr.data", e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public void atualizarEnderecoDoEstabelecimento(EnderecoModelImpl enderecoModelImpl) {
        try {
            dadosDoEstabelecimentoRepository.atualizarEnderecoDoEstabelecimento(enderecoModelImpl);
        } catch (DataAccessException e) {
            throw buildGenericException("erro.comr.data", e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
