package Tp2;

public class SWModoCarrera extends SmartWatchDeportista{

	public SWModoCarrera(String nombre, Integer edad_actual, 
						 Double peso_actual, Double altura_actual,Integer pasos_diarios) {
		super(nombre, edad_actual, peso_actual, altura_actual, pasos_diarios);
		this.ritmo = 0;
		this.frecuencia_cardiaca = 0;
	}
	

	public Integer getRitmo() {
		return this.ritmo;
	}
	
	public Integer getFrecuencia() {
		return this.frecuencia_cardiaca;
	}
		
	public Double getTiempo() {
		return this.tiempo;
	}
	
	public void empezar(Integer distancia) {
		Integer segundo = 0;
		int pulso = 0;
		Integer distancia_actual = 0;
		Integer distancia_recorrida = 0;
		Integer pasos = 0;
		this.distancia = distancia*10000;
		for (int i = 0; i < this.distancia; i++) {
			segundo++;
			pulso++;
			distancia_actual++;
			tiempo = (double) pulso;
			pasos++;
			if(distancia_actual==100)
				distancia_recorrida ++;
				distancia_actual = 0;
				
		}
	
	}
	

	private Double tiempo;
	private Integer distancia;
	private Integer ritmo;
	private Integer frecuencia_cardiaca;
}
