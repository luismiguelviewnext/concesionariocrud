package com.proyectocrud.concesionariocrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyectocrud.concesionariocrud.entidad.Coche;
import com.proyectocrud.concesionariocrud.repositorio.CocheRepositorio;

@SpringBootApplication
public class ConcesionariocrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConcesionariocrudApplication.class, args);
	}
	@Autowired
	private CocheRepositorio repositorio;
	@Override
	public void run(String... args) throws Exception{

		/*

			-- Crea la base de datos
	CREATE DATABASE IF NOT EXISTS VehiculosDB;

	-- Usa la base de datos creada
	USE VehiculosDB;

	-- Crea la tabla Vehiculos
	CREATE TABLE IF NOT EXISTS Vehiculos (
		id INT AUTO_INCREMENT,
		marca VARCHAR(50) NOT NULL,
		modelo VARCHAR(50) NOT NULL,
		anio INT NOT NULL,
		matricula VARCHAR(10) UNIQUE NOT NULL,
		PRIMARY KEY (id)
		);


		Coche coche1 = new Coche("Audi","a5","8049JH");
	    repositorio.save(coche1);
	    
	    Coche coche2 = new Coche("Skoda","Fabia","2463IG");
	    repositorio.save(coche2);
		*/

	}

}
