package com.example.demo.service;

import com.example.demo.model.entity.Producto;

import java.util.List;


public interface IProductoService {
    public List<Producto> findAll();

    public Producto findbyId(Long id);
}
