package Collecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CueantaUsuarios {
	
	public static void main(String[] args) {
		Clientes cl1 = new Clientes("Ezequiel", 00001, 2000.0);
		Clientes cl2 = new Clientes("Rocio", 00002, 3000.0);
		Clientes cl3 = new Clientes("Raquel", 00003, 4000.0);
		Clientes cl4 = new Clientes("Carlos", 00004, 5000.0);
		Clientes cl5 = new Clientes("Rocio", 00002, 3000.0);
		Set<Clientes>lista_cliente = new HashSet<Clientes>();
		
		lista_cliente.add(cl1);
		lista_cliente.add(cl2);
		lista_cliente.add(cl3);
		lista_cliente.add(cl4);
		lista_cliente.add(cl5);
		
	
		lista_cliente.remove(cl5);
//		for (Clientes c : lista_cliente) {
////			System.out.println(c.getNombre()+" "
////					+c.getNro_cuenta()+" "+c.getSaldo());
//			if(c.getNombre().equals("Raquel")) {
//				lista_cliente.remove(c);
//			}
//		}
//		
		Iterator<Clientes> it = lista_cliente.iterator();
		
		while(it.hasNext()) {
			String nombre = it.next().getNombre();
			if(nombre.equals("Raquel")) {
				it.remove();
			}
		}
		for (Clientes clientes : lista_cliente) {
			System.out.println(clientes.getNombre());
		}
		
//		while(it.hasNext()) {
//			
//			String nombre_cliente = it.next().getNombre();
//			System.out.println(nombre_cliente);
//			
//		}
		
		
	}
}
