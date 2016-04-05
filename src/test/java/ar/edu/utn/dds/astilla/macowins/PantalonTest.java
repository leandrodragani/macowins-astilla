package ar.edu.utn.dds.astilla.macowins;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PantalonTest {

	private Pantalon unPantalon;

	@Before
	public void init() {
		unPantalon = new Pantalon(new Internacional());

	}

	@Test
	public void precioBaseEsDoscientosCincuenta() {
		assertEquals(250, unPantalon.precioBase());
	}

}
