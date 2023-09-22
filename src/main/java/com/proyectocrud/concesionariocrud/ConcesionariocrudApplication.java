package com.proyectocrud.concesionariocrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyectocrud.concesionariocrud.entidad.Coche;
import com.proyectocrud.concesionariocrud.repositorio.CocheRepositorio;

/**
 * Clase principal de la aplicación Concesionariocrud.
 * 
 * Esta clase inicia la aplicación Spring Boot y implementa {@link CommandLineRunner}
 * para ejecutar código adicional después de iniciar la aplicación.
 * 
 */
@SpringBootApplication
public class ConcesionariocrudApplication implements CommandLineRunner {

	/**
     * Método principal para ejecutar la aplicación Spring Boot.
     *
     * @param args Argumentos de la línea de comandos.
     */
	public static void main(String[] args) {
		SpringApplication.run(ConcesionariocrudApplication.class, args);
	}
	@Autowired
	private CocheRepositorio repositorio;
	
	/**
     * Método run de CommandLineRunner para ejecutar lógica adicional
     * después de iniciar la aplicación Spring Boot.
     *
     * @param args Argumentos de la línea de comandos.
     * @throws Exception si ocurre cualquier excepción durante la ejecución.
     */
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
