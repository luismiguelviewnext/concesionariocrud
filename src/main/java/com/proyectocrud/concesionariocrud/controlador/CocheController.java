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


@Controller
public class CocheController {

    @Autowired
    private CocheServicio cocheServicio;

   @GetMapping("/")
    public String listarCoches(Model modelo){
        modelo.addAttribute("coches", cocheServicio.listarTodosLosCoches());
        return "coches"; // nos devuelve el archivo coches.   
    }
   

    @GetMapping({"/coches/nuevo"})
    public String mostrarFormularioRegistrarCoche(Model modelo){
        Coche coche = new Coche();
        modelo.addAttribute("coche", coche);
        return "crear_coche";
    }

    @PostMapping("/guardar-coches")
	public RedirectView guardarCoche(@ModelAttribute Coche coche) {
		cocheServicio.guardarCoche(coche);
        /*Set<Coche> listaCoche = new HashSet();
        listaCoche = coche.getListaCoche();
        listaCoche.add(coche);
        coche.setListaCoche(listaCoche);
        if(listaCoche.isEmpty())*/
		return new RedirectView("/");
	}

	@GetMapping("/coches/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
            modelo.addAttribute("coche", cocheServicio.obtenerCochePorId(id));
            return "editar_coches";
        }
	
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
    
    

	@PostMapping("/coches/eliminar")
	public RedirectView eliminarCoche(@RequestParam ("cocheid") Long id) {
		cocheServicio.eliminarCoche(id);
		return new RedirectView("/");
	}
    
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
