package com.example.backend.catering.servicio;

import com.example.backend.catering.dto.UsuarioDTO;
import com.example.backend.catering.entidades.Usuario;
import com.example.backend.catering.repositorio.UsuarioRepositorio;
/*import com.example.backend.catering.util.MapperUtil;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio implements UsuarioServicioInterface {
    /*@Autowired
    private MapperUtil mapperUtil;*/

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Override
    public Usuario crear(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }
}
