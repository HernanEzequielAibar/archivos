package Tp2;

public class SWModoNatacion extends SmartWatchDeportista{

	public SWModoNatacion(String nombre, Integer edad_actual, Double peso_actual, Double altura_actual,
			Integer pasos_diarios) {
		super(nombre, edad_actual, peso_actual, altura_actual, pasos_diarios);
		this.ritmo = 0;
	}
	
	public Integer getRitmo() {
		return this.ritmo;
	}
	private Integer ritmo;
}
