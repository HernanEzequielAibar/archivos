package Tp1;

@SuppressWarnings("serial")
public class PersonaAjenaAlaEmpresa extends Exception {

	public PersonaAjenaAlaEmpresa(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return this.mensaje;
	}
	private String mensaje;
}
