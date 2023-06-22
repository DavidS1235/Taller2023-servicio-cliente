package com.example.demo.service;

import com.example.demo.model.entity.Cliente;

import java.util.List;


public interface IClienteService {
    public List<Cliente> findAll();

    public Cliente findByCodCli(String codCli);

    public List<Cliente> findByTipoCli(Integer tipoCli);

    public void createCliente(Cliente cliente);

    public void updateCliente(String codCli, Cliente cliente);

    public void deleteCliente(String codCli);
}
