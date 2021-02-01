package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() {
		setUp2();
		int x=modelo.darTamano();
		assertEquals("No es el tamaño correcto", CAPACIDAD,x);
		// TODO
	}

	@Test
	public void testAgregar() {
		
		modelo.agregar(""+0);
		assertEquals("No se agregó el elemento", 1,modelo.darTamano());
		String elemento=modelo.buscar(""+0);
		assertNotNull("Debió haber encontrado el elemento", elemento);
		// TODO Completar la prueba
	}

	@Test
	public void testBuscar() {
		setUp2();
		String elemento=modelo.buscar(""+0);
		assertNotNull( "Debió haber encontrado el elemento", elemento );
		assertEquals("No se encontró el elemento correcto",  ""+0, elemento);
		assertNull( "No debió haber encontrado el elemento", modelo.buscar("12345"));
		// TODO Completar la prueba
	}

	@Test
	public void testEliminar() {
		setUp2();
		modelo.eliminar(""+0);
		assertEquals("Ese no debería ser el tamaño", CAPACIDAD-1, modelo.darTamano());
		String elemento=modelo.buscar(""+0);
		System.out.println(""+elemento);
		assertNull("No debió haber encontrado ningún elemento", elemento);
		assertNotEquals("No debió encontrar el elemento",""+0, elemento);
		// TODO Completar la prueba
		
	}

}
