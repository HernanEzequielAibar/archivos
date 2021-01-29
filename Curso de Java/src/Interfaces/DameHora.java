package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DameHora implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("tengo la hora cada 5 seg "+ahora);
		
	}

}
