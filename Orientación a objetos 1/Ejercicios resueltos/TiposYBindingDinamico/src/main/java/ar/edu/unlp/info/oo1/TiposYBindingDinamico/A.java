package ar.edu.unlp.info.oo1.TiposYBindingDinamico;

public abstract class A implements Printer{
	
	public A () {}
	
	public String print() {
		return "hola " + this.getNombre(); 
	}
	
	public String getNombre() {
		return " soy A"; 
	}
}
