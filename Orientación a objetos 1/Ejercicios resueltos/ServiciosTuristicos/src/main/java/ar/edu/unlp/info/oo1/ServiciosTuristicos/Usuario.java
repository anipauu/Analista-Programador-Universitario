package ar.edu.unlp.info.oo1.ServiciosTuristicos;

import java.util.List; 
import java.util.ArrayList; 

public class Usuario {
	private String nombre; 
	private List<Servicio> servicios; 
	
	public Usuario(String nombre) {
		this.nombre = nombre; 
		this.servicios = new ArrayList<Servicio>(); 
	}
	
	public void agregarServicio(Servicio servicio) {
		this.servicios.add(servicio); 
	}
	
	public double calcularGastoTotal() {
		return this.servicios.stream()
				.mapToDouble(servicio -> servicio.calcularCosto())
				.sum(); 
	}
}
