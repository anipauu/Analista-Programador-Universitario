package ar.edu.unlp.info.oo1.FilteredSet;
import java.util.HashSet; 

public class EvenNumberSetHerencia extends HashSet<Integer> {
	
	@Override
	public boolean add( Integer numero) {
		if (numero == null || numero % 2 != 0) {
			return false; 
		}
		return super.add(numero); 
	}
}
