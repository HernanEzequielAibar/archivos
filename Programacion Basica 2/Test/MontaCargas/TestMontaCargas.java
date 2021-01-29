package MontaCargas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMontaCargas {

	@Test
	public void testQueCreaUnMontaCargasYSuCarga() {
	
		MontaCargas nuevo = new MontaCargas(1500.0);
		Carga actual = new Carga(500.0);
		Carga actual2 = new Carga(500.0);
		Carga actual3 = new Carga(1400.0);
		
		Boolean carga1 = nuevo.cargar(actual);	
		Boolean carga2 = nuevo.cargar(actual2);
		Boolean carga3 = nuevo.cargar(actual3);
		//carga 
		assertTrue(carga1);
		assertTrue(carga2);
		assertTrue(carga3);
		//descarga 
		Boolean descarga1 = nuevo.descargar();
		assertTrue(descarga1);
		
		System.out.println(nuevo.obtenerCargaPromedio());
	}
	
	@Test
	public void testQuedevuelveElPesoDeLaUltimaCarga() {
		MontaCargas nuevo = new MontaCargas(1500.0);
		Carga actual = new Carga(500.0);
		Carga actual2 = new Carga(500.0);
		Carga actual3 = new Carga(1500.0);
		Carga actual4 = new Carga(1400.0);
		
		Boolean carga1 = nuevo.cargar(actual);	
		Boolean carga2 = nuevo.cargar(actual2);
		Boolean carga3 = nuevo.cargar(actual3);
		Boolean carga4 = nuevo.cargar(actual4);
		
		assertTrue(carga1);
		assertTrue(carga2);
		assertTrue(carga3);
		assertTrue(carga4);		
		
		System.out.println("el peso de la ultima carga es: "+nuevo.obtenerPeso());
		Boolean descarga1 = nuevo.descargar();
		assertTrue(descarga1);
		
		System.out.println(nuevo.obtenerCargaPromedio());
	
	}
}
