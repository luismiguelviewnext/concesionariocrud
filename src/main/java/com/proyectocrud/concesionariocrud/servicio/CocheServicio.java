package com.proyectocrud.concesionariocrud.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proyectocrud.concesionariocrud.entidad.Coche;

/**
 * Define los servicios disponibles para gestionar coches en la aplicación.
 * 
 * Esta interfaz declara métodos para realizar operaciones CRUD sobre los coches,
 * como listar, guardar, actualizar, eliminar y obtener un coche por su ID.
 * 
 */
public interface CocheServicio {
    
    /**
     * Obtiene una lista de todos los coches disponibles.
     *
     * @return Una lista de objetos {@link Coche}.
     */
     public List<Coche> listarTodosLosCoches();
    
     /**
     * Guarda un coche en la base de datos.
     *
     * @param coche El coche que se desea guardar.
     * @return El coche guardado.
     */
    public Coche guardarCoche(Coche coche);

    /**
     * Actualiza la información de un coche existente.
     *
     * @param coche El coche con la información actualizada.
     * @return El coche actualizado.
     */
    public Coche actualizarCoche(Coche coche);

    /**
     * Elimina un coche de la base de datos por su ID.
     *
     * @param id El ID del coche que se desea eliminar.
     */
    public void eliminarCoche(Long id);

    /**
     * Obtiene un coche por su ID.
     *
     * @param id El ID del coche que se desea obtener.
     * @return El coche encontrado o null si no se encuentra.
     */
    public Coche obtenerCochePorId(Long id);


}
