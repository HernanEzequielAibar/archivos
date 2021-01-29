package App_Viviendas;

import java.util.*;

public class Habitante {

	private String tipo;
	private Integer DNI;
	private String nombre;
	private Map<Habitante,Municipio> Municipio_perteneciente;
	
	public Habitante(String tipo,Integer dni, String nombre) {
		this.DNI = dni;
		this.nombre = nombre;
		this.tipo = tipo;
		this.Municipio_perteneciente = new HashMap<Habitante, Municipio>(); 
	}
	
	public String getTipo() {
		return tipo;
	}

	public Integer getDNI() {
		return DNI;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
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
		Habitante other = (Habitante) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		return true;
	}
	
	
	
}
