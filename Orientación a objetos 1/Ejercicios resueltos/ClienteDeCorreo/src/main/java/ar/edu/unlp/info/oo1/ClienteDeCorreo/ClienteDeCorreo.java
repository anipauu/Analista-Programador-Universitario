package ar.edu.unlp.info.oo1.ClienteDeCorreo;
import java.util.List; 
import java.util.LinkedList; 

public class ClienteDeCorreo {
	private List<Carpeta> carpetas; 
	private Carpeta inbox; 
	
	public ClienteDeCorreo() {
		this.carpetas = new LinkedList<Carpeta>(); 
		this.inbox = new Carpeta("Inbox");
		this.carpetas.add(inbox); 
		
	}
	
	public Carpeta getInbox() {
		return this.inbox; 
	}
	
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream()
				.map((Carpeta carpeta) -> carpeta.buscar(texto))
				.filter((Email email)-> email != null)
				.findFirst().orElse(null); 
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream()
				.mapToInt(carpeta -> carpeta.espacioOcupado())
				.sum(); 
	}
}
