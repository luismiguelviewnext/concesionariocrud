package com.proyectocrud.concesionariocrud.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proyectocrud.concesionariocrud.entidad.Coche;


public interface CocheServicio {
    
    public List<Coche> listarTodosLosCoches();

    public Coche guardarCoche(Coche coche);

    public Coche actualizarCoche(Coche coche);

    public void eliminarCoche(Long id);

    public Coche obtenerCochePorId(Long id);


}
