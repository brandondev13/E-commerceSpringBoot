package com.ecommerce.ajsanta.service;

import com.ecommerce.ajsanta.model.Orden;
import com.ecommerce.ajsanta.repository.IOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrdenServiceImpl implements IOrdenService {

    @Autowired
    private IOrdenRepository ordenRepository;

    @Override
    public Orden save(Orden orden) {
        return ordenRepository.save(orden);
    }
}
