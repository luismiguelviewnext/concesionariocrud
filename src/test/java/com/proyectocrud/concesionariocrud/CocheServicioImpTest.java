package com.proyectocrud.concesionariocrud;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import com.proyectocrud.concesionariocrud.repositorio.CocheRepositorio;
import com.proyectocrud.concesionariocrud.servicio.CocheServicioImp;

@SpringBootTest
public class CocheServicioImpTest {

    @InjectMocks
    private CocheServicioImp cocheServicioImp;

    @Mock
    private CocheRepositorio cocheRepositorio;

    @Test
    public void listarTodosLosCochesTest() {
        cocheServicioImp.listarTodosLosCoches();
        verify(cocheRepositorio).findAll();
    }
    
    // Continúa con los demás métodos de CocheServicioImp...
}
