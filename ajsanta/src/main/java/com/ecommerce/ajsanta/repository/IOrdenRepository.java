package com.ecommerce.ajsanta.repository;

import com.ecommerce.ajsanta.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdenRepository extends JpaRepository<Orden, Integer> {

}
