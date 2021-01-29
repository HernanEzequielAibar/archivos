package POO;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

import Herencia.Alumno;
import Herencia.Jefe;
import Herencia.Persona;

public class TestEmpleado {

	@Test
	public void empleado() {
		Empleado empleado1 = new Empleado("Ezequiel", 2000.0, 2020, 02, 01);
		Empleado empleado2 = new Empleado("Ricardo", 1000.0, 2020, 05, 01);
		Empleado empleado3 = new Empleado("Raquel", 3000.0, 2019, 02, 01);
	
		empleado1.pedirAumento(5.0);
		System.out.println("el sueldo de "+empleado3.getNombre()+  " es: "+empleado1.getSueldo());
		
		empleado2.pedirAumento(5.0);
		System.out.println("el sueldo de "+empleado2.getNombre()+  " es: "+empleado2.getSueldo());
		
		empleado3.pedirAumento(5.0);
		
		System.out.println("el sueldo de "+empleado3.getNombre()+ " es: "+empleado3.getSueldo());
		
	}
	
	@Test
	public void Arrayempleado() {
		Empleado empleado1 = new Empleado("Ezequiel", 2000.0, 2020, 02, 01);
		Empleado empleado2 = new Empleado("Ricardo", 1000.0, 2020, 05, 01);
		Empleado empleado3 = new Empleado("Raquel", 3000.0, 2019, 02, 01);
		Empleado empleado4 = new Empleado("Carlos", 1500.0, 2020, 02, 01);
		Empleado[] mis_empleados = new Empleado[4];
		
		mis_empleados[0] = empleado1;
		mis_empleados[1] = empleado2;
		mis_empleados[2] = empleado3;
		mis_empleados[3] = empleado4; 
		
		for (Empleado empleado : mis_empleados) {
			empleado.pedirAumento(5.0);
		}
		
		for (Empleado empleado : mis_empleados) {
			System.out.println(empleado.toString());
		}		
		
	}
	
	@Test
	public void polimorfismo() {
		Empleado empleado1 = new Empleado("Ezequiel", 2000.0, 2020, 02, 01);
		Empleado empleado2 = new Empleado("Ricardo", 1000.0, 2020, 05, 01);
		Empleado empleado3 = new Empleado("Raquel", 3000.0, 2019, 02, 01);
		Empleado empleado4 = new Empleado("Carlos", 1500.0, 2020, 02, 01);
		Jefe nuevo = new Jefe("Ricadro", 55000.0, 2020, 12, 01);
		
		nuevo.estableceIncentivo(2570.0);
		
		
		Empleado[] mis_empleados = new Empleado[6];
		
		mis_empleados[0] = empleado1;
		mis_empleados[1] = empleado2;
		mis_empleados[2] = empleado3;
		mis_empleados[3] = empleado4; 
		mis_empleados[4] = nuevo;
		mis_empleados[5] = new Jefe("maria", 9500.0, 2020, 12, 02);
		
		for (Empleado empleado : mis_empleados) {
			empleado.pedirAumento(5.0);
		}
		
		for (Empleado empleado : mis_empleados) {
			System.out.println(empleado.getSueldo());
		}		
	
	}
	
	@Test
	public void refundicionDeObjetos() {
		Empleado empleado1 = new Empleado("Ezequiel", 2000.0, 2020, 02, 01);
		Empleado empleado2 = new Empleado("Ricardo", 1000.0, 2020, 05, 01);
		Empleado empleado3 = new Empleado("Raquel", 3000.0, 2019, 02, 01);
		Empleado empleado4 = new Empleado("Carlos", 1500.0, 2020, 02, 01);
		
		Jefe nuevo = new Jefe("Ricadro", 55000.0, 2020, 12, 01);
		
		nuevo.estableceIncentivo(2570.0);
		
		
		Empleado[] mis_empleados = new Empleado[6];
		
		mis_empleados[0] = empleado1;
		mis_empleados[1] = empleado2;
		mis_empleados[2] = empleado3;
		mis_empleados[3] = empleado4; 
		mis_empleados[4] = nuevo;
		mis_empleados[5] = new Jefe("maria", 9500.0, 2020, 12, 02);
		
		Jefe nuevo_jefe = (Jefe) mis_empleados[5];
		nuevo_jefe.estableceIncentivo(2000.0);
		
		System.out.println(nuevo_jefe.tomarDecisiones("Dar mas dias de vacaciones a los empleados"));
		System.out.println("El jefe "+nuevo_jefe.getNombre()+"tiene bonus de "+nuevo_jefe.establecerBonus(500.0));
		System.out.println(mis_empleados[3].getNombre()+"tiene bonus de "+ mis_empleados[3].establecerBonus(200.0));
		for (Empleado empleado : mis_empleados) {
			empleado.pedirAumento(5.0);
		}
		
		Arrays.sort(mis_empleados);
		
		for (Empleado empleado : mis_empleados) {
			System.out.println(empleado.dameDescripcion());
		}		
	
	}
	
	@Test
	public void clasesAbstract() {
		Persona[] personas = new Persona[2];
		personas[0] = new Empleado("Ezequiel", 2000.0, 2020, 02, 01);
		personas[1] = new Alumno("Ezequiel", "Desarrollo web");
	
		for (Persona persona : personas) {
			System.out.println(persona.dameDescripcion());
		}
	}
	
	@Test 
	public void interfacesUsoDeInstanceof() {
		Empleado director_comercial = new Jefe("Sandra", 2000.0, 2020, 12, 01);
		// como implmenta la interfaz comparable podemos hacer esto
		Comparable ejemplo = new Jefe("carlos", 2000.0, 2020, 10, 02);
		
		if(director_comercial instanceof Empleado) {
			System.out.println("es de tipo jefatura");
		}
		
		if(ejemplo instanceof Comparable) {
			System.out.println("implemanta la interfaz comparable");
		}
		
		/*el instanceof se puede usar tatno en clases como para interfaces*/
	}
	
	@Test
	public void test4() {
		Empleado empleado1 = new Empleado("Ezequiel", 2000.0, 2020, 02, 01);
		Empleado empleado2 = new Empleado("Ricardo", 1000.0, 2020, 05, 01);
		Empleado empleado3 = new Empleado("Raquel", 3000.0, 2019, 02, 01);
		Empleado empleado4 = new Empleado("Carlos", 1500.0, 2020, 02, 01);
		
		ArrayList<Empleado>lista_empleado = new ArrayList<Empleado>();
		assertTrue(lista_empleado.add(empleado1));
		assertTrue(lista_empleado.add(empleado2));
		assertTrue(lista_empleado.add(empleado3));
		assertTrue(lista_empleado.add(empleado4));

		System.out.println(lista_empleado.size());
		
		Iterator<Empleado> iterador = lista_empleado.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next().dameDescripcion());
		}
	
	}	
}
