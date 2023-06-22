package com.example.demo.controller;

import com.example.demo.model.entity.Producto;
import com.example.demo.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private IProductoService service;

    @GetMapping("/listar-productos")
    public List<Producto> listar() {
        return service.findAll();
    }

    @GetMapping("/listar-productos/{id}")
    public Producto buscarPorId(@PathVariable Long id) {
        return service.findbyId(id);
    }
}
