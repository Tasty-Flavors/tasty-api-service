package br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.repository;


import br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.model.EnderecoModelImpl;
import br.com.tasty.configuracoesdorestaurante.dadosdoestabelecimento.model.response.DadosDoEstabelecimentoModelImpl;
import org.apache.ibatis.annotations.*;
@Mapper
public interface DadosDoEstabelecimentoRepository {

    @Update("""
            UPDATE RESTAURANTE
            SET NOME_ESTABELECIMENTO = #{request.nome},
                DESCRICAO = #{request.descricao}
            WHERE CODIGO_USUARIO = #{request.codigoUsuario}
            """)
    void atualizarDadosDoEstabelecimento(
            @Param("request") DadosDoEstabelecimentoModelImpl request);

    @Update("""
            UPDATE ENDERECO
            SET LOGRADOURO = #{model.rua},
                NUMERO = #{model.numero},
                COMPLEMENTO = #{model.complemento},
                BAIRRO = #{model.bairro},
                CIDADE = #{model.cidade},
                ESTADO = #{model.estado},
                CEP = #{model.cep}
            WHERE CODIGO_RESTAURANTE = #{model.codigoRestaurante}
            """)
    void atualizarEnderecoDoEstabelecimento(
            @Param("model") EnderecoModelImpl enderecoModelImpl);

    @Select("""
            SELECT R.CODIGO_RESTAURANTE
            FROM RESTAURANTE R
            WHERE R.CODIGO_USUARIO = #{codigoUsuario}
            """)
    Integer buscarCodigoRestaurantePorCodigoUsuario(
            @Param("codigoUsuario") Integer codigoUsuario);
}