package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Balanza {
	private int cantidadDeProductos; 
	private double precioTotal; 
	private double pesoTotal; 
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0; 
		this.precioTotal = 0; 
		this.pesoTotal = 0; 
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return this.precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++; 
		this.precioTotal += producto.getPrecio(); 
		this.pesoTotal += producto.getPeso(); 
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
		return t; 
	}
	
	
}
