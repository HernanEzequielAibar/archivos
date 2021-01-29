package PaginaCursos;

public class Curso implements Comparable<Curso>{

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Curso other = (Curso) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public Curso(Integer codigo,String nombre,Double valor_cuota) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = valor_cuota;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	
	@Override
	public int compareTo(Curso o) {
		return this.codigo.compareTo(o.getCodigo());
	}
	
	private Integer codigo;
	private String nombre;
	private Double precio;
	
	
}
