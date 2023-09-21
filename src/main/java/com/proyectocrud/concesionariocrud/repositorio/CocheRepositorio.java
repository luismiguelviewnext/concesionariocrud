package com.proyectocrud.concesionariocrud.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectocrud.concesionariocrud.entidad.Coche;
@Repository
public interface CocheRepositorio extends JpaRepository<Coche, Long> {
    
}
