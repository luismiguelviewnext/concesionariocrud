package com.proyectocrud.concesionariocrud.controlador;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyectocrud.concesionariocrud.entidad.Coche;
import com.proyectocrud.concesionariocrud.servicio.CocheServicio;


@Controller
public class CocheController {

    @Autowired
    private CocheServicio cocheServicio;

   /* @RequestMapping
    public String listarCoches(Model modelo){
        modelo.addAttribute("coches", cocheServicio.listarTodosLosCoches());
        return "coches"; // nos devuelve el archivo coches.   
    }
    */


    @GetMapping({ "/coches/nuevo"})
    public String mostrarFormularioRegistrarCoche(Model modelo){
        Coche coche = new Coche();
        modelo.addAttribute("coche", coche);
        return "crear_coches";
    }
/* 
    @PostMapping("/coches")
	public String guardarCoche(@ModelAttribute Coche coche) {
		cocheServicio.guardarCoche(coche);
		return "redirect:/coches";
	}

	@GetMapping("/coches/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("coche", cocheServicio.obtenerCochePorId(id));
		return "editar_coches";
	}

	/*
    @PostMapping("/coches/{id}")
    public String actualizarCoche(@PathVariable Long id, @ModelAttribute Coche coche, Model modelo) {
        Optional<Coche> cocheExistenteOptional = cocheServicio.obtenerCochePorId(id);
    
        if (cocheExistenteOptional.isPresent()) {
            Coche cocheExistente = cocheExistenteOptional.get();
            cocheExistente.setId(id);
            cocheExistente.setMarca(coche.getMarca());
            cocheExistente.setModelo(coche.getModelo());
            cocheExistente.setMatricula(coche.getMatricula());
    
            cocheServicio.actualizarCoche(cocheExistente);
            return "redirect:/coches";  
        } else {
            modelo.addAttribute("error", "ID de coche no encontrada");
            return "error";  // Aquí se redirige a la página error.html
        }
    }
    */
    
/* /
	@GetMapping("/coches/{id}")
	public String eliminarCoche(@PathVariable Long id) {
		cocheServicio.eliminarCoche(id);
		return "redirect:/coches";
	}
    */
/*
    @GetMapping("/coches/{id}")
    public ResponseEntity<?> obtenerCoche(@PathVariable Long id) {
        Optional<Coche> coche = cocheServicio.obtenerCochePorId(id);
        if (coche.isPresent()) {
            return new ResponseEntity<>(coche.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("ID incorrecta", HttpStatus.NOT_FOUND);
        }
    }
    */
}
