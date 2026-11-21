package ar.edu.unlp.info.oo1.AlquilerDePropiedades;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList; 

public class Usuario {
	private String nombre; 
	private String direccion; 
	private int dni; 
	private List<Reserva> reservas; 
	private List<Propiedad> propiedades; 

	public Usuario(String nombre, String direccion, int dni) {
		this.nombre = nombre; 
		this.direccion = direccion; 
		this.dni = dni; 
		this.reservas = new ArrayList<Reserva>();
		this.propiedades = new ArrayList<Propiedad>(); 
	}
	
	public Reserva crearReserva(LocalDate fechaInicio, LocalDate fechaFin, Propiedad propiedad) {
		IDateLapse periodo = new DateLapse(fechaInicio, fechaFin);
		if (propiedad.estaDisponible(periodo)) {
			Reserva reserva = new Reserva(periodo, this, propiedad);
			this.reservas.add(reserva); 
			propiedad.agregarReserva(reserva);
			return reserva; 
		}
		return null; 
	}
	
	public void CancelarReserva(Reserva reserva) {
		if (this.reservas.contains(reserva)) {
			if (!reserva.reservaEnCurso()) {
				reservas.remove(reserva);
				reserva.getInmueble().eliminarReserva(reserva);
			}
		}
	}
	
	public double calcularIngreso(IDateLapse periodo) {
		return this.propiedades.stream()
				.mapToDouble(propiedad -> propiedad.sumarTotalReserva(periodo))
				.sum() * 0.75; 
	}
	
	
}
