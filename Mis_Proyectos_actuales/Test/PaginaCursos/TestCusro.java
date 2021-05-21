package PaginaCursos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCusro {

	@Test
	public void queSePuedaCrearUnCurso() {
		Curso nuevo = new Curso(1, "Curso de Java", 200.0);
		assertNotNull(nuevo);
	}
	
	@Test
	public void queSePuedaCrearUnInstructor() {
		Instructor nuevo = new Instructor(1, "Pablo Vasile", "Pablovasile@gmail.com");
		assertNotNull(nuevo);
	}
	
	@Test
	public void queSePuedaCrearUnAlumno() {
		Alumno nuevo = new Alumno(1, "Rigoberto", "1151817775");
		assertNotNull(nuevo);
	}
	
	@Test
	public void queSePuedaAgregarCursosNuevosAlaPlataforma() {
		PlataformaDeCursos EDTeam = new PlataformaDeCursos("EDTeam");
		assertNotNull(EDTeam);
		EDTeam.agregarCursoNuevo(new Curso(1, "Curso de Java", 200.0));
		EDTeam.agregarCursoNuevo(new Curso(2, "Curso de PHP", 200.0));
		EDTeam.agregarCursoNuevo(new Curso(3, "Curso de Kotlin", 200.0));
		EDTeam.agregarCursoNuevo(new Curso(1, "Curso de Git", 200.0));
		Integer cantidad = 3;
		assertEquals(cantidad, EDTeam.getCantidadDeCuros());
	}
	
	@Test
	public void queSePuedaDesignarUnInstructorAUnCurso() throws CursoInexistente, YaHayUnInstructorDesignadoAEseCurso {
		PlataformaDeCursos EDTeam = new PlataformaDeCursos("EDTeam");
		assertNotNull(EDTeam);
		Curso nuevo = new Curso(1, "Curso de Java", 200.0);
		assertTrue(EDTeam.agregarCursoNuevo(nuevo));
	assertTrue(EDTeam.designarInstructorAUnCursoNuevo(nuevo,
						new Instructor(1, "Pablo Vasile", "Pablovasile@gmail.com")));
	}
	
	@Test (expected = YaHayUnInstructorDesignadoAEseCurso.class)
	public void queNoSePuedaDesignarUnInstructorAUnCursoEnElQueYaHayUno() throws CursoInexistente, YaHayUnInstructorDesignadoAEseCurso {
		try {
			PlataformaDeCursos EDTeam = new PlataformaDeCursos("EDTeam");
			assertNotNull(EDTeam);
			Curso nuevo = new Curso(1, "Curso de Java", 200.0);
			assertTrue(EDTeam.agregarCursoNuevo(nuevo));
		assertTrue(EDTeam.designarInstructorAUnCursoNuevo(nuevo,
							new Instructor(1, "Pablo Vasile", "Pablovasile@gmail.com")));
		assertTrue(EDTeam.designarInstructorAUnCursoNuevo(nuevo,
				new Instructor(2, "Eduardo meltran", "edumeltran@gmail.com")));

			}catch(YaHayUnInstructorDesignadoAEseCurso e) {
				e.printStackTrace();
				throw new YaHayUnInstructorDesignadoAEseCurso();
			}
		}
	
	@Test 
	public void queSePuedaAgregarUnAlumnoAUnCurso() throws CursoInexistente, YaHayUnInstructorDesignadoAEseCurso, ElAlumnoYaEstaInscritoAlCurso, YaNoHayCuposDisponibles {
		PlataformaDeCursos EDTeam = new PlataformaDeCursos("EDTeam");
		Curso nuevo = new Curso(1, "Curso de Java", 200.0);
		Instructor i1 = new Instructor(1, "Pablo Vasile", "Pablovasile@gmail.com");
		
		EDTeam.agregarCursoNuevo(nuevo);
		EDTeam.designarInstructorAUnCursoNuevo(nuevo, i1);
		assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo,new Alumno(1, "Rigoberto", "1151817776")));
		assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo,new Alumno(2, "Roberto", "1151817777")));
		assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo,new Alumno(3, "Alonso", "1151817778")));
		assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo,new Alumno(4, "ruben", "1151817779")));
	}
	
	@Test (expected = CursoInexistente.class)
	public void queNosePuedAgregarAunAlumnoAunCursoInexistente() throws CursoInexistente, ElAlumnoYaEstaInscritoAlCurso, YaNoHayCuposDisponibles {
		try {
		PlataformaDeCursos EDTeam = new PlataformaDeCursos("EDTeam");
		Curso nuevo = new Curso(1, "Curso de Java", 200.0);
		Instructor i1 = new Instructor(1, "Pablo Vasile", "Pablovasile@gmail.com");
		
		assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo,new Alumno(1, "Rigoberto", "1151817776")));
		assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo,new Alumno(2, "Roberto", "1151817777")));
		assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo,new Alumno(3, "Alonso", "1151817778")));
		assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo,new Alumno(4, "ruben", "1151817779")));
		}catch(CursoInexistente e) {
			e.printStackTrace();
			throw new CursoInexistente();
		}
	}
	
	@Test (expected = ElAlumnoYaEstaInscritoAlCurso.class)
	public void queNoSePuedaAgregarAUnAlumnoYaInscritoAUnCurso() throws ElAlumnoYaEstaInscritoAlCurso, CursoInexistente, YaNoHayCuposDisponibles{
		try {
		PlataformaDeCursos EDTeam = new PlataformaDeCursos("EDTeam");
		Curso nuevo = new Curso(1, "Curso de Java", 200.0);
		Alumno otro = new Alumno(1, "Rigoberto", "1151817776");
		EDTeam.agregarCursoNuevo(nuevo);
		EDTeam.agregarAlumnoAUnCurso(nuevo, otro);
		EDTeam.agregarAlumnoAUnCurso(nuevo, otro);
		}catch(ElAlumnoYaEstaInscritoAlCurso e) {
			e.printStackTrace();
			throw new ElAlumnoYaEstaInscritoAlCurso();
		}
	}
	
	
	@Test (expected = YaNoHayCuposDisponibles.class)
	public void queNosePuedaInscribirUnAlumnoConLosCuposLLenos() throws CursoInexistente, YaNoHayCuposDisponibles, ElAlumnoYaEstaInscritoAlCurso {
		try {
			PlataformaDeCursos EDTeam = new PlataformaDeCursos("EDTeam");
			Curso nuevo = new Curso(1, "Curso de Java", 200.0);
			Alumno otro = new Alumno(1, "Rigoberto", "1151817776");
			Alumno otro2 = new Alumno(2, "Raul", "1151817777");
			Alumno otro3 = new Alumno(3, "Roberto", "1151817778");
			Alumno otro4 = new Alumno(4, "Ruben", "1151817779");
			Alumno otro5 = new Alumno(5, "Ricardo", "1151817770");
			Alumno otro6 = new Alumno(6, "Ricardiño", "1151817771");
			EDTeam.agregarCursoNuevo(nuevo);
			assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo, otro));
			assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo, otro2));
			assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo, otro3));
			assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo, otro4));
			assertTrue(EDTeam.agregarAlumnoAUnCurso(nuevo, otro5));			
			}catch(YaNoHayCuposDisponibles e) {
				e.printStackTrace();
				throw new YaNoHayCuposDisponibles();
			}
	}
}
