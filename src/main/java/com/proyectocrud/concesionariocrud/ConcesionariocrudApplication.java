package com.proyectocrud.concesionariocrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

	}

}
