package Tp2;

public class SmartWatchDeportista{
	
	public SmartWatchDeportista(String nombre,Integer edad_actual
								,Double peso_actual,Double altura_actual,Integer pasos_diarios) {
		this.nombre = nombre;
		this.edad = edad_actual;
		this.altura = altura_actual;
		this.peso = peso_actual;
		this.pasos = pasos_diarios;
		this.distancia = 0;
	
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public Integer getEdad() {
		return this.edad;
	}
	
	public Double getPeso() {
		return this.peso;
	}
	
	public Double getAltura() {
		return this.altura;
	}
	
	public Integer getPasos() {
		return this.pasos;
	}
	
	public Integer getDistancia() {
		return this.distancia;
	}

	@Override
	public String toString() {
		return "SmartWatchDeportista [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura
				+ ", pasos=" + pasos + "]";
	}
	
	private String nombre;
	private Integer edad;
	private Double peso;
	private Double altura;
	private Integer pasos;
	private Integer distancia;

}
