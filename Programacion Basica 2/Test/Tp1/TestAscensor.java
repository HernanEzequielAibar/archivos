package Tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAscensor {

	@Test
	public void testAscensor() throws PersonaAjenaAlaEmpresa, AscensoresLlenos, PisoInexistente {
		Edificio samsung = new Edificio("Sansung", 5);
		Ascensor nuevo = new Ascensor(4, TipoAscensor.PISO_PAR);
		Persona nueva = new Persona("ezequiel", "42462359", Tipo_persona.EMPLEADO);
		try {
		System.out.println(samsung.calcularTiempoQueTardaEnllegar(6));
		}catch(PisoInexistente e) {
			e.printStackTrace();
		}
	}

}
