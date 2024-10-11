package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TDD.Cuenta;

class CuentaTest {

	static Cuenta ctaPruebas;
    static Cuenta cta12345;
    static Cuenta cta67890;
    
	@BeforeAll
    public static void setUpClass() throws Exception {
        ctaPruebas = new Cuenta(0);
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
        
    }

    @BeforeEach
    public void setUp() throws Exception {
        ctaPruebas.setSaldo(0);
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testIngresar() {
        ctaPruebas.ingresar(3000);
        assertEquals(3000,ctaPruebas.getSaldo());
    }
    
    @Test
    public void testRetirar() {
        ctaPruebas.retirar(3000);
        assertEquals(-3000,ctaPruebas.getSaldo());
    }
    
    @Test
    public void testRetirarSinDinero() {
        ctaPruebas.retirar(3000);
        assertEquals(-3000,ctaPruebas.getSaldo());
    }

}
