package Tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBanco {

	@Test
	public void testQueCreaUnaCuentaBancaria() {
		Banco banco_ciudad = new Banco("Banco Ciudad");
		Cliente nuevo = new Cliente("Ezequiel", 42462359);
		Cuenta nueva = new Cuenta(1, 200.0, nuevo);
		Cuenta nueva2 = new Cuenta(2, 2000.0, nuevo);
		
		try {
			assertTrue(banco_ciudad.crearCuentaBancaria(nueva, nuevo));
			assertTrue(banco_ciudad.crearCuentaBancaria(nueva2, nuevo));
		} catch (CuentaYaExitente e) {
			e.printStackTrace();
		} catch(ClienteExitente e) {
			e.printStackTrace();
		}
		
//		assertTrue(banco_ciudad.crearCuentaBancaria(nueva2, nuevo));
		
		banco_ciudad.verCuentasDelCLiente(nuevo);
	}
}
