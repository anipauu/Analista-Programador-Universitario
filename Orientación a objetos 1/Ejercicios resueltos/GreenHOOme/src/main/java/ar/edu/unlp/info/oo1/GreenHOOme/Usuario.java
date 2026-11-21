package ar.edu.unlp.info.oo1.GreenHOOme;

import java.util.List; 
import java.util.ArrayList; 

public class Usuario {
	private String nombreCompleto; 
	private String domicilio; 
	private List<Orden> ordenes; 
	
	
	
	public Usuario(String nombreCompleto, String domicilio) {
		this.nombreCompleto = nombreCompleto;
		this.domicilio = domicilio;
		this.ordenes = new ArrayList<Orden>();
	}

	public void agregarOrden(Orden orden) {
		this.ordenes.add(orden);
	}
	
	public List<Orden> devolverOrden(){
		return this.ordenes; 
	}
	
	
}
