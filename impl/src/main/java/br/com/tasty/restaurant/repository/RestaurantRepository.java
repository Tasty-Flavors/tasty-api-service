package br.com.tasty.restaurant.repository;

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
    RestauranteModelImpl dashboard(@Param("codigoUsuario") Integer codigoUsuario);
}
