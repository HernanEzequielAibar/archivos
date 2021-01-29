package Collecciones;

public class Clientes {

	private String nombre;
	private int nro_cuenta;
	private Double saldo;

	
	public Clientes(String nombre, int nro_cuenta, Double saldo) {
		this.nombre = nombre;
		this.nro_cuenta = nro_cuenta;
		this.saldo = saldo;
	}
	
	public int getNro_cuenta() {
		return nro_cuenta;
	}

	public void setNro_cuenta(int nro_cuenta) {
		this.nro_cuenta = nro_cuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nro_cuenta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		if (nro_cuenta != other.nro_cuenta)
			return false;
		return true;
	}

	
	
	 
	
}
