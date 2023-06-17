package com.example.demo.controller;

import com.example.demo.model.entity.Cliente;
import com.example.demo.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private IClienteService service;

    @GetMapping("/listar-cliente")
    public List<Cliente> listar() {
        return service.findAll();
    }

    @GetMapping("/listar-cliente/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return service.findbyId(id);
    }
}
