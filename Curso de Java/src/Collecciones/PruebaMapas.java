package Collecciones;

import java.util.HashMap;
import java.util.Map;

public class PruebaMapas {

	public static void main(String[] args) {
		
		HashMap<String,Empleado> personal = new HashMap<String, Empleado>(); 
		
		personal.put("145", new Empleado("Ana"));
		personal.put("146", new Empleado("Carlos"));
		personal.put("147", new Empleado("Clotilde"));
		personal.put("148", new Empleado("Richard"));
		
		
//		personal.remove("147");
//		System.out.println(personal);
//		personal.putIfAbsent("147", new Empleado("Ezequiel"));
//		System.out.println(personal);
//		personal.putIfAbsent("148", new Empleado("Sandra"));
//		System.out.println(personal);
		
//		System.out.println(personal.entrySet());
		
		for(Map.Entry<String, Empleado> entrada: personal.entrySet() ) {
			String key = entrada.getKey();
			Empleado valor = entrada.getValue();
			System.out.println(key+" "+valor);
		}
	}

}

class Empleado{
	

	public Empleado(String nombre) {
		this.nombre = nombre;
		sueldo = 2000.0;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	private String nombre;
	private Double sueldo;
}
