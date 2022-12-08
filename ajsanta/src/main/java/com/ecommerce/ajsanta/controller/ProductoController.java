package com.ecommerce.ajsanta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @GetMapping("")
    private String show() {
        return "productos/show";
    }
}
