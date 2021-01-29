package Herencia;

public abstract class Persona {
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	private String nombre;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract String dameDescripcion();
}
