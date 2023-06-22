package com.example.demo.model.entity;



import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clientes")
@Data
public class Cliente implements Serializable {
//idCliente, tipoCli, nombresC, apellidosC, edad, correo, direccion

    @Column(unique = true, nullable = false)
    @Id
    private String codCli;
    private Integer tipoCli;
    private String nombres;
    private String apellidos;
    private Integer edad;
    private String correo;
    private String direccion;

}
