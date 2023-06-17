package com.example.demo.model.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccion;
    private String telefono;
    private String correo;

}
