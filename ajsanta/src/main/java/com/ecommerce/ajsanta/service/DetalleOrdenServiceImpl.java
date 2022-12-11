package com.ecommerce.ajsanta.service;

import com.ecommerce.ajsanta.model.DetalleOrden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService {


    @Autowired
    private IDetalleOrdenService detalleOrdenService;

    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {
        return detalleOrdenService.save(detalleOrden);
    }
}
