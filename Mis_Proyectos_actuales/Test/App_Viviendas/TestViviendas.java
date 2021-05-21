package App_Viviendas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestViviendas {

	@Test
	public void queSePuedaCrearUnHabitante() {
		Habitante persona1 = new Habitante("familiar", 1001, "Raul");
		assertNotNull(persona1);
	}
	
	@Test 
	public void queSePuedaCrearUnaVivienda() {
		Vivienda casa1 = new Vivienda(1, 20.0, 50.0);
		assertNotNull(casa1);
	}
	
	@Test
	public void queSePuedaCrearUnMunicipio() {
		Municipio muni1 = new Municipio("Puerto Bermejo", "Russo");
		assertNotNull(muni1);
	}
	
	@Test
	public void queSePuedaAgregarUnMunicipioYunaPersonaAeseMunicipio() throws MunicipioInexistente, HabitanteNoRegistrado, HabitanteYaRegistrado {
		Municipio muni1 = new Municipio("Puerto Bermejo", "Russo");
		Habitante persona1 = new Habitante("familiar", 1001, "Raul");
		
		assertTrue(muni1.agregarMunicipio(muni1));
		assertTrue(muni1.RegistrarHabitanteAlMunicipio(persona1, muni1.getNombre()));
	}
	
	@Test
	public void queUnhabitantePuedaAdiquirirUnaVivienda() throws MunicipioInexistente, HabitanteNoRegistrado, HabitanteYaRegistrado {
		Municipio muni1 = new Municipio("Puerto Bermejo", "Russo");
		Vivienda casa1 = new Vivienda(1, 20.0, 50.0);
		Habitante persona1 = new Habitante("familiar", 1001, "Raul");
		muni1.agregarMunicipio(muni1);
		muni1.RegistrarHabitanteAlMunicipio(persona1, muni1.getNombre());
		
		assertTrue(muni1.adquirirVivienda(persona1,casa1));
	}
	
	@Test (expected = HabitanteNoRegistrado.class)
	public void queUnHabitanteNoRegistradoNoPuedaAdquirirUnaVivienda() throws HabitanteNoRegistrado {
		try {
		Municipio muni1 = new Municipio("Puerto Bermejo", "Russo");
		Vivienda casa1 = new Vivienda(1, 20.0, 50.0);
		Habitante persona1 = new Habitante("familiar", 1001, "Raul");
		muni1.agregarMunicipio(muni1);
		
		assertTrue(muni1.adquirirVivienda(persona1,casa1));
		}catch(HabitanteNoRegistrado e) {
			e.printStackTrace();
			throw new HabitanteNoRegistrado();
		}
	}
	
	@Test (expected = HabitanteYaRegistrado.class)
	public void queNoSePuedaRegistrarUnHabitanteYaRegistrado() throws MunicipioInexistente, HabitanteNoRegistrado, HabitanteYaRegistrado {
		Municipio muni1 = new Municipio("Puerto Bermejo", "Russo");
		Habitante persona1 = new Habitante("familiar", 1001, "Raul");
		try {
		assertTrue(muni1.agregarMunicipio(muni1));
		assertTrue(muni1.RegistrarHabitanteAlMunicipio(persona1, muni1.getNombre()));
		assertTrue(muni1.RegistrarHabitanteAlMunicipio(persona1, muni1.getNombre()));
		}catch(HabitanteYaRegistrado e) {
			e.printStackTrace();
			throw new HabitanteYaRegistrado();
		}
	}
}
