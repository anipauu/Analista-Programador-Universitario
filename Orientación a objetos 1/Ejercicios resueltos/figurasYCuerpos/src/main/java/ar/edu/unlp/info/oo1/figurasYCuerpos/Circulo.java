package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Circulo implements Figura2D {
	private double radio; 
	private double diametro; 
	
	public Circulo() {
		this.radio = 0; 
		this.diametro = 0; 
	}
	
	public double getDiametro() {
		return this.getRadio() * 2; 
	}
	
	public void setDiametro(double diametro) {
		this.diametro = diametro; 
	}
	
	public void setRadio(double radio) {
		this.radio = radio; 
	}
	
	public double getRadio() {
		return this.radio; 
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro(); 
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2); 
	}
}
