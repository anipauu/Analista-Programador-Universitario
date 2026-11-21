package ar.edu.unlp.info.oo1.BalanzaMejorada;
import java.util.List; 
import java.util.ArrayList; 
public class Balanza {
	private List<Producto> productos; 
	
	public Balanza() {
		this.ponerEnCero();
	}
	
	public void ponerEnCero() {
		this.productos = new ArrayList<Producto>(); 
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPrecioTotal() {
		double total = 0;
		for (Producto p : productos) {
			total+= p.getPrecio(); 
		}
		return total; 
	}

	public double getPesoTotal() {
		double pesoTotal = 0;
		for (Producto p : productos) {
			pesoTotal += p.getPeso(); 
		}
		return pesoTotal; 
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto); 
	}
	
	public List<Producto> getProductos(){
		return this.productos; 
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
		return t; 
	}
	
	
}
