package com.ecommerce.ajsanta.service;

import com.ecommerce.ajsanta.model.Usuario;

import java.util.Optional;

public interface IUsuarioService {

    Optional<Usuario> findById(Integer id);

}
