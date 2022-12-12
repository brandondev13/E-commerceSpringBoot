package com.ecommerce.ajsanta.service;

import com.ecommerce.ajsanta.model.Orden;
import com.ecommerce.ajsanta.model.Usuario;

import java.util.List;

public interface IOrdenService {


    List<Orden> findAll();

    Orden save(Orden orden);

    String generarNumeroOrden();

    List<Orden> finByUsuario(Usuario usuario);

}
