package com.example.demo.repository;

import com.example.demo.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {


    Optional<Cliente> findByCodCli(String codCli);

    List<Cliente> findByTipoCli(Integer tipoCli);

}
