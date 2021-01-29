package Tp1;

public class Cliente implements Comparable<Cliente>{

	public Cliente(String nombre,Integer dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Integer getDni() {
		return this.dni;
	}
	private String nombre;
	private Integer dni;
	
	@Override
	public int compareTo(Cliente o) {
		return this.dni.compareTo(o.getDni());
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + "]";
	}
}
