package com;

import org.junit.jupiter.api.Test;

import com.proyectocrud.concesionariocrud.entidad.Coche;

import static org.junit.jupiter.api.Assertions.*;

public class CocheTest {

    @Test
    public void cocheCreationTest() {
        Coche coche = new Coche(1L, "Marca", "Modelo", "Matrícula");
        assertNotNull(coche);
        assertEquals("Marca", coche.getMarca());
        // Continúa con las demás aserciones...
    }
    
    
}
