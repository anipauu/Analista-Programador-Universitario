package ar.edu.unlp.info.oo1.Ejercicio16;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach; 


class reporteDeConstruccionTest {

	private ReporteDeConstruccion reporte; 
	private ReporteDeConstruccion reporteVacio; 
	
	@BeforeEach
	void setUp(){
		reporte = new ReporteDeConstruccion(); 
		reporte.agregarPieza(new Cilindro("Hierro", "Rojo", 2, 3));
		reporte.agregarPieza(new Esfera("Aluminio", "Verde", 5));
		reporte.agregarPieza(new PrismaRectangular("Hierro", "Azul", 5, 2, 7));
		reporteVacio = new ReporteDeConstruccion();
		
	}
	
	@Test
	void testVolumenDelMaterial() {
		assertEquals(70 + 12 * Math.PI, reporte.volumenDeMaterial("Hierro")); 
	}
	
	@Test
	void testVolumenDeMaterialInexistente() {
		assertEquals(0, reporte.volumenDeMaterial("Amatista")); 
	}
	
	@Test
	void testVolumenDeMaterialConListaVacia() {
		assertEquals(0, reporteVacio.volumenDeMaterial("Hierro"));
	}
	
	@Test
	void testSuperficieDeColor() {
		assertEquals(20 * Math.PI, reporte.superficieDeColor("Rojo"));
	}
	
	@Test 
	void testSuperficieDeColorInexistente() {
		assertEquals(0, reporte.superficieDeColor("Negro"));
	}
	
	@Test
	void testSuperficieDeColorConListaVacia() {
		assertEquals(0, reporteVacio.superficieDeColor("Rojo"));
	}
}
