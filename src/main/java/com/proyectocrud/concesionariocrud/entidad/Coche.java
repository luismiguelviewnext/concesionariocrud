package com.proyectocrud.concesionariocrud.entidad;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * Representa la entidad Coche que será mapeada a la tabla 'coches' en la base de datos.
 */
@Entity
@Table(name = "coches")
public class Coche {

    /**
     * Representa el ID único de un coche, y es la clave primaria en la base de datos.
     */
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    /**
     * Representa la marca de un coche. No puede ser null y tiene una longitud máxima de 50 caracteres.
     */
    @Column(name = "marca",nullable = false,length = 50)
	private String marca;

    /**
     * Representa el modelo de un coche. No puede ser null y tiene una longitud máxima de 50 caracteres.
     */
    @Column(name = "modelo", nullable = false, length = 50)
    private String modelo;

    /**
     * Representa la matrícula de un coche, que es única, no puede ser null y tiene una longitud máxima de 7 caracteres.
     */
    @Column(name = "matricula", nullable = false, length = 7, unique = true)
    private String matricula;

    /**
     * Constructor con todos los campos para crear un objeto Coche.
     *
     * @param id         El ID del coche.
     * @param marca      La marca del coche.
     * @param modelo     El modelo del coche.
     * @param matricula  La matrícula del coche.
     */
    public Coche(Long id, String marca, String modelo, String matricula) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

     public Coche(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    /**
     * Constructor por defecto.
     */
    public Coche(){
        
    }

    // Métodos getter y setter...
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
   
    
    /**
     * Proporciona una representación en cadena de caracteres del objeto Coche.
     *
     * @return Una cadena de caracteres que representa el coche.
     */
    @Override
    public String toString() {
        return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + "]";
    }
 
}



