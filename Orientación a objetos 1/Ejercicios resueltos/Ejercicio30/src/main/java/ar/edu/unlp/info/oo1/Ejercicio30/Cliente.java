package ar.edu.unlp.info.oo1.Ejercicio30;

import java.util.List; 
import java.util.ArrayList;
import java.time.LocalDate; 
public abstract class Cliente {
	private String direccion; 
	private String nombre; 
	private List<Envio> envios; 
	
	public Cliente(String direccion, String nombre) {
		this.direccion = direccion; 
		this.nombre = nombre; 
		this.envios = new ArrayList<Envio>(); 
	}
	
	public void agregarEnvio(Envio envio) {
		this.envios.add(envio);
	}
	
	public double calcularMontoAPagar(LocalDate fechaInicio, LocalDate fechaFin) {
		double monto = this.envios.stream()
				.filter(e -> e.fechaDespachoEntre(fechaInicio, fechaFin))
				.mapToDouble(e -> e.costo())
				.sum();
		return monto + this.tieneDescuento(); 
	}
	
	public abstract double tieneDescuento(); 
}
