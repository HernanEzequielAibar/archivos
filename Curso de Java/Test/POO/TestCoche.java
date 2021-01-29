package POO;

import org.junit.Test;

import Herencia.Camioneta;

public class TestCoche {

	@Test
	public void testCoche() {
	 //instancia de clase
	 //nuevo1 es un ejemplo de la clase coche
		Coche nuevo1 = new Coche();
		nuevo1.setColor("rojo");
		System.out.println(nuevo1.datosGenerales());
	
		Camioneta nueva = new Camioneta(500, 2);
		nueva.setAireAcondicionado("si");
		nueva.setColor("rojo");
		nueva.setAsientos("si");
		System.out.println(nueva.datosGenerales()+" "+nueva.toString());
		
	
		
	
	}
}
