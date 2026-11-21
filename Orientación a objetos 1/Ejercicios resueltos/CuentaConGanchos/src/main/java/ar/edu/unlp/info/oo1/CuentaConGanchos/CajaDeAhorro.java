package ar.edu.unlp.info.oo1.CuentaConGanchos;

public class CajaDeAhorro extends Cuenta{
	private static final double costo = 0.02; 
	
	public CajaDeAhorro() {
		super(); 
	}
	
	public boolean puedeExtraer(double monto) {
		return this.getSaldo() >= monto + this.calcularCosto(monto);
	}
	
	private double calcularCosto(double monto) {
		return monto * costo; 
	}
	
	@Override
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto + this.calcularCosto(monto));
	}
	
	@Override
	public void depositar(double monto) {
		super.depositar(monto - calcularCosto(monto));
	}
}
