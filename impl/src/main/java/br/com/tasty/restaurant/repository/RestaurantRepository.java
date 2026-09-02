package br.com.tasty.restaurant.repository;

import org.apache.ibatis.annotations.*;
import br.com.tasty.restaurant.model.RestauranteModelImpl;


@Mapper
public interface RestaurantRepository {
    @Select("""
            SELECT
                NOME_ESTABELECIMENTO,
                LOGIN_USUARIO,
                ROLE
            FROM USUARIO
            WHERE CODIGO_USUARIO = #{codigoUsuario}
            """)
    @Results(value = {
            @Result(column = "NOME_ESTABELECIMENTO", property = "nomeEstabelecimento"),
            @Result(column = "LOGIN_USUARIO", property = "email"),
            @Result(column = "ROLE", property = "role")
    })
    RestauranteModelImpl dashboard(@Param("codigoUsuario") Integer codigoUsuario);
}
