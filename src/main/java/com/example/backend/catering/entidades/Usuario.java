package com.example.backend.catering.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="usuarios")
public class Usuario {

    @Id
    @SequenceGenerator(name = "usuario_secuencia",sequenceName = "usuario_secuencia")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "usuario_secuencia")
    private Long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String email;

    @Column
    private String contrasenia;
}

