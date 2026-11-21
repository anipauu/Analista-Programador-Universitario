package ar.edu.unlp.info.oo1.AlquilerDePropiedades;
import java.time.LocalDate; 

public class Reserva {
	private IDateLapse periodo; 
	private Usuario cliente; 
	private Propiedad inmueble; 
	
	public Reserva (IDateLapse periodo, Usuario cliente, Propiedad propiedad) {
		this.periodo = periodo; 
		this.cliente = cliente; 
		this.inmueble = propiedad; 
	}
	
	public IDateLapse getPeriodo() {
		return this.periodo; 
	}
	
	public Propiedad getInmueble() {
		return this.inmueble; 
	}
	
	public int getCantNoches() {
		return this.periodo.sizeInDays(); 
	}
	
	public double getPrecio() {
		return this.getCantNoches() * this.inmueble.getPrecioPorNoche(); 
	}
	
	public boolean reservaEnCurso() {
		return this.periodo.includesDate(LocalDate.now()); 
	}
	
}
