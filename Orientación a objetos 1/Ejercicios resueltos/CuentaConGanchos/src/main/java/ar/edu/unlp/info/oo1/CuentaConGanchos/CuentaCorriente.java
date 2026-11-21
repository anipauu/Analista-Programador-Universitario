package ar.edu.unlp.info.oo1.CuentaConGanchos;

public class CuentaCorriente extends Cuenta {
	private double limiteDescubierto; 
	
	public CuentaCorriente () {
		super();
		this.limiteDescubierto = 0; 
	}
	
	
	public void setDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto; 
	}
	
	
	public double getLimiteDescubierto() {
		return this.limiteDescubierto; 
	}
	
	public boolean puedeExtraer(double monto) {
		return (this.getSaldo() - monto >= -this.getLimiteDescubierto()); 
	}
	
}
