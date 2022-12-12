package com.ecommerce.ajsanta.controller;

import com.ecommerce.ajsanta.model.Producto;
import com.ecommerce.ajsanta.service.IUsuarioService;
import com.ecommerce.ajsanta.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("")
    public String home(Model model) {

        List<Producto> productos = productoService.findAll();
        model.addAttribute("productos", productos);

        return "administrador/home";
    }

    @GetMapping("/usuarios")
    public String usuarios(Model model) {

        model.addAttribute("usuarios", usuarioService.findAll());

        return "administrador/usuarios";
    }




}
