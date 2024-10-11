package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TDD.Cuenta;

class Test0014 {

	static Cuenta cta12345;
    static Cuenta cta67890;
    
    public Test0014() {
    }
    
    @BeforeAll
    public static void setUpClass() throws Exception {
        cta12345 = new Cuenta(50);
        cta67890 = new Cuenta(0);
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
        
    }

    @BeforeEach
    public void setUp() throws Exception {
        
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testReintegroCuenta12345() {
        cta12345.retirar(200.0);
        assertEquals(-150.0, cta12345.getSaldo());
    }

    @Test
    public void testReintegroCuenta67890() {
        cta67890.retirar(350.0);
        assertEquals(-350.0, cta67890.getSaldo());
    }

    @Test
    public void testIngresoCuenta12345() {
        cta12345.ingresar(100.0);
        assertEquals(150.0, cta12345.getSaldo());
    }

    @Test
    public void testReintegroCuenta67890_2() {
        cta67890.retirar(200.0);
        assertEquals(-200.0, cta67890.getSaldo(), 0.01);
    }

    @Test
    public void testReintegroCuenta67890_3() {
        cta67890.retirar(150.0);
        assertEquals(-150.0, cta67890.getSaldo(), 0.01);
    }

    @Test
    public void testReintegroCuentaCuenta12345_2() {
        cta12345.retirar(200.0);
        assertEquals(-50.0, cta12345.getSaldo(), 0.01);
    }

    @Test
    public void testIngresoCuenta67890_3() {
        cta67890.ingresar(50.0);
        assertEquals(50.0, cta67890.getSaldo(), 0.01);
    }
    
    @Test
    public void testReintegroCuenta67890_4() {
        cta67890.retirar(100.0);
        assertEquals(150.0, cta67890.getSaldo(), 0.01);
    }
}
