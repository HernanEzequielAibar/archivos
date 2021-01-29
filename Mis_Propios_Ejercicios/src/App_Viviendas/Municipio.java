package App_Viviendas;

import java.util.*;

public class Municipio {


	private String nombre;
	private String intendente_actual;
	private Set<Habitante> listaDeSolicitudesDelMunicipio;
	private Set<Municipio> listaMunicipal;
	private Map<Integer, Vivienda> adquisiciones;
	
	public Municipio(String nombre,String intendente_actual) {
		this.nombre = nombre;
		this.intendente_actual = intendente_actual;
		this.listaDeSolicitudesDelMunicipio = new HashSet<Habitante>();
		this.listaMunicipal = new HashSet<Municipio>();
		this.adquisiciones = new HashMap<Integer, Vivienda>();
	}
	
	public boolean agregarMunicipio(Municipio nuevo) {
		return this.listaMunicipal.add(nuevo);
	}
	
	public boolean RegistrarHabitanteAlMunicipio(Habitante persona1,String nombre_municipio) throws MunicipioInexistente, HabitanteNoRegistrado, HabitanteYaRegistrado {
		if(buscarMunicipio(nombre_municipio)) {
			if(!buscarHabitante(persona1)) {
				return this.listaDeSolicitudesDelMunicipio.add(persona1);
			}
			throw new HabitanteYaRegistrado();
		}
		return false;
	}

	private boolean buscarMunicipio(String nombre_municipio) throws MunicipioInexistente {
		for (Municipio municipio : listaMunicipal) {
			if(municipio.getNombre().equals(nombre_municipio))
				return true;
		}
		throw new MunicipioInexistente();
	}

	
	public boolean adquirirVivienda(Habitante persona1, Vivienda casa1) throws HabitanteNoRegistrado {
		if(buscarHabitante(persona1)) {
			this.adquisiciones.put(persona1.getDNI(), casa1);
			return true;
		}
		throw new HabitanteNoRegistrado();
	}
	
	private boolean buscarHabitante(Habitante persona1){
		for (Habitante habitante : listaDeSolicitudesDelMunicipio) {
			if(habitante.getDNI().equals(persona1.getDNI()))
				return true;
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}
	public String getIntendente_actual() {
		return intendente_actual;
	}

	public Integer getCantidadDeHabitantesEnLalista() {
		return this.listaDeSolicitudesDelMunicipio.size();
	}

	
	
}
