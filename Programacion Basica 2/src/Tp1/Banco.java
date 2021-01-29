package Tp1;

import java.util.Set;
import java.util.TreeSet;

public class Banco {

	private Set<Cliente> lista_clientes;
	private Set<Cuenta> lista_cuentas;
	private Set<Cliente> clientes_vip;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Banco(String nombre) {
		this.lista_clientes = new TreeSet<Cliente>();
		this.lista_cuentas = new TreeSet<Cuenta>();
		this.clientes_vip = new TreeSet<Cliente>();
		this.nombre = nombre;
	}
	
	public boolean crearCuentaBancaria(Cuenta nueva_cuenta,Cliente nuevo_cliente) throws CuentaYaExitente, ClienteExitente {
		if(!buscarCuentaBancariaExistente(nueva_cuenta)) {
			agregarCuentaBancaria(nueva_cuenta);
			if(nueva_cuenta.getSaldo()>1000000.0) {
				return agregarClienteVIP(nuevo_cliente);
			}
			else return agregarClienteNormal(nuevo_cliente);
		}
			throw new CuentaYaExitente("La cuenta ya existe");
	}
	
	public boolean buscarCuentaBancariaExistente(Cuenta nueva_cuenta) {
		for (Cuenta actual : lista_cuentas) {
			if(actual.getCodigo_cuenta().equals(nueva_cuenta.getCodigo_cuenta())) {
				return true;
			}
		}
		return false;
	}
	
	private void agregarCuentaBancaria(Cuenta nueva_cuenta) {
		this.lista_cuentas.add(nueva_cuenta);
	}
	
	private boolean agregarClienteVIP(Cliente nuevo_cliente) throws ClienteExitente {
		if(!buscarClienteVip(nuevo_cliente)) {
			return this.clientes_vip.add(nuevo_cliente);
		}
		throw new ClienteExitente("El cliente ya existe");
	}
	
	public boolean buscarClienteVip(Cliente nuevo_cliente) {
		for (Cliente cliente : clientes_vip) {
			if(cliente.getDni().equals(nuevo_cliente.getDni()))
				return true;
		}
		return false;
	}
	
	private boolean agregarClienteNormal(Cliente nuevo_cliente) throws ClienteExitente {
		if(!buscarClienteExistente(nuevo_cliente)) {
			return this.lista_clientes.add(nuevo_cliente);
		}
		throw new ClienteExitente("El cliente ya existe");
	}

	public boolean buscarClienteExistente(Cliente nuevo_cliente) {
		for (Cliente cliente : lista_clientes) {
			if(cliente.getDni().equals(nuevo_cliente.getDni())) {
				return true;
			}
		}
		return false;
	}

	public void verCuentasDelCLiente(Cliente nuevo_cliente) {
		for (Cuenta cuentas : lista_cuentas) {
			if(cuentas.getTitular().equals(nuevo_cliente)) 
				System.out.println(cuentas);
		}
	}
}
