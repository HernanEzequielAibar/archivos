package Tp1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestTableroTKanban {

	@Test
	public void testQueCreaUnaTareaPendienteYaExistenteYlanzaException() {
		Tareas nueva = new Tareas("Estudiar bd");
		TableroKanban tabla = new TableroKanban("tareas");
		
		try {
			assertTrue(tabla.agregarUnaNuevaTareaPendiente(nueva));
			//vuelvo a crear una tarea ya existente como pendiente
			//deberia lanzar una excepcion de TareaYaExitente
			assertTrue(tabla.agregarUnaNuevaTareaPendiente(nueva));
		} catch (TareaYaExistente e) {
			System.out.println(e.getMensaje());
		}
	
	}
	
	@Test
	public void testQueCreaUnaTareaPendienteYaExistenteYTrataDeHacerloPeroLanzaExcepcion() throws TareaYaExistente {
		Tareas nueva = new Tareas("hacer osio");
		TableroKanban tabla = new TableroKanban("tareas");
		
		try {
		assertTrue(tabla.agregarUnaNuevaTareaPendiente(nueva));
		//vuelvo a crear una tarea ya existente como pendiente
		//deberia lanzar una excepcion de TareaYaExitente
		assertTrue(tabla.agregarUnaNuevaTareaPendiente(nueva));
		}catch(TareaYaExistente e) {
			System.out.println(e.getMensaje());
		}
		
	}
	
	@Test
	 public void testQuePasaTareaPendienteAEnCurso() {
		Tareas nueva = new Tareas("Estudiar bd");
		TableroKanban tabla = new TableroKanban("tareas");
		
		try {
			assertTrue(tabla.agregarUnaNuevaTareaPendiente(nueva));
			assertTrue(tabla.pasarTareaPendienteAEnCurso(nueva));
			//vuelvo a pasar la misma tarea a en curso, esto deberia lanzar 
			//una excepcion de TareaYaEnCurso ya que la tarea ya esta en curso
			// y no se puede volver a poner en curso
			assertTrue(tabla.pasarTareaPendienteAEnCurso(nueva));
		}catch (TareaYaExistente e) {
			System.out.println(e.getMensaje());
		}catch (TareaYaEnCurso e) {
			System.out.println(e.getMensaje());
		}
	}

	@Test
	public void testQueTerminaTareas() {
		Tareas nueva = new Tareas("Estudiar bd");
		TableroKanban tabla = new TableroKanban("tareas");
		
		try {
			assertTrue(tabla.agregarUnaNuevaTareaPendiente(nueva));
			assertTrue(tabla.pasarTareaPendienteAEnCurso(nueva));
			assertTrue(tabla.terminarTareaEnCurso(nueva));
			//la termino de nuevo, esto deberia lanzar una excepcion de TareaYaTerminada 
			// y no se puede volver a terminar
			assertTrue(tabla.terminarTareaEnCurso(nueva));
		}catch (TareaYaExistente e) {
			System.out.println(e.getMensaje());
		}catch (TareaYaEnCurso e) {
			System.out.println(e.getMensaje());
		} catch (TareaYaTerminada e) {
			System.out.println(e.getMensaje());
		}

	}
}
