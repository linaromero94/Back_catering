package com.example.backend.catering.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="Productos")
public class Producto {

    @Id
    @SequenceGenerator(name = "producto_secuencia",sequenceName = "producto_secuencia")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "producto_secuencia")
    private Long id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private String imagenUrl;


}

