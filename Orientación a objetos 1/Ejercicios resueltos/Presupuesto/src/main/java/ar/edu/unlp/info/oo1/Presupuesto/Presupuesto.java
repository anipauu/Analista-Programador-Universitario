package ar.edu.unlp.info.oo1.Presupuesto;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList; 

public class Presupuesto {
	private LocalDate fecha; 
	private String cliente; 
	private List<Item> items; 
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now(); 
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item); 
		
	}
	
	public double calcularTotal() {
		double total = 0; 
		for (Item i : this.items) {
			total += i.costo(); 
		}
		return total; 
	}
	
	public String getCliente() {
		return this.cliente; 
	}
	
	public LocalDate getFecha() {
		return this.fecha; 
	}
}
