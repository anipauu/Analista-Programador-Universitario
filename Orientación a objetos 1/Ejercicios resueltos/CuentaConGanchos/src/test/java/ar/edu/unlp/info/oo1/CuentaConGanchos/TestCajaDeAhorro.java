package ar.edu.unlp.info.oo1.CuentaConGanchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCajaDeAhorro {

	private CajaDeAhorro caja; 
	private CajaDeAhorro caja2; 
	private CuentaCorriente cuenta; 
	
	@BeforeEach
	void setUp() {
		caja = new CajaDeAhorro();
	}
	
	@Test
	void depositar() {
		caja.depositar(100);
		assertEquals(98, caja.getSaldo()); 
	}
	
	@Test
	void extraer() {
		caja.depositar(100);
		assertTrue(caja.extraer(50));
		assertEquals(47, caja.getSaldo());
		
	}
	
	@Test
	void transferirACuenta() {
		caja2 = new CajaDeAhorro(); 
		caja.depositar(100);
		assertEquals(98, caja.getSaldo());
		assertFalse(caja.transferirACuenta(98, caja2));
		assertEquals(98, caja.getSaldo());
		assertEquals(0, caja2.getSaldo());
		assertTrue(caja.transferirACuenta(50, caja2));
		assertEquals(47, caja.getSaldo());
		assertEquals(49, caja2.getSaldo());
	}

}
