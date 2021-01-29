package Herencia;

public class Alumno extends Persona{

	public Alumno(String nombre,String carrera) {
		super(nombre);
		this.carrera_estudiando = carrera;
	}
	private String carrera_estudiando;
	
	public String getCarrera() {
		return this.carrera_estudiando;
	}
	
	@Override
	public String dameDescripcion() {
		return "Este alumno tiene un nombre "+super.getNombre()+" y estudia la carrera "+this.carrera_estudiando;
	}

}
