package ar.edu.unlp.info.oo1.CuentaConGanchos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;      
import org.junit.jupiter.api.BeforeEach;
class TestCuentaCorriente {

	private CuentaCorriente cuenta; 
	private CuentaCorriente cuenta2; 
	private CajaDeAhorro caja; 
	
	@BeforeEach
	void setUp(){
		cuenta = new CuentaCorriente(); 
		cuenta2 = new CuentaCorriente(); 
	}
	
	@Test
	void depositar() {
		cuenta.depositar(100);
		assertEquals(100, cuenta.getSaldo());
	}
	
	@Test
	void extraer() {
		cuenta.setDescubierto(500);
		assertTrue(cuenta.extraer(300));
		assertEquals(-300, cuenta.getSaldo());
		cuenta = new CuentaCorriente(); 
		cuenta.setDescubierto(500);
		assertFalse(cuenta.extraer(600));
		assertEquals(0, cuenta.getSaldo());
	}
	
	@Test
	void transferirACuenta() {
		cuenta.setDescubierto(200);
		assertFalse(cuenta.transferirACuenta(300, cuenta2));
		assertEquals(0, cuenta.getSaldo());
		assertEquals(0, cuenta2.getSaldo());
		assertTrue(cuenta.transferirACuenta(100, cuenta2));
		assertEquals(-100, cuenta.getSaldo());
		assertEquals(100, cuenta2.getSaldo());
	}
}
