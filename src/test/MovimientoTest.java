package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TDD.Movimiento;

class MovimientoTest {

	static Movimiento movitest;
    static Movimiento movitest2;
    enum Signo{D,H};
    
    @BeforeAll
    public static void setUpClass() {
        movitest = new Movimiento(100.0,Movimiento.Signo.D);
        movitest2 = new Movimiento(100.0,Movimiento.Signo.H);
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetImporte() {
        System.out.println("getImporte");
        assertEquals(100.0, movitest.getImporte());
    }

    @Test
    public void testGetSigno() {
        System.out.println("getSigno");
        assertEquals(Movimiento.Signo.D, movitest.getSigno());
    }

    @Test
    public void testGetDetalle() {
        System.out.println("getDetalle");
        assertEquals("Ingreso", movitest.getDetalle());
    }

    @Test
    public void testGetSignoH() {
        System.out.println("getSigno");
        assertEquals(Movimiento.Signo.H, movitest2.getSigno());
    }

    @Test
    public void testGetDetalleH() {
        System.out.println("getDetalle");
        assertEquals("Reintegro", movitest2.getDetalle());
    }

}
