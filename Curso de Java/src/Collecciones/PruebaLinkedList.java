package Collecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {

	public static void main(String[] args) {
		LinkedList<String> Lista_personas = new LinkedList<String>();
		
		Lista_personas.add("Eze");
		Lista_personas.add("Rocio");
		Lista_personas.add("Carlos");
		Lista_personas.add("Maria");
		
		System.out.println(Lista_personas.size());
		
		ListIterator<String> it = Lista_personas.listIterator();
		
		it.next();
		it.add("Carlitos");
		
		for (String string : Lista_personas) {
			System.out.println(string);
		}
	}

}
