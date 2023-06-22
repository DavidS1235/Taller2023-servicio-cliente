package com.example.demo.model.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codProducto;
    private String codCategoria;
    private String nombreProducto;
    private String marca;
    private String descripcionProducto;
    private double precio;
    private Integer stock;

}
