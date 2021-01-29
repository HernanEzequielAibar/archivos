package Excepciones;

import javax.swing.JOptionPane;

import PrimerEjemplo.EmailCorto;

public class Fallos {

		public static void main(String[] args) {
			try {
				direccionDeCorreo();
			} catch (EmailCorto e) {
			System.out.println("direccion incorrecta");
			e.printStackTrace();
		}
		
		}

		private static void direccionDeCorreo() throws EmailCorto {
			String correo = JOptionPane.showInputDialog("Introduce correo");
			int contadorArrobas = 0;
			boolean punto = false;
			
			if(correo.length()<=3) {
				throw new EmailCorto("email corto");
			
			}
			for (int i = 0; i < correo.length(); i++) {
				if(correo.charAt(i)=='@') {
					contadorArrobas++;
				}
				if(correo.charAt(i)=='.') {
					punto = true;
				}
			}
			
			if(contadorArrobas==1 && punto==true) {
				System.out.println("Es correcto");
			}
			else {
				System.out.println("No es correcto");
			}
		}
			
		
		
}

