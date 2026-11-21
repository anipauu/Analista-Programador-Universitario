package ar.edu.unlp.info.oo1.Ejercicio16;

public class Cilindro extends Pieza {
	private double radio; 
	private double h; 
	
	public Cilindro(String material, String color, double radio, double h) {
		super(material, color);
		this.h = h; 
		this.radio = radio; 
	}
	
	public double volumen() {
		return Math.PI * Math.pow(this.radio, 2) * h; 
	}
	
	public double superficie() {
		return 2 * Math.PI * this.radio * this.h + 2 * Math.PI * Math.pow(this.radio, 2); 
	}
	
}
