package Tp2;

public class SWModoCiclismo extends SmartWatchDeportista{

	public SWModoCiclismo(String nombre, Integer edad_actual, Double peso_actual, Double altura_actual,
			Integer pasos_diarios) {
		super(nombre, edad_actual, peso_actual, altura_actual, pasos_diarios);
		this.cadencia = 0;
		this.frecuencia_cardiaca = 0;
		this.velocidad = 0.0;
	}

	public Double getVelocidad() {
		return this.velocidad;
	}
	
	public Integer getFrecuencia() {
		return this.frecuencia_cardiaca;
	}
	
	public Integer getCadencia() {
		return this.cadencia;
	}
	
	private Double velocidad;
	private Integer frecuencia_cardiaca;
	private Integer cadencia;
}
