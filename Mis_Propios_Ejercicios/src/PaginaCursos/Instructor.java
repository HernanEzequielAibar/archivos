package PaginaCursos;

public class Instructor {

	public Instructor(Integer codigo,String nombre,String correo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.correo = correo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCorreo() {
		return correo;
	}

	private Integer codigo;
	private String nombre;
	private String correo;
}
