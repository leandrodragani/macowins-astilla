package ar.edu.utn.dds.astilla.macowins;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PantalonTest {

	private Pantalon unPantalon;

	@Before
	public void init() {
		unPantalon = new Pantalon(new Internacional(), new Armani(), 20 );

	}

	@Test
	public void precioBaseEsDoscientosSetenta() {
		assertEquals(270, unPantalon.precioBase());
		
		
	}

}
