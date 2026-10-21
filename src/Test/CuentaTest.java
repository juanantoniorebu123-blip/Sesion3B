package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sesion3B.Cuenta;

class CuentaTest {

	static Cuenta cuenta1;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
        cuenta1 = new Cuenta("00000", "Juan", 0);

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	 @Test
	    void testIngresar() {
	        cuenta1.ingresar(500);
	        assertEquals(500, cuenta1.getSaldo());
	        
	    }

	    @Test
	    void testRetirar() {
	        cuenta1.retirar(500);                     
	        assertEquals(-500, cuenta1.getSaldo());
	      
	    }

	    @Test
	    void testSuperaLimite() {
	        cuenta1.retirar(501);                     
	        assertEquals(0, cuenta1.getSaldo());
	    }

	    

	    @Test
	    void test0014() {
	       
	        Cuenta c1 = new Cuenta("12345", "Titular_1", 50);
	        Cuenta c2 = new Cuenta("67890", "Titular_2", 0);

	       
	        c1.retirar(200);   
	        c2.retirar(350);   
	        c1.ingresar(100);  
	        c2.retirar(200);   //(quedaría -550)
	        c2.retirar(150);    
	        c1.retirar(200);  
	        c2.ingresar(50);   
	        c2.retirar(100);   //(quedaría -550)

	       
	        assertEquals(-250, c1.getSaldo());
	        assertEquals(-450, c2.getSaldo());

	    }

}