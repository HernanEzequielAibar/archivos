package CuentasBancarias;

public class CuentaBancaria {

		
	public CuentaBancaria(Double saldo) {
		this.saldo = saldo;
	}
	
//	public CuentaBancaria() {
//		this.saldo = 0.0;
//	}
	
	private Double saldo;
	
	public Double extraer(Double monto) {
		if(monto<=this.saldo) {
			this.saldo -= monto;
		}
		else {
			monto = 0.0;
		}
		return monto;
	}
	
	public void depositar(Double importe) {
		this.saldo += importe; 
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public Double consultarSaldo() {
		return getSaldo();
	}
}
