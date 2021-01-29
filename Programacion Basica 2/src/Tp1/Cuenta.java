package Tp1;

public class Cuenta implements Comparable<Cuenta>{

	public Cuenta(Integer codigo_cuenta,Double saldo,Cliente titular) {
		this.codigo_cuenta = codigo_cuenta;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public Integer getCodigo_cuenta() {
		return this.codigo_cuenta;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	
	public Cliente getTitular() {
		return titular;
	}

	@Override
	public String toString() {
		if(this.getSaldo()>1000000.0) {
			return "Cuenta VIP [codigo_cuenta=" + codigo_cuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
		}
		return "Cuenta [codigo_cuenta=" + codigo_cuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}


	private Integer codigo_cuenta;
	private Double saldo;
	private Cliente titular;
	
	@Override
	public int compareTo(Cuenta o) {
		return this.codigo_cuenta.compareTo(o.getCodigo_cuenta());
	}
}
