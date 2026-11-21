package ar.edu.unlp.info.oo1.Ejercicio16;
import java.util.List; 
import java.util.LinkedList; 

public class ReporteDeConstruccion {
	private List<Pieza> piezas; 
	
	public ReporteDeConstruccion() {
		this.piezas = new LinkedList(); 
	}
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	/*voluenDeMaterial(nombreDeMaterial: String)
	"Recibe como parámetro un nombre de material (un string, por ejemplo 'Hierro'). Retorna la suma de los volúmenes de todas las piezas hechas en ese material"
	 */
	public double volumenDeMaterial(String material) {
		 return piezas.stream() 
		.filter(p -> p.getMaterial().equals(material))
		.mapToDouble(p -> p.volumen())
		.sum();  
	}
	
	/*superficieDeColor(unNombreDeColor: String)
"Recibe como parámetro un color (un string, por ejemplo 'Rojo'). Retorna la suma de las superficies externas de todas las piezas pintadas con ese color".
*/
	public double superficieDeColor(String color) {
		return piezas.stream()
		.filter(p -> p.getColor().equals(color))
		.mapToDouble(p -> p.superficie())
		.sum();
	}
	
}
