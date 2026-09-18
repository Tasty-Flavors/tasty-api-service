package br.com.tasty.restaurant.repository;

import br.com.tasty.common.model.AddressModelImpl;
import org.apache.ibatis.annotations.*;
import br.com.tasty.restaurant.model.RestauranteModelImpl;


@Mapper
public interface RestaurantRepository {
    @Select("""
            SELECT
                R.NOME_ESTABELECIMENTO,
                U.LOGIN_USUARIO,
                U.ROLE,
                R.DESCRICAO,
                R.FOTO
            FROM USUARIO U,
                 RESTAURANTE R
            WHERE U.CODIGO_USUARIO = #{codigoUsuario}
            AND U.CODIGO_USUARIO = R.CODIGO_USUARIO
            """)
    @Results(value = {
            @Result(column = "NOME_ESTABELECIMENTO", property = "nomeEstabelecimento"),
            @Result(column = "LOGIN_USUARIO", property = "email"),
            @Result(column = "ROLE", property = "role"),
            @Result(column = "DESCRICAO", property = "descricao"),
            @Result(column = "FOTO", property = "imagem")
    })
    RestauranteModelImpl buscarDadosRestaurante(@Param("codigoUsuario") Integer codigoUsuario);

    @Select("""
        SELECT
            E.LOGRADOURO,
            E.NUMERO,
            E.COMPLEMENTO,
            E.BAIRRO,
            E.CIDADE,
            E.ESTADO,
            E.CEP
        FROM USUARIO U,
             RESTAURANTE R,
             ENDERECO E
        WHERE U.CODIGO_USUARIO = #{codigoUsuario}
        AND U.CODIGO_USUARIO = R.CODIGO_USUARIO
        AND R.CODIGO_RESTAURANTE = E.CODIGO_RESTAURANTE
        """)
    @Results(value = {
            @Result(column = "CEP", property = "cep"),
            @Result(column = "LOGRADOURO", property = "rua"),
            @Result(column = "NUMERO", property = "numero"),
            @Result(column = "COMPLEMENTO", property = "complemento"),
            @Result(column = "BAIRRO", property = "bairro"),
            @Result(column = "CIDADE", property = "cidade"),
            @Result(column = "ESTADO", property = "estado")

    })
    AddressModelImpl buscarEndereco(@Param("codigoUsuario") Integer codigoUsuario);}
