package com.proyectocrud.concesionariocrud.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectocrud.concesionariocrud.entidad.Coche;

/**
 * Repositorio para realizar operaciones CRUD en la entidad Coche.
 * 
 * Este repositorio es una interfaz y se comunica con la base de datos,
 * permitiendo realizar operaciones CRUD (Create, Read, Update, Delete)
 * en la entidad Coche.
 *
 */
@Repository
public interface CocheRepositorio extends JpaRepository<Coche, Long> {
    // No se define ningún método adicional, ya que JpaRepository 
    // proporciona los métodos CRUD básicos.
}
