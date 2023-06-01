package com.example.backend.catering.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioDTO implements Serializable {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasenia;
}
