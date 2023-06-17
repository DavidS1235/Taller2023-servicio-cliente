package com.example.demo.repository;

import com.example.demo.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {


}
