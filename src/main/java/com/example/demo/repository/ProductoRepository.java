package com.example.demo.repository;

import com.example.demo.model.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {


}
