package com.proyectocrud.concesionariocrud.controlador;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.proyectocrud.concesionariocrud.entidad.Coche;
import com.proyectocrud.concesionariocrud.servicio.CocheServicio;

// Importaciones...

/**
 * Controlador principal para las operaciones de Coche.
 */
@Controller
public class CocheController {
    
     /**
     * Servicio para realizar operaciones CRUD para Coche.
     */
    @Autowired
    private CocheServicio cocheServicio;


      /**
     * Lista todos los coches disponibles y los presenta en la vista 'coches'.
     *
     * @param model Modelo a utilizar para añadir atributos.
     * @return La vista 'coches'.
     */
    @GetMapping("/")
    public String listarCoches(Model modelo){
        modelo.addAttribute("coches", cocheServicio.listarTodosLosCoches());
        return "coches"; // nos devuelve el archivo coches.   
    }
   
       /**
     * Muestra el formulario para registrar un nuevo Coche.
     *
     * @param modelo Modelo a utilizar para añadir atributos.
     * @return La vista 'crear_coche'.
     */
    @GetMapping({"/coches/nuevo"})
    public String mostrarFormularioRegistrarCoche(Model modelo){
        Coche coche = new Coche();
        modelo.addAttribute("coche", coche);
        return "crear_coche";
    }

        /**
     * Guarda un nuevo Coche y redirige al usuario a la página principal.
     *
     * @param coche El coche a guardar.
     * @return Una vista de redirección a la página principal.
     */
    @PostMapping("/guardar-coches")
	public RedirectView guardarCoche(@ModelAttribute Coche coche) {
		cocheServicio.guardarCoche(coche);
		return new RedirectView("/");
	}

       /**
     * Muestra el formulario de edición para un Coche existente.
     *
     * @param id     El ID del Coche a editar.
     * @param modelo Modelo a utilizar para añadir atributos.
     * @return La vista 'editar_coches'.
     */
	@GetMapping("/coches/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
            modelo.addAttribute("coche", cocheServicio.obtenerCochePorId(id));
            return "editar_coches";
        }
	
            /**
     * Actualiza un Coche existente y redirige al usuario a la lista de coches.
     *
     * @param id     El ID del Coche a actualizar.
     * @param coche  El coche con los datos actualizados.
     * @param modelo Modelo a utilizar para añadir atributos.
     * @return Una vista de redirección a la lista de coches.
     */
    @PostMapping("/coches/actualizar/{id}")
    public String actualizarCoche(@PathVariable Long id, @ModelAttribute Coche coche, Model modelo) {
       
            Coche cocheExistente = cocheServicio.obtenerCochePorId(id);
            cocheExistente.setId(id);
            cocheExistente.setMarca(coche.getMarca());
            cocheExistente.setModelo(coche.getModelo());
            cocheExistente.setMatricula(coche.getMatricula());
    
            cocheServicio.actualizarCoche(cocheExistente);
            return "redirect:/coches";  
    }
    
    
    /**
     * Elimina un Coche existente y redirige al usuario a la página principal.
     *
     * @param id El ID del Coche a eliminar.
     * @return Una vista de redirección a la página principal.
     */
	@PostMapping("/coches/eliminar")
	public RedirectView eliminarCoche(@RequestParam ("cocheid") Long id) {
		cocheServicio.eliminarCoche(id);
		return new RedirectView("/");
	}
}
