package Herencia;

import POO.Coche;

public class Camioneta extends Coche{

	private Integer capacidad_carga;
	private Integer plazas_extras;
		
	public Camioneta(Integer capacidad_carga, Integer plazas_extras) {
		super();
		this.capacidad_carga = capacidad_carga;
		this.plazas_extras = plazas_extras;
	}

	@Override
	public String toString() {
		return "Camioneta [capacidad_carga=" + capacidad_carga + ", plazas_extras=" + plazas_extras + "]";
	}
		
}
