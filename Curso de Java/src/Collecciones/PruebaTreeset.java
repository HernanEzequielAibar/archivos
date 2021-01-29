package Collecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class PruebaTreeset {
	
	public static void main(String[] args) {
		
	
		Articulo nuevo = new Articulo(1, "Primer Articulo");
		Articulo nuevo2 = new Articulo(200, "Segundo Articulo");
		Articulo nuevo3 = new Articulo(3, "Tercer Articulo");
		
		TreeSet<Articulo> lista_articulo = new TreeSet<Articulo>();
		
		lista_articulo.add(nuevo3);
		lista_articulo.add(nuevo);
		lista_articulo.add(nuevo2);
		
		for (Articulo articulo : lista_articulo) {
			System.out.println(articulo.getDescripcion_articulo());
		}
		
//		Articulo comparador = new Articulo();
//		TreeSet<Articulo> lista2 = new TreeSet<Articulo>(comparador);
//		Comparador compara = new Comparador();
		TreeSet<Articulo> lista2 = new TreeSet<Articulo>(new Comparator<Articulo>() {
														@Override
														public int compare(Articulo o1, Articulo o2) {
															String descripcionA = o1.getDescripcion_articulo();
															String descripcionB = o2.getDescripcion_articulo();
															return descripcionA.compareTo(descripcionB);
														}});
		
		
		lista2.add(nuevo3);	//tercer
		lista2.add(nuevo); //primero
		lista2.add(nuevo2);//segunfo
		
		for (Articulo articulo : lista2) {
			System.out.println(articulo.getDescripcion_articulo());
		}
	}
	
}

 class Articulo implements Comparable<Articulo>{
		
		public Articulo(int num,String desc) {
			this.numero_articulo = num;
			this.descripcion_articulo = desc;
		}

		@Override
		public int compareTo(Articulo o) {
			return numero_articulo - o.getNumero_articulo();
		}
		
		public int getNumero_articulo() {
			return numero_articulo;
		}
		public String getDescripcion_articulo() {
			return descripcion_articulo;
		}

		private int numero_articulo;
		private String descripcion_articulo;
		
	}
 
