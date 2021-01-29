package Herencia;

import Interfaces.Jefes;
import Interfaces.Trabajadores;
import POO.Empleado;

public final class Jefe extends Empleado implements Jefes{
	
	public Jefe(String nombre,Double sueldo,Integer anio,Integer mes,Integer dia) {
		super(nombre, sueldo, anio, mes, dia);
		this.incentivo = 0.0;
	}
	
	private Double incentivo;
	
	public void estableceIncentivo(Double nuevo_incentivo) {
		this.incentivo = nuevo_incentivo;
	}
	
	public Double getSueldo() {
		Double sueldoJefe = super.getSueldo();
		sueldoJefe += this.incentivo;
		return sueldoJefe;
	}

	@Override
	public String tomarDecisiones(String decicion) {
		return "Un miembro de la direccion ha tomado la decision "+decicion;
	}

	@Override
	public Double establecerBonus(Double nuevo_bonus) {
		Double adicional_jefe = 2000.0;
		return Trabajadores.bonus_base + nuevo_bonus + adicional_jefe;
	}
}
