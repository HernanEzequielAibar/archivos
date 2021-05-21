package App_Viviendas;

public class Vivienda {

	public Vivienda(Integer codigo_vivienda,Double metros_tereno,
					Double metros_edificados) {
		this.codigo_vivienda = codigo_vivienda;
		this.metros_edificados = metros_edificados;
		this.metros_terreno = metros_tereno;
	}
	
	public Integer getCodigo_vivienda() {
		return codigo_vivienda;
	}
	public Double getMetros_terreno() {
		return metros_terreno;
	}
	public Double getMetros_edificados() {
		return metros_edificados;
	}

	private Integer codigo_vivienda;
	private Double metros_terreno;
	private Double metros_edificados;
}
