package com.example.backend.catering.repositorio;

import com.example.backend.catering.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepositorio extends JpaRepository<Producto,Long> {

}
