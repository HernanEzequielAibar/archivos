package Tp1;

public class Persona implements Comparable<Persona>{

	public Persona(String nombre, String dni,Tipo_persona tipo) {
		this.nombre = nombre;
		this.dni = dni;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public Tipo_persona getTipo() {
		return this.tipo;
	}
	
	private String dni;
	private String nombre;
	private Tipo_persona tipo;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public int compareTo(Persona o) {
		return this.dni.compareTo(o.getDni());
	}
	
}
