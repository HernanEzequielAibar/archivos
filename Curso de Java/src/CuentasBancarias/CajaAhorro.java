package CuentasBancarias;

public class CajaAhorro extends CuentaBancaria {

	public CajaAhorro(Double saldo) {
		super(saldo);
		this.contador_extracciones = 0;
	}
		
	private Integer contador_extracciones;
	
	public Double extraer(Double monto) {
		Double importe = 0.0;
		contador_extracciones++;
		importe = super.extraer(monto);
		return importe;
	}

	public Double consultarSaldo() {
		Double saldo = super.getSaldo();
		if(contador_extracciones>=5) {
			saldo -= 6;
			return saldo;
		}
		return saldo;
	}
}
