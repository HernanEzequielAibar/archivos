package POO;

import java.util.*;

import Herencia.Persona;
import Interfaces.Trabajadores;

public class Empleado extends Persona implements Comparable, Trabajadores{
		
	
	public Empleado(String nombre,Double sueldo, Integer anio, Integer mes,Integer dia) {
		super(nombre);
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		this.fecha_alta = calendario.getTime();
	}
	
	private Double sueldo;
	private Date fecha_alta;
	
	public Double getSueldo() {
		return this.sueldo;
	}
	
	public void pedirAumento(Double porcentaje_aumento) {
		Double aumento = (this.sueldo*porcentaje_aumento)/100;
		this.sueldo += aumento;
	}
	
	public Date getFecha() {
		return this.fecha_alta;
	}

	@Override
	public String toString() {
		return "Empleado [nombre="+super.getNombre()+"sueldo=" + sueldo + ", fecha_alta=" + fecha_alta +"]";
	}

	@Override
	public String dameDescripcion() {
		return "Este empleado tiene un nombre= "+super.getNombre()+ "con un sueldo de "+this.getSueldo();
	}

	@Override
	public int compareTo(Object o) {
		Empleado otro_empleado = (Empleado) o;
		if(this.sueldo<otro_empleado.sueldo) {
			return -1;
		}
		if(this.sueldo>otro_empleado.sueldo) {
			return 1;
		}
		return 0;
	}

	@Override
	public Double establecerBonus(Double nuevo_bonus) {
		return Trabajadores.bonus_base + nuevo_bonus;
	}



}
