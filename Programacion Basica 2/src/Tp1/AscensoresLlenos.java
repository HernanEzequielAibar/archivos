package Tp1;

@SuppressWarnings("serial")
public class AscensoresLlenos extends Exception {

	public AscensoresLlenos(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return this.mensaje;
	}
	
	private String mensaje;
}
