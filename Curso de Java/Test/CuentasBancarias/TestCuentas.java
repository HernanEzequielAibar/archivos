package CuentasBancarias;

import org.junit.Test;

public class TestCuentas {

	@Test
	public void testCuentaBancaria() {
		CuentaBancaria cuenta = new CuentaBancaria(200.0);
		cuenta.extraer(100.0);
		System.out.println(cuenta.consultarSaldo());
		cuenta.depositar(200.0);
		System.out.println(cuenta.consultarSaldo());
		cuenta.extraer(100.0);
		System.out.println(cuenta.consultarSaldo());
	}
	
	@Test
	public void testCajaAhorro() {
		CuentaBancaria cuenta = new CajaAhorro(500.0);
		cuenta.extraer(100.0);
		System.out.println(cuenta.consultarSaldo());
		cuenta.depositar(200.0);
		System.out.println(cuenta.consultarSaldo());
		cuenta.extraer(100.0);
		cuenta.extraer(100.0);
		System.out.println(cuenta.consultarSaldo());
		cuenta.extraer(100.0);
		System.out.println(cuenta.consultarSaldo());
		cuenta.extraer(100.0);
		System.out.println(cuenta.consultarSaldo());
	}
	
	@Test
	public void testCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente(100.0);
		cuenta.extraer(200.0);
		System.out.println(cuenta.consultarSaldo());
		System.out.println(cuenta.consultarSaldoDescubierto());
		System.out.println(cuenta.consultarDeuda());
	}

}
