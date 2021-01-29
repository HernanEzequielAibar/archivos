package PrimerEjemplo;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import Interfaces.DameHora;

public class Main {

	@Test
	public void primerEjemplo() {
	/*Empezamos con el curso de java
	 * y lo primero que hacemos es un
	 * Hola Mundo*/
		System.out.println("Hola Mundo");
	}
	
	@Test 
	public void variables() {
	/*Declaramos variable(Reservamos un espacio en memoria)*/
		byte edad;
	/*Inicializamos variable(Utilizamos el espacio reservado)*/
		edad = 20;
		System.out.println("Tu edad es: "+edad+" años");
	/*Declaracion e Inicializacion en una linea*/
		byte edad2 = 20;
		System.out.println("Tu edad 2 es: "+edad2+" años");
		
	}
	
	@Test
	public void operadoresAritmeticos() {
		int a = 5;
	/*Declaramos variable(Reservamos un espacio en memoria)*/
		int b;
	/*Declaracion e Inicializacion en una linea*/
		b = 7;
	/*Utilizamos operadores aritmeticos*/
		int c = a+b;
	/*incrementamos el valor de c(tendria que dar 13)*/
		c++;
		System.out.println(c);
	/*decrementamos el valor de c(tendria que dar 12)*/
		c--;
		System.out.println(c);
	/*Utilizamos operadores aritmeticos(ahora dividimos)*/
		double a2 = 5;
		double b2 = 7;
		double c2 = b2/a2;
		System.out.println(c2);
	}
	
	@Test
	public void constantes() {
	/*Declaramos una variable*/
		final int c = 5;
		System.out.println(c);
	/*Ejemplo*/
		final double unaPulgadaACentimetro= 2.54;
		double cm = 6;
		double resultado = cm/unaPulgadaACentimetro;
		System.out.println("En "+cm+" cm hay "+resultado+" pulgadas");
	
	}
	
	@Test
	public void claseMath() {
	/*Metodo sqrt*/
	// Inicializamos la variable
		int operador1 = 4;
	// Utilizamos la clase math para calcular la raiz
		double resultado = Math.sqrt(operador1);
		System.out.println(resultado);
	
	/*Metodo round*/
		double operador2 = 5.85;
		int resultado2 = (int)Math.round(operador2); 
		System.out.println(resultado2);
	
	/*Metodo pow*/
		double base, exponente;
		base = 5;
		exponente = 3;
		int resultado3 = (int)Math.pow(base, exponente);
		System.out.println("El resultado de elevar "+base+" al "+exponente+" da como resultado "+resultado3);
	}
	
	@Test
	public void claseString() {
	/*Creamos un objeto de la clase String*/
	//Metodo lenght() y charAt()
		String mi_nombre = "Ezequiel";
		System.out.println(mi_nombre);
		System.out.println("Mi nombre tiene: "+mi_nombre.length()+" letras");
		System.out.println("La primera letra de " +mi_nombre+ " es la: "+mi_nombre.charAt(0));
		
		int ultimaLetra = mi_nombre.length();
		System.out.println("La ultima letra es la: "+mi_nombre.charAt(ultimaLetra-1));
	
	//Metodo subString()
		String frase = "Hoy hace un calor terrible";
		String frase_resumen = frase.substring(12, frase.length());
		System.out.println(frase_resumen);
		
	//Metodo equals() y equalsIngnoreCase()
		String alumno1, alumno2;
		alumno1 = "David";
		alumno2 = "David";
		
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
	}
	
	@Test
	public void entradaDeDatosScanner() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.print("Introduce tu edad: ");
		int edad = teclado.nextInt();
		teclado.close();
		System.out.println("Hola "+nombre+ " el año que viene tendras "+(edad+1));
		
		
	}
	
	@Test
	public void entradaDeDatosJOptionPane() {
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		edad++;
		System.out.println("Hola "+nombre+ " el año que viene tendras "+edad);
		
	}
	
	@Test 
	public void condicionalesYBucles() {
	/*Instaciamos el objeto teclado*/
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad = teclado.nextInt();
		
		if(edad<18) {
			System.out.println("eres un adolecente");
		}
		else if(edad<40) {
			System.out.println("eres joven");
		}
		else if(edad<65) {
			System.out.println("eres bastante grande");
		}
		else {
			System.out.println("Cuidate");
		}
	}
	
	@Test
	public void condicionalSwitch() {
	/*Instaciamos el objeto teclado*/
		Scanner teclado = new Scanner(System.in);
		System.out.println("Hoy vamos a calcular el area de distitas figuras");
		System.out.println("Elije una opcion: \n 1- Cuadraro "
		+ "\n 2- Rectangulo \n 3- Trinagulo \n 4- Circulo" );
		int opcion = 0;
		try {
			opcion = teclado.nextInt();
		}catch(Exception e) {
			System.out.println("Ha ocurrido un error");
		}finally {
		teclado.close();
		}
		
		switch (opcion) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El area del cuadrado es: "+(Math.pow(lado, 2))+" cm2");
			break;
		
		case 2:
			int base =  Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es: "+(base*altura)+" cm2");
			break;
		
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			System.out.println("El area del triangulo es: "+((base*altura)/2)+" cm2");
			break;
		
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.println("El area del circulo es: "+(Math.PI*(Math.pow(radio, 2)))+" cm2");
			break;
		
		default:
			System.out.println("Opcion invalidad");
			break;
		}
	}
	
	@Test
	public void bucleWhile1() {
		String clave = "Ezequiel";
		String contraseña = "";
		while(!clave.equals(contraseña)) {
			contraseña = JOptionPane.showInputDialog("Introduce la contraseña");
			if(clave.equals(contraseña)==false) {
				System.out.println("Contraseña Incorrecta");
			}
		}
		System.out.println("Contraseña Correcta");
	}
	
	@Test
	public void bucleWhile2() {
		Scanner teclado = new Scanner(System.in);
		int numeroAadivinar = (int)(Math.random()*100);
		System.out.println(numeroAadivinar);
		int numeroUsuario = 0;
		int numeroDeIntentos = 0;
		
		while(numeroAadivinar!=numeroUsuario) {
			numeroDeIntentos++;
			System.out.println("Introduce un numero que este entre 0 y 100");
			numeroUsuario = teclado.nextInt();
			
			if(numeroUsuario<numeroAadivinar) {
				System.out.println("el numero ingresado es menor que el numero generado");
				
			}
			else if(numeroUsuario>numeroAadivinar) {
				System.out.println("el numero ingresado es mayor que el numero generado");
			
			}
			
		}
		System.out.println("acertaste, numero de intentos: "+numeroDeIntentos);
	}
	
	@Test
	public void bucleDoWhile() {
		Scanner teclado = new Scanner(System.in);
		int numeroAadivinar = (int)(Math.random()*100);
		System.out.println(numeroAadivinar);
		int numeroUsuario = 0;
		int numeroDeIntentos = 0;
		do {
			numeroDeIntentos++;
			System.out.println("Introduce un numero que este entre 0 y 100");
			numeroUsuario = teclado.nextInt();
			
			if(numeroUsuario<numeroAadivinar) {
				System.out.println("el numero ingresado es menor que el numero generado");
				
			}
			else if(numeroUsuario>numeroAadivinar) {
				System.out.println("el numero ingresado es mayor que el numero generado");
			
			}
		} while (numeroAadivinar!=numeroUsuario);
		
		System.out.println("acertaste, numero de intentos: "+numeroDeIntentos);
	}
	
	@Test
	public void pesoIdeal() {
		String genero = "";
		do {
			genero = JOptionPane.showInputDialog("Introduce tu genero(H/M)");
		} while (!genero.equalsIgnoreCase("H")&&!genero.equalsIgnoreCase("M"));
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		int pesoIdeal = 0;
		if(genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura - 110;
		}
		else if(genero.equalsIgnoreCase("M")) {
			pesoIdeal = altura - 120;
		}
		System.out.println("Tu peso ideal es "+pesoIdeal+" kilos");
	}
	
	@Test
	public void bucleFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hola Ezequiel");
		}
	}
	
	@Test
	public void direccionDeCorreo() throws EmailCorto{
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
	
	@Test 
	public void factorial() {
		int factorial = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		int numero = 1;
		for (int i = factorial; i>0; i--) {
			numero = numero*i;
			System.out.println(numero);
		}
	}
	
	@Test
	public void arrays() {
		int [] mi_array = new int[10];
		for (int i = 0; i < mi_array.length; i++) {
			mi_array[i] = i;
		}
			
		for (int i = 0; i < mi_array.length; i++) {
			System.out.println(mi_array[i]);
		}
	}
	
	@Test
	public void bucleforEach() {
		Scanner teclado = new Scanner(System.in);
		String [] mi_array = new String [5];
		
		for (int i = 0; i < mi_array.length; i++) {
			System.out.println("Ingresa paises");
				mi_array[i] = teclado.nextLine();
		}
		
		System.out.println("***");
		for (String string : mi_array) {
			System.out.println(string);
		}
		
		
//		System.out.println("**");
//		for (int i = 0; i < mi_array.length; i++) {
//			System.out.println(mi_array[i]);
//		}
		
	}
	
	@Test
	public void numerosAleatorios() {
		int [] matriz = new int[150];
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = (int)(Math.random()*100);
		}
		for (int i : matriz) {
			System.out.print(i+" ");
		}
	}
	
	@Test
	public void ArraysBidemensionales() {
		Scanner teclado = new Scanner(System.in);
		int [][] matrix = new int [4][5];
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.println("valor:");
				matrix[i][j] = teclado.nextInt();
				System.out.print("posicion "+i+ ","+j+" "+matrix[i][j]);
			}
			System.out.println("****");
			for (int[] filas : matrix) {
				System.out.println();
				for (int z : filas) {
					System.out.println(z+" ");
				}
			}
		}
	
	}
	
	@Test
	public void ejercicioMatrizBidemencionales() {
		double acumulado;
		double interes = 0.10; 
		
		double [][] saldo = new double[6][5];
		
		for (int i = 0; i < saldo.length; i++) {
			saldo[i][0] = 10000.0;
			acumulado = 10000.0;
			for (int j = 1; j < saldo[i].length; j++) {
				acumulado = acumulado+(acumulado*interes);
				saldo[i][j] = acumulado;
			}
			interes += 0.01;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println();
			for (int j = 0; j < saldo[i].length; j++) {
				System.out.printf("%1.2f", saldo[i][j]);
				System.out.print(" ");
			}
		}
	}
	
	@Test
	public void test() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca su talla:");
		System.out.println("S,M,L,XL");
		
		String tallas = teclado.next().toUpperCase();
		
		Tallas nuevas = Enum.valueOf(Tallas.class, tallas);
		
		System.out.println("Talla= "+ nuevas);
		
		System.out.println("abreviatura= "+nuevas.getAbreviatura());
		
	}
	
	@Test
	public void test2() {
		DameHora oyente = new DameHora();
		Timer nuevo = new Timer(5000, oyente);
		nuevo.start();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		Toolkit.getDefaultToolkit().beep();
		System.exit(0);
	}
}
