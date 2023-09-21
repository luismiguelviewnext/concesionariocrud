package com.proyectocrud.concesionariocrud.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectocrud.concesionariocrud.entidad.Coche;
import com.proyectocrud.concesionariocrud.repositorio.CocheRepositorio;

@Service
public class CocheServicioImp implements CocheServicio {
  
    @Autowired
    private CocheRepositorio repositorio;

    @Override
    public Coche actualizarCoche(Coche coche) {
        return repositorio.save(coche);
        
    }

    @Override
    public void eliminarCoche(Long id) {
        repositorio.deleteById(id);
        
    }

    @Override
    public Coche guardarCoche(Coche coche) {
      
        return repositorio.save(coche);
    }

    @Override
    public List<Coche> listarTodosLosCoches() {
      
        return repositorio.findAll();
    }

    @Override
    public Coche obtenerCochePorId(Long id) {
        return repositorio.findById(id).get();
    }
    
    
    
}
