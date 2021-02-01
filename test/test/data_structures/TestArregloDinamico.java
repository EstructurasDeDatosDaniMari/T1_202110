package test.data_structures;

import model.data_structures.ArregloDinamico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArregloDinamico {

	private ArregloDinamico arreglo;
	private static int TAMANO=100;
	
	@Before
	public void setUp1() {
		arreglo= new ArregloDinamico(TAMANO);
	}

	public void setUp2() {
		for(int i =0; i< TAMANO*2; i++){
			arreglo.agregar(""+i);
		}
	}

	@Test
	public void testArregloDinamico() {

		assertEquals( "La lista de elementos debió crearse vacía.",0, arreglo.darTamano() );
		assertEquals( "La lista de elementos debe tener el tamaño máximo.", TAMANO,arreglo.darCapacidad() );
		// TODO
	}

	@Test
	public void testDarElemento() {
		setUp2();
		assertEquals("No es el elemento que está en esa posición",""+0,arreglo.darElemento(0));
		assertNotNull("Debería haber un elemento en esa posición",arreglo.darElemento(0));
		// TODO
	}

}
