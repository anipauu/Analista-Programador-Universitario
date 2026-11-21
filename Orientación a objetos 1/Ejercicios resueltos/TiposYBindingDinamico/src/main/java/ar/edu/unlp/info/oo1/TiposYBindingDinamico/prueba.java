package ar.edu.unlp.info.oo1.TiposYBindingDinamico;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C o1 = new C(); 
		System.out.println(o1.print()); 
		System.out.println(o1.getNombre());
		
		Printer p = new B();
		System.out.println(p.print());
		
		A a = new C(); 
		System.out.println(a.print());
		
	}

}
