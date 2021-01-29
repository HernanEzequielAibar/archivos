package Cerradura;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCerradura {

	@Test
	public void queUnaCerraduraNuevaEsteCerrada() {
		Cerradura nueva = new Cerradura(1234,3);
		Boolean estado_cerradura = nueva.estaAbierta();
		assertFalse(estado_cerradura);
	}
	
	@Test
	public void queCuandoIngresoClaveCorrectaSeAbra() {
		Cerradura nueva = new Cerradura(1234,3);
		nueva.abrir(1234);
		Boolean estado_cerradura = nueva.estaAbierta();
		assertTrue(estado_cerradura);
	}

	@Test
	public void queCuandoIngresoUnaClaveIncorrectaNoSeAbra() {
		Cerradura nueva = new Cerradura(1234,3);
		nueva.abrir(1235);
		Boolean estado_cerradura = nueva.estaAbierta();
		assertFalse(estado_cerradura);
		Boolean estaCerrada = nueva.estaCerrada();
		assertTrue(estaCerrada);
	
	}
}
