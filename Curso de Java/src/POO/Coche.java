package POO;

public class Coche {
	
	//fijos
	private Integer ruedas;
	private Integer largo;
	private Integer ancho;
	private Integer medida_motor;
	private Integer peso_plataforma;
	
	//variables	
	private String color;
	private Integer peso_final;
	private Boolean asientos_cuero;
	private Boolean aire_acondicionado;
	
	public Coche() {
		this.ruedas = 4;
		this.largo = 2000;
		this.ancho = 300;
		this.peso_plataforma = 500;
		this.medida_motor = 1600;
	}
	
	public Integer getRuedas() {
		return this.ruedas;
	}
	
	public void setRuedas(Integer nuevaRueda) {
		this.ruedas = nuevaRueda;
	}
	
	public Integer getAncho() {
		return this.ancho;
	}
	
	public void setAncho(Integer nuevoAncho) {
		this.ancho = nuevoAncho;
	}
	
	public Integer getLargo() {
		return this.largo;
	}
	
	public void setLargo(Integer nuevoLargo) {
		this.largo = nuevoLargo;
	}
	
	public void setColor(String nuevoColor) {
		this.color = nuevoColor;
	}
	
	public String getColor(){
		return this.color;
	}

	public Integer getMedida_motor() {
		return medida_motor;
	}

	public void setMedida_motor(Integer medida_motor) {
		this.medida_motor = medida_motor;
	}

	public Integer getPeso_plataforma() {
		return peso_plataforma;
	}

	public void setPeso_plataforma(Integer peso_plataforma) {
		this.peso_plataforma = peso_plataforma;
	}

	public String datosGenerales() {
		return "la plataforma del vehiculo tiene: "+this.ruedas+" ruedas"+
		" mide: "+this.largo+" cm de largo, con un ancho de "+this.ancho+ 
		"cm de ancho, y con "+"peso de "+this.peso_plataforma+" kilos";
	}
	
	public void setAsientos(String nuevosAsientos) {
		if(nuevosAsientos.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		}
		else 
			this.asientos_cuero = false;
	}
	
	public String getAsientos() {
		if(asientos_cuero) {
			return "El coche tiene asientos de cuero"; 
		}
		return "El coche no tiene asientos de cuero";
	}
	
	public void setAireAcondicionado(String aire) {
		if(aire.equalsIgnoreCase("si")) {
			this.aire_acondicionado = true;
		}
		else
			this.aire_acondicionado = false;
	}
	
	public String getAireAcondicionado() {
		if(aire_acondicionado) {
			return "El coche tiene aire acodicionado";
		}
		return "El coche no tiene aire acondicionado";
	}
	
	public String dime_pesoCoche() {
		Integer peso_carroceria = 500;
		this.peso_final = peso_plataforma + peso_carroceria;
		if(this.asientos_cuero) {
			this.peso_final += 50;
		}
		if(this.aire_acondicionado) {
			this.peso_final += 20;
		}
		return "El peso del coche es "+this.peso_final+" kilos";
	}
	
	public Integer precioCoche() {
		Integer precio_final = 10000;
		if(this.aire_acondicionado) {
			precio_final += 1500;
		}
		if(this.asientos_cuero) {
			precio_final += 2000;
		}
		return precio_final;
	}
}

