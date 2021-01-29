package CuentasBancarias;

public class CuentaCorriente extends CuentaBancaria{

	public CuentaCorriente(Double saldo) {
		super(saldo);
		this.saldo_descubierto = 150.0;
		this.deuda = 0.0;
		this.importeAdicional = (100*0.05);
	}
		
	private Double saldo_descubierto;
	private Double deuda;
	private Double importeAdicional;
	
	public Double extraer(Double monto) {
		Double importe = 0.0;
		if(monto<=super.getSaldo()) {
			importe = super.extraer(monto);
		}
		else if(monto<=(super.getSaldo()+this.saldo_descubierto)) {
				saldo_descubierto -= (monto - super.getSaldo());
				deuda = (monto - super.getSaldo())+ (importeAdicional);
				importe = super.extraer(monto);
		}
	
		return importe;
	}
	
	public Double getSaldo() {
		return super.getSaldo();
	}
	
	public Double consultarSaldo() {
		return super.getSaldo();
	}
	
	public Double consultarSaldoDescubierto() {
		return this.saldo_descubierto;
	}
	
	public Double consultarDeuda() {
		return this.deuda;
	}
}
