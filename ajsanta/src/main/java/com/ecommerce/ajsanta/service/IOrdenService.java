package com.ecommerce.ajsanta.service;

import com.ecommerce.ajsanta.model.Orden;
import com.ecommerce.ajsanta.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IOrdenService {


    List<Orden> findAll();

    Optional<Orden> findById(Integer id);
    Orden save(Orden orden);

    String generarNumeroOrden();

    List<Orden> finByUsuario(Usuario usuario);

}
