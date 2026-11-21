package ar.edu.unlp.info.oo1.GreenHOOme;

public class OrdenCompra extends Orden {
	private double precioEnvio; 
	
	public OrdenCompra(String domicilio, double precioEnvio) {
		super(domicilio);
		this.precioEnvio = precioEnvio; 
	}
	
	public boolean aplicaDescuento() {
		return this.productos.size() >= 5; 
	}
	
	
	public double calcularCosto() {
		return super().calcularCosto() + this.precioEnvio;
	}
	
}
