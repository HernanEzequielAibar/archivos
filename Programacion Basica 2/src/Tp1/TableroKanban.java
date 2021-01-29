package Tp1;

import java.util.Set;
import java.util.TreeSet;

public class TableroKanban {
	
	private Set<Tareas> tareas_pendientes;
	private String nombre_tarea;
	private Set<Tareas> tareas_enCurso;
	private Set<Tareas> tareas_terminadas;
	
	public TableroKanban(String nombre) {
		this.nombre_tarea = nombre;
		this.tareas_pendientes = new TreeSet<Tareas>();
		this.tareas_enCurso = new TreeSet<Tareas>();
		this.tareas_terminadas = new TreeSet<Tareas>();
	}
	
	public boolean agregarUnaNuevaTareaPendiente(Tareas nueva_tarea) throws TareaYaExistente {
		if(!buscarTareaYaExistente(nueva_tarea)) {
			return this.tareas_pendientes.add(nueva_tarea);
		}
		throw new TareaYaExistente("La terea ya existe");
	}
	
	public boolean pasarTareaPendienteAEnCurso(Tareas nueva_tarea) throws TareaYaEnCurso, TareaYaExistente {
		if(buscarTareaYaExistente(nueva_tarea)) {
			if(!buscarTareaEnCurso(nueva_tarea)) {
				return this.tareas_enCurso.add(nueva_tarea);
			}
			else throw new TareaYaEnCurso("La tarea ya esta en curso y no se puede acceder");
		}
		return agregarUnaNuevaTareaPendiente(nueva_tarea);
	}
	
	public boolean terminarTareaEnCurso(Tareas nueva_tarea) throws TareaYaExistente, TareaYaEnCurso, TareaYaTerminada {
		if(buscarTareaYaExistente(nueva_tarea)) {
			if(buscarTareaEnCurso(nueva_tarea)) {
				if(!buscarTareaTerminada(nueva_tarea)) {
					return this.tareas_terminadas.add(nueva_tarea);
				}
				throw new TareaYaTerminada("La tarea ya esta finalizada");
			}
			return this.pasarTareaPendienteAEnCurso(nueva_tarea);
		}
		return this.agregarUnaNuevaTareaPendiente(nueva_tarea);
	}
	
	public boolean buscarTareaTerminada(Tareas nueva_tarea) {
		for (Tareas aBuscar : tareas_terminadas) {
			if(aBuscar.getNombre().equals(nueva_tarea.getNombre())) {
				return true;
			}
		}
		return false;
	}

	public boolean buscarTareaEnCurso(Tareas nueva_tarea) {
		for (Tareas aBuscar : tareas_enCurso) {
			if(aBuscar.getNombre().equals(nueva_tarea.getNombre())) {
				return true;
			}
		}
		return false;
	}

	public boolean buscarTareaYaExistente(Tareas nueva_tarea) {
		for (Tareas aBuscar : tareas_pendientes) {
			if(aBuscar.getNombre().equals(nueva_tarea.getNombre()))
				return true;
		}
		return false;
	}

	public String getNombre_tarea() {
		return nombre_tarea;
	}


}
