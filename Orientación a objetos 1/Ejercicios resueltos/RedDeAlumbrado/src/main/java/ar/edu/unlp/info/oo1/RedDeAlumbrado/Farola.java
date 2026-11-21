package ar.edu.unlp.info.oo1.RedDeAlumbrado;
import java.util.List; 
import java.util.ArrayList; 

public class Farola {
	private boolean on; 
	private List<Farola> vecinas; 
	
	public Farola() {
		this.on = false; 
		this.vecinas = new ArrayList<Farola>(); 
	}
	
	public void pairWithNeighbor( Farola otraFarola ) {
		if (!vecinas.contains(otraFarola)) {
			this.vecinas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors (){
		return this.vecinas; 
	}
	
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.on; 
	}

	/*
	* Retorna true si la farola está apagada.
	*/
	public boolean isOff() {
		return !this.on; 
	}
	
	public void turnOn() {
		if (this.isOff()) {
			this.on = true; 
			for (Farola f: this.vecinas) {
				f.turnOn(); 
			}
		}
	}
	
	public void turnOff() {
		if (this.isOn()) {
			this.on = false; 
			for (Farola f: this.vecinas) {
				f.turnOff();
			}
		}
	}
	
}
