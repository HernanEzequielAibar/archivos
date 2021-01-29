package Tp2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testsw {

	@Test
	public void test() {
		SWModoCarrera c1 = new SWModoCarrera("Ezequiel", 20, 80.0, 180.0, 3000);
		c1.empezar(10);
		c1.terminar();
		
	}

}
