package com.tienda.controller;

import com.tienda.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/")
    public String Listado(Model model) {
        var lista = productoService.getProductos(true);
        model.addAttribute("productos", lista);
        return "/index";
    }
}