package Tp1;

@SuppressWarnings("serial")
public class ClienteExitente extends Exception {
	
	public ClienteExitente(String mensaje) {
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
