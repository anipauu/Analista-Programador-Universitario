package ar.edu.unlp.info.oo1.GenealogiaSalvaje;

import java.time.LocalDate; 

public class Mamifero {
	private String identificador; 
	private String especie; 
	private LocalDate fechaNacimiento; 
	private Mamifero madre; 
	private Mamifero padre;
	
	public Mamifero(String identificador) {
		this.identificador = identificador; 
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	} 
	
	public Mamifero getAbueloPaterno() {
		if (this.getPadre() != null && this.getPadre().getPadre() != null) {
			return this.getPadre().getPadre(); 
		} 
		return null; 
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.getPadre() != null && this.getPadre().getMadre() != null) {
			return this.getPadre().getMadre(); 
		}
		return null; 
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.getMadre() != null && this.getMadre().getPadre() != null) {
			return this.getMadre().getPadre(); 
		}
		return null; 
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.getMadre() != null && this.getMadre().getMadre() != null) {
			return this.getMadre().getMadre(); 
		}
		return null; 
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if (this.getPadre() == null && this.getMadre() == null)
			return false; 
		if ((this.getPadre() != null && this.getPadre().getIdentificador() == unMamifero.getIdentificador()) || (this.getMadre() != null && this.getMadre().getIdentificador() == unMamifero.getIdentificador()))
				return true; 
		return ((this.getPadre() != null && this.getPadre().tieneComoAncestroA(unMamifero)) || (this.getMadre() != null && this.getMadre().tieneComoAncestroA(unMamifero))); 
	}
}
