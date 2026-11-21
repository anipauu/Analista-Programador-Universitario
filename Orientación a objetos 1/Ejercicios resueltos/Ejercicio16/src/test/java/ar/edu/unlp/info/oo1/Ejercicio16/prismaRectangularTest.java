package ar.edu.unlp.info.oo1.Ejercicio16;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach; 

class prismaRectangularTest {

	private PrismaRectangular prisma; 
	
	@BeforeEach
	void setUp() {
		prisma = new PrismaRectangular("Bronce", "Naranja", 5, 2, 7);
	}
	
	@Test
	void volumen() {
		assertEquals(70, prisma.volumen());
	}
	
	@Test
	void superficie() {
		assertEquals(118, prisma.superficie()); 
	}
}
