package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo3D {
	private Figura2D caraBasal;
	private double altura; 
	
	public Cuerpo3D() {
		this.altura = 0;
	}
	
	public void setAltura(double altura) {
		this.altura = altura; 
	}
	
	public void setCaraBasal(Figura2D caraBasal) {
		this.caraBasal = caraBasal; 
	}
	
	public double getAltura() {
		return this.altura; 
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea() * this.getAltura(); 
	}
	
	public double getSuperficieExterior() {
		return 2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.getAltura(); 
	}
}
