package ar.edu.unlp.info.oo1.ServiciosTuristicos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Servicio {
	private LocalDate fechaInicio; 
	private LocalDate fechaFin; 
	
	public Servicio(LocalDate fechaInicio, LocalDate fechaFin) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	protected int cantidadDeDias() {
		long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin); 
		return (int) dias; 
	}
	
	protected abstract double calcularCosto(); 
}