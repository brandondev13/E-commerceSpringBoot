package com.ecommerce.ajsanta.controller;

import com.ecommerce.ajsanta.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;


    // /usuario/registro
    @GetMapping("/registro")
    public String registro() {
        return "usuario/registro";
    }



}