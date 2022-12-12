package com.ecommerce.ajsanta.repository;

import com.ecommerce.ajsanta.model.Orden;
import com.ecommerce.ajsanta.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IOrdenRepository extends JpaRepository<Orden, Integer> {

    List<Orden> findByUsuario(Usuario usuario);

}
