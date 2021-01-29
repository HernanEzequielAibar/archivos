package MontaCargas;

import java.util.ArrayList;

public class MontaCargas {

	public MontaCargas(Double peso_maximo) {
		this.peso_maximo = peso_maximo;
	}
	
	public Double obtenerPeso() {
		Double carga_actual = 0.0;
		carga_actual = this.lista_cargas.get((lista_cargas.size())-1).getCarga();
		return carga_actual;
	}
	
	public Boolean cargar(Carga nueva_carga) {
		if(nueva_carga.getCarga()>this.peso_maximo) {
			return false;
		}
		return this.lista_cargas.add(nueva_carga);
	}
	
	public Boolean descargar() {
		if(lista_descarga.addAll(lista_cargas)) {
			this.lista_cargas.clear();
			return true;
		}
		return false;
	}
	
	public Double obtenerCargaPromedio() {
		Double promedio = 0.0;
		for (Carga carga : lista_descarga) {
			promedio += carga.getCarga();
		}
		promedio /= lista_cargas.size();
		return promedio;
	}
	
	private Double peso_maximo;
	private ArrayList<Carga> lista_cargas = new ArrayList<Carga>();
	private ArrayList<Carga> lista_descarga = new ArrayList<Carga>();
}
