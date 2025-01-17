package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TDD.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    public void testSuma() {
        assertEquals(5, Calculadora.suma(2,3));
    }
    
	@Test
    public void testResta() {
        assertEquals(-1, Calculadora.resta(2,3));
    }
    
    @Test
    public void testMultiplica() {
        assertEquals(6, Calculadora.multiplica(2,3));
    }
    
    @Test
    public void testDivide() {
        assertEquals(0, Calculadora.divide(2,3));
    }

}
