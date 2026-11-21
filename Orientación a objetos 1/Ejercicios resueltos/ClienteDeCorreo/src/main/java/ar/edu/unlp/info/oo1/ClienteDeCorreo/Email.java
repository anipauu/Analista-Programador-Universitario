package ar.edu.unlp.info.oo1.ClienteDeCorreo;
import java.util.List; 
import java.util.LinkedList; 

public class Email {
	private String titulo; 
	private String cuerpo; 
	private List<Archivo> adjuntos; 
	
	public Email(String titulo, String cuerpo) {
		this.cuerpo = cuerpo; 
		this.titulo = titulo; 
		this.adjuntos = new LinkedList<Archivo>(); 
	}
	
	public String getTitulo() {
		return this.titulo; 
	}
	
	public String getCuerpo() {
		return this.cuerpo; 
	}
	
	public int espacioOcupado() {
		int tamañoTextos = this.titulo.length() + this.cuerpo.length();  
	    int tamañoAdjuntos = this.adjuntos.stream() 
	    					.mapToInt(archivo -> archivo.tamaño())
	    					.sum(); 
		return tamañoTextos + tamañoAdjuntos; 
	}
	
}
