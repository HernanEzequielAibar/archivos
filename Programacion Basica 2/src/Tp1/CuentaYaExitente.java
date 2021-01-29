package Tp1;

@SuppressWarnings("serial")
public class CuentaYaExitente extends Exception {

	public CuentaYaExitente(String mensaje) {
		this.mensaje = mensaje;
	}
	
	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}

