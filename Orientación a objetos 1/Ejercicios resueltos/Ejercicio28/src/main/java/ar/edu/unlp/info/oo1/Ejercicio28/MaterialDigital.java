package ar.edu.unlp.info.oo1.Ejercicio28;

import java.time.LocalDate;

public class MaterialDigital extends Material{
	private String carpeta; 
	private String nombreArchivo; 
	private double tamañoEnMB; 
	
	
	public MaterialDigital(String titulo, LocalDate fechaIncorporacion, String carpeta, String nombreArchivo,
			double tamañoEnMB) {
		super(titulo, fechaIncorporacion);
		this.carpeta = carpeta;
		this.nombreArchivo = nombreArchivo;
		this.tamañoEnMB = tamañoEnMB;
	}

	protected double tamañoEnMB() {
		return this.tamañoEnMB; 
	}
	
	protected String getNombreCarpeta() {
		return this.carpeta; 
	}
}
