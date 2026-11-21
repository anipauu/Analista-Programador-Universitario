package ar.edu.unlp.info.oo1.Ejercicio16;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach; 

class CilindroTest {

	private Cilindro cilindro; 
	
	@BeforeEach
	void setUp(){
		cilindro = new Cilindro("Hierro", "Azul", 2, 3); 
	}
	
	@Test
	void testVolumen() { 
		assertEquals(12 * Math.PI, cilindro.volumen());
	}
	
	@Test 
	void testSuperficie() {
		assertEquals(20 * Math.PI, cilindro.superficie());
	}
	

}
