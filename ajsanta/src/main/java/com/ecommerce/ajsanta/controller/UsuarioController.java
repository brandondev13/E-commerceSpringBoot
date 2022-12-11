package com.ecommerce.ajsanta.controller;

import com.ecommerce.ajsanta.model.Usuario;
import com.ecommerce.ajsanta.service.IUsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioController.class);


    @Autowired
    private IUsuarioService usuarioService;


    // /usuario/registro
    @GetMapping("/registro")
    public String create() {
        return "usuario/registro";
    }

    @PostMapping("/save")
    public String save(Usuario usuario) {
        LOGGER.info("Usuario registro: {}", usuario);
        usuario.setTipo("USER");
        usuarioService.save(usuario);
        
        return "redirect:/";
    }



}
