package Tp1;

@SuppressWarnings("serial")
public class TareaYaTerminada extends Exception {

	public TareaYaTerminada(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getMensaje() {
		return this.mensaje;
	}
	private String mensaje;
}
