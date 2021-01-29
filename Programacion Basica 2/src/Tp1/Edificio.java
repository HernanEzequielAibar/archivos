package Tp1;

import java.util.Set;
import java.util.TreeSet;

public class Edificio {
	
	private String nombre;
	private Integer cantidad_pisos;
	private Integer capacidad_maxima;
	private Set<Persona> ascensor1_pisosPares;
	private Set<Persona> ascensor2_pisosPares;
	private Set<Persona> ascensor3_pisosImp;
	private Set<Persona> ascensor4_pisosImp;
	private Set<Persona> ascensor_clientes;
	private Integer capacidad_maxima2;
	
	public Edificio(String nombre, Integer cantidad_pisos) {
		this.nombre = nombre;
		this.cantidad_pisos = cantidad_pisos;
		this.capacidad_maxima = 0;
		this.capacidad_maxima2 = 0;
		this.ascensor1_pisosPares = new TreeSet<Persona>();
		this.ascensor2_pisosPares = new TreeSet<Persona>();
		this.ascensor3_pisosImp = new TreeSet<Persona>();
		this.ascensor4_pisosImp = new TreeSet<Persona>();
		this.ascensor_clientes = new TreeSet<Persona>();
	}
	
	public Double calcularTiempoQueTardaEnllegar(Integer numero_piso) throws PisoInexistente {
		if(numero_piso>cantidad_pisos || numero_piso<0) {
			throw new PisoInexistente();
		}
		final Double velocidad = 2.0;
		cantidad_pisos = numero_piso;
		Double tiempo = 0.0;
		tiempo = cantidad_pisos/velocidad;
		
		return tiempo;
	}

	public boolean ingresaPersonaAlAscensor(Persona nueva_persona,Ascensor nuevo) throws PersonaAjenaAlaEmpresa,AscensoresLlenos{
		if(identificarPersona(nueva_persona)) {
			if(DesignarAscensorParOInpar(nuevo)) {
				return IngresarEmpleadoAscensor(nueva_persona,nuevo);
			}
			return IngresarEmpleadoAscensor(nueva_persona, nuevo);
		}
		else {
				return IngresarClienteAscensor(nueva_persona,nuevo);
		}
	}
	
	public boolean identificarPersona(Persona nueva_persona) throws PersonaAjenaAlaEmpresa{
		if(nueva_persona.getTipo().equals(Tipo_persona.EMPLEADO)) {
			return true;
		}
		else if(nueva_persona.getTipo().equals(Tipo_persona.CLIENTE)) {
			return false;
		}
		throw new PersonaAjenaAlaEmpresa("No se permite el ingreso a cualquier persona agena a la institucion");
	}
	
	public boolean DesignarAscensorParOInpar(Ascensor nuevo) {
		if(nuevo.getTipo().equals(TipoAscensor.PISO_PAR)) {
			return true;
		}
		return false;
	}
	

	public boolean IngresarEmpleadoAscensor(Persona nueva_persona, Ascensor nuevo) throws AscensoresLlenos{
		if(DesignarAscensorParOInpar(nuevo)) {
			capacidad_maxima++;
			if(capacidad_maxima<=nuevo.getCapacidad_maxima()) {
				return this.ascensor1_pisosPares.add(nueva_persona);
			}
			else capacidad_maxima2++;
				 if(capacidad_maxima2<=nuevo.getCapacidad_maxima()) {
				return this.ascensor2_pisosPares.add(nueva_persona);
			}
			capacidad_maxima = 0;
			capacidad_maxima2 = 0;
			throw new AscensoresLlenos("Todos los ascensores estan llenos");
		}
		else {
			capacidad_maxima++;
			if(capacidad_maxima<=nuevo.getCapacidad_maxima()) {
				return this.ascensor3_pisosImp.add(nueva_persona);
			}
			else capacidad_maxima2++;
				 if(capacidad_maxima2<=nuevo.getCapacidad_maxima()) {
				return this.ascensor4_pisosImp.add(nueva_persona);
			}
			throw new AscensoresLlenos("Todos los ascensores estan llenos");
		}
		
	}
	
	public  boolean IngresarClienteAscensor(Persona nueva_persona, Ascensor nuevo) throws AscensoresLlenos{
		capacidad_maxima++;
		if(capacidad_maxima<=nuevo.getCapacidad_maxima()) {
			return this.ascensor_clientes.add(nueva_persona);
		}
		throw new AscensoresLlenos("Todos los ascensores estan llenos");
	}

	
}
