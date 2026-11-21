package ar.edu.unlp.info.oo1.TiposYBindingDinamico;

public class C extends A{

	public C() {}
	
	public String getNombre() {
		return "soy C"; 
	}
	
	public String print() {
		return super.print() + " saludos"; 
	}
}
