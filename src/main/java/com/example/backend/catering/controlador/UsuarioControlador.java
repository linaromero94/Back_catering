package com.example.backend.catering.controlador;

import com.example.backend.catering.entidades.Usuario;
import com.example.backend.catering.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuarioControlador {

    @Autowired
    UsuarioServicio usuarioServicio;

    @PostMapping("/crear")
    public ResponseEntity<String> crear(@RequestBody Usuario usuario){
        usuarioServicio.crear(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado");
    }

}
