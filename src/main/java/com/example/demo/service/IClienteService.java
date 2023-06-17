package com.example.demo.service;

import com.example.demo.model.entity.Cliente;

import java.util.List;


public interface IClienteService {
    public List<Cliente> findAll();

    public Cliente findbyId(Long id);
}
