package ar.edu.unlp.info.oo1.ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {
	private ClienteDeCorreo cliente; 
	@BeforeEach
	void setUp() {
		cliente = new ClienteDeCorreo(); 
	}
	
	@Test 
	void recibir() {
		Email email = new Email("Hola", "Hola, como estas?");
		cliente.recibir(email);
		assertTrue(cliente.getInbox().getEmails().contains(email));
	}
	
	@Test
	void 
	

}
