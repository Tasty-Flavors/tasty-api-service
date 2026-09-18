package br.com.tasty.api.v1.dadosdoestabelecimento.mapper;

import br.com.tasty.api.v1.dadosdoestabelecimento.model.request.DadosDoEstabelecimentoRequest;
import br.com.tasty.api.v1.dadosdoestabelecimento.model.request.EnderecoRequest;
import br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.model.EnderecoModelImpl;
import br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.model.response.DadosDoEstabelecimentoModelImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DadosDoEstabelecimentoMapper {

    public static DadosDoEstabelecimentoModelImpl mapToModelImpl(DadosDoEstabelecimentoRequest request, Integer codigoRestaurante){
        return DadosDoEstabelecimentoModelImpl.builder()
                .codigoUsuario(request.getCodigoUsuario())
                .nome(request.getNome())
                .descricao(request.getDescricao())
                .endereco(mapToEnderecoModelImpl(request.getEndereco(), codigoRestaurante))
                .build();
    }

    public static EnderecoModelImpl mapToEnderecoModelImpl(EnderecoRequest request, Integer codigoRestaurante) {
        return EnderecoModelImpl.builder()
                .codigoRestaurante(codigoRestaurante)
                .cep(request.getCep())
                .rua(request.getRua())
                .numero(request.getNumero())
                .complemento(request.getComplemento())
                .bairro(request.getBairro())
                .cidade(request.getCidade())
                .estado(request.getEstado())
                .build();
    }

}
