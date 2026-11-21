package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuadrado implements Figura2D {
	private double lado; 
	
	public Cuadrado() {
		this.lado = 0; 
	}
	
	public void setLado(double lado) {
		this.lado = lado; 
	}
	
	public double getLado() {
		return this.lado; 
	}
	
	public double getArea() {
		return Math.pow(this.getLado(), 2); 
	}
	
	public double getPerimetro() {
		return 4 * this.getLado(); 
	}
	
	
}
