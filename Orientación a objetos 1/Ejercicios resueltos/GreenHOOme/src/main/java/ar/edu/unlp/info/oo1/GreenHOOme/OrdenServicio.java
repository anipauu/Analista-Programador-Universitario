package ar.edu.unlp.info.oo1.GreenHOOme;
import java.util.List;
import java.util.ArrayList;

public class OrdenServicio extends Orden{
	private String descripcion; 
	private int horas; 
	private List<Tecnico> tecnicos; 
	
	public OrdenServicio(String domicilio, String descripcion, int horas) {
		super(domicilio);
		this.descripcion = descripcion; 
		this.horas = horas;
		this.tecnicos = new ArrayList<Tecnico>(); 
	}
	
	public void agregarTecnico(Tecnico tecnico) {
		this.tecnicos.add(tecnico); 
	}
	
	public boolean aplicaDescuento() {
		return this.horas > 10; 
	}
	
	@Override
	public double calcularCosto() {
		double costoTotal =  this.productos.stream()
				.mapToDouble(producto -> producto.getCosto())
				.sum() + (
				this.tecnicos.stream()
				.mapToDouble(tecnico -> tecnico.getValorHora() * this.horas)
				.sum()); 
		return (this.horas > 10 ? costoTotal * 0.9 : costoTotal); 
	}
}
