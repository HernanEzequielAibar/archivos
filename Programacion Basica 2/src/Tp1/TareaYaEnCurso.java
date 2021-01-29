package Tp1;

@SuppressWarnings("serial")
public class TareaYaEnCurso extends Exception {

	public TareaYaEnCurso(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return this.mensaje;
	}
	private String mensaje;
	
}
