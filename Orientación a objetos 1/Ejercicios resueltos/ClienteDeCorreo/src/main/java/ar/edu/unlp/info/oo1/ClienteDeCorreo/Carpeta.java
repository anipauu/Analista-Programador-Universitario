package ar.edu.unlp.info.oo1.ClienteDeCorreo;
import java.util.List; 
import java.util.LinkedList; 

public class Carpeta {
	private String nombre; 
	private List<Email> emails; 
	
	public Carpeta(String nombre) {
		this.nombre = nombre; 
		this.emails = new LinkedList<Email>();
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email); 
	}
	
	public List<Email> getEmails() {
		return this.emails; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public Email buscar(String texto) {
		return this.emails.stream()
				.filter(email -> email.getTitulo().contains(texto) || email.getCuerpo().contains(texto))
				.findFirst().orElse(null);		
	}
	
	public void mover (Email email, Carpeta destino) {
		destino.emails.add(email);
		this.emails.remove(email); 
	}
	
	public int espacioOcupado() {
		return this.emails.stream()
			.mapToInt(email -> email.espacioOcupado())
			.sum(); 
	}
	
	
}
