package com.example.demo.controller;

import com.example.demo.model.entity.Cliente;
import com.example.demo.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private IClienteService service;

    @GetMapping("/listar-clientes")
    public List<Cliente> listar() {
        return service.findAll();
    }

    @GetMapping("/listar-clientes/code")
    public Cliente buscarPorCodCli(@RequestParam String codCli) {
        return service.findByCodCli(codCli);
    }

    @GetMapping("/listar-clientes/tipo")
    public List<Cliente> buscarPorTipoCli(@RequestParam Integer tipoCli) {
        return service.findByTipoCli(tipoCli);
    }

    @RequestMapping(value = "/clientes/create", method = RequestMethod.POST)
    public void addCliente(
            @RequestBody Cliente cliente) {
        service.createCliente(cliente);
    }

    @RequestMapping(value = "/clientes/{codCli}", method = RequestMethod.PUT)
    public void updateCliente(
            @RequestBody Cliente cliente,
            @PathVariable String codCli) {
        service.updateCliente(codCli, cliente);
    }

    @RequestMapping(value = "/clientes/{codCli}", method = RequestMethod.DELETE)
    public void deleteCliente(
            @PathVariable String codCli) {
        service.deleteCliente(codCli);
    }

}
