package PaginaCursos;

import java.util.*;

public class PlataformaDeCursos {

	private String nombre;
	private Set<Curso> ListaDeCursos;
	private Map<String, Instructor> Lista_instructores;
	private Set<Alumno> lista_alumnos;
	private Integer contador;
	
	public PlataformaDeCursos(String nombre) {
		this.nombre = nombre;
		this.ListaDeCursos = new TreeSet<Curso>();
		this.Lista_instructores = new HashMap<String, Instructor>();
		this.lista_alumnos = new HashSet<Alumno>();
		this.contador = 0;
	}

	public boolean agregarCursoNuevo(Curso nuevo_curso) {
		return this.ListaDeCursos.add(nuevo_curso);
	}

	public Integer getCantidadDeCuros() {
		return this.ListaDeCursos.size();
	}

	public boolean designarInstructorAUnCursoNuevo(Curso nuevo_curso, Instructor nuevo_instructor) throws CursoInexistente,YaHayUnInstructorDesignadoAEseCurso{
		Instructor nuevo = this.Lista_instructores.get(nuevo_curso.getNombre());
		for (Curso actual : ListaDeCursos) {
			if(actual.getCodigo().equals(nuevo_curso.getCodigo())) {
				if(nuevo==null) {
					this.Lista_instructores.put(nuevo_curso.getNombre(), nuevo_instructor);
					return true;
				}
				else throw new YaHayUnInstructorDesignadoAEseCurso();
			}
		}
		throw new CursoInexistente();
	}

	public boolean agregarAlumnoAUnCurso(Curso nuevo_curso, Alumno nuevo_alumno) throws CursoInexistente, ElAlumnoYaEstaInscritoAlCurso, YaNoHayCuposDisponibles{
		Integer cupos_maximo = 5;
		contador++;
		if(contador<cupos_maximo) {
			if(buscarCurso(nuevo_curso)) {
				if(!buscarAlumnoExistente(nuevo_alumno)) {
					return this.lista_alumnos.add(nuevo_alumno);
				}
			}
		}
		throw new YaNoHayCuposDisponibles();
	}

	private boolean buscarCurso(Curso nuevo_curso) throws CursoInexistente{
		for (Curso curso : ListaDeCursos) {
			if(curso.getCodigo().equals(nuevo_curso.getCodigo()))
				return true;
		}
		throw new CursoInexistente();
	}

	private boolean buscarAlumnoExistente(Alumno nuevo_alumno) throws ElAlumnoYaEstaInscritoAlCurso {
		for (Alumno actual : lista_alumnos) {
			if(actual.getCodigo().equals(nuevo_alumno.getCodigo())) {
				throw new ElAlumnoYaEstaInscritoAlCurso();
			}
		}
		return false;
	}
	
	
}
