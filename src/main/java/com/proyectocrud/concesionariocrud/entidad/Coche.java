package com.proyectocrud.concesionariocrud.entidad;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "coches")
public class Coche {
   
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   // private static Set<Coche> listaCoche;

    @Column(name = "marca",nullable = false,length = 50)
	private String marca;

    @Column(name = "modelo", nullable = false, length = 50)
    private String modelo;

    @Column(name = "matricula", nullable = false, length = 7, unique = true)
    private String matricula;

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

    public Coche(){
        
    }

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
   
    

    @Override
    public String toString() {
        return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + "]";
    }
    /*
    @Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Coche coche = (Coche) o;
		return matricula.equals(coche.matricula);
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
}

    public static Set<Coche> getListaCoche() {
        return listaCoche;
    }

    public static void setListaCoche(Set<Coche> listaCoche) {
        Coche.listaCoche = listaCoche;
    }
    */
}



