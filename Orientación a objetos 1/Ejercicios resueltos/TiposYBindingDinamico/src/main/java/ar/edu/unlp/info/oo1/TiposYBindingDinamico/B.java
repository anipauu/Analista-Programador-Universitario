package ar.edu.unlp.info.oo1.TiposYBindingDinamico;

public class B extends A{
	
	public B() {}
	
	public String getNombre() {
		return "soy B y tambien " + super.getNombre(); 
	}

}
