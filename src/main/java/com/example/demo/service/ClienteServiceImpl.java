package com.example.demo.service;

import com.example.demo.model.entity.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ClienteRepository clienteDao;
    @Override
    public List<Cliente> findAll() {
        return clienteDao.findAll();
    }

    @Override
    public Cliente findByCodCli(String codCli) {
        return clienteDao.findByCodCli(codCli)
                .orElse(null);
    }

    @Override
    public List<Cliente> findByTipoCli(Integer tipoCli) {
        return clienteDao.findByTipoCli(tipoCli);
    }

    public void createCliente(Cliente cliente) {
        clienteDao.save(cliente);
    }

    public void updateCliente(String codCli, Cliente cliente) {
        clienteDao.save(cliente);
    }

    public void deleteCliente(String codCli) {
        clienteDao.deleteById(codCli);
    }

}
