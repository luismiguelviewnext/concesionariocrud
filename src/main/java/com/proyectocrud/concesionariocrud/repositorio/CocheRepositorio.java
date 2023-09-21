package com.proyectocrud.concesionariocrud.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectocrud.concesionariocrud.entidad.Coche;

public interface CocheRepositorio extends JpaRepository<Coche, Long> {
    
}
