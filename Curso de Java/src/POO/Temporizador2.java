package POO;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador2 {
	
	public static void main(String[] args) {
		Reloj mireloj = new Reloj();
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "aceptar para detener");
		System.exit(0);
	}
}

class Reloj {
		
	public void enMarcha(int intervalo,boolean sonido) {
		/*comienza la clase interna local*/
		class DameLahora implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				Date nuevo = new Date();
				System.out.println("hora cada 3 seg " +nuevo);
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		/*continua el motodo*/
		ActionListener oyente = new DameLahora();
		Timer nuevo = new Timer(intervalo, oyente);
		nuevo.start();
	}

}