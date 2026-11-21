package ar.edu.unlp.info.oo1.Ejercicio16;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach; 

class EsferaTest {

	private Esfera esfera; 
	
	@BeforeEach
	void setUp() {
		esfera = new Esfera("Aluminio", "Rosa", 3);
	}
	
	@Test
	void volumenTest() {
		assertEquals(27 * Math.PI, esfera.volumen());
	}

	@Test
	void superficieTest() {
		assertEquals(36 * Math.PI, esfera.superficie() );
	}
}
