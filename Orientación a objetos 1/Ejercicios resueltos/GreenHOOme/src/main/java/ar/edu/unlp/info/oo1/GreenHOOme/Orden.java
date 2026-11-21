package ar.edu.unlp.info.oo1.GreenHOOme;
import java.time.LocalDate;
import java.util.List; 
import java.util.ArrayList; 

public abstract class Orden {
	protected static final double descuento = 0.01; 
	
	protected LocalDate fecha; 
	protected String domicilio; 
	protected List<Producto> productos; 
	
	
	//Declarar un método protected aplicaDescuento porque lo único que cambia es la condición
	// Delego en las clases hijas solamente determinar la condición 
	
	protected abstract boolean aplicaDescuento(); 
	
	//El costoTotal de los productos también subirlo acá
	
	protected Orden(String domicilio) {
		this.fecha = LocalDate.now(); 
		this.domicilio = domicilio; 
		this.productos = new ArrayList<Producto>(); 
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto); 
	}
	
	
	protected double calcularCosto() {
		return this.productos.stream()
				.mapToDouble(producto -> producto.getCosto())
				.sum(); 
	}
}
