package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sesion3B.Cuenta;

class CuentaTest {

	Cuenta cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		 cuenta=new Cuenta();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(60);
		assertEquals(60,cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(-60);
		assertEquals(-60,cuenta.getSaldo());
	}

}
