package PaginaCursos;

public class Alumno {
	
	public Alumno(Integer codigo,String nombre,String telefono) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTelefono() {
		return telefono;
	}

	private Integer codigo;
	private String nombre;
	private String telefono;
	

}
