package Excepciones;

import javax.swing.JOptionPane;

public class Division {
	
	public static void main(String[] args) {
		try {
			dividir();
		}
		catch(ArithmeticException e) {
			System.out.println("estas dividiendo por cero");
//			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("no es un numero");
//			System.out.println(e.getMessage());
			System.out.println("se ha generado un error de este tipo: "+e.getClass().getName());
		}
	}

	private static void dividir() throws ArithmeticException, NumberFormatException{
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
		System.out.println(num1/num2);
	}
	
	
}
