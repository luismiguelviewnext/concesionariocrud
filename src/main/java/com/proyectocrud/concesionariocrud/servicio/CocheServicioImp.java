package com.proyectocrud.concesionariocrud.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectocrud.concesionariocrud.entidad.Coche;
import com.proyectocrud.concesionariocrud.repositorio.CocheRepositorio;

/**
 * Implementación del servicio para gestionar coches.
 * 
 * Esta clase implementa la interfaz {@link CocheServicio} y define
 * cómo se deben realizar las operaciones CRUD sobre los coches.
 * 
 */
@Service
public class CocheServicioImp implements CocheServicio {
  
    @Autowired
    private CocheRepositorio repositorio;

    /**
     * Actualiza un coche existente.
     *
     * @param coche El coche con la información actualizada.
     * @return El coche actualizado.
     */
    @Override
    public Coche actualizarCoche(Coche coche) {
        return repositorio.save(coche);
        
    }
    
    /**
     * Elimina un coche por su ID.
     *
     * @param id El ID del coche que se desea eliminar.
     */
    @Override
    public void eliminarCoche(Long id) {
        repositorio.deleteById(id);
        
    }

    /**
     * Guarda un nuevo coche.
     *
     * @param coche El coche que se desea guardar.
     * @return El coche guardado.
     */
    @Override
    public Coche guardarCoche(Coche coche) {
      
        return repositorio.save(coche);
    }

    /**
     * Lista todos los coches existentes.
     *
     * @return Una lista de coches.
     */
    @Override
    public List<Coche> listarTodosLosCoches() {
      
        return repositorio.findAll();
    }

    /**
     * Obtiene un coche por su ID.
     *
     * @param id El ID del coche que se desea obtener.
     * @return El coche encontrado.
     */
    @Override
    public Coche obtenerCochePorId(Long id) {
        return repositorio.findById(id).get();
    }
    
    
    
}
