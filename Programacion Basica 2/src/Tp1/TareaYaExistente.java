package Tp1;

@SuppressWarnings("serial")
public class TareaYaExistente extends Exception {
	
	public TareaYaExistente(String mensaje) {
		this.mensaje = mensaje;
	}
	private String mensaje;
	
	public String getMensaje() {
		return this.mensaje;
	}
}
