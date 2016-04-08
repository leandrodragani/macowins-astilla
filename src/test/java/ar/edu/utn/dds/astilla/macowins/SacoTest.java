package ar.edu.utn.dds.astilla.macowins;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class SacoTest {
	
	private Saco unSaco;


	
	@Before
	public void init() {	

		unSaco = new Saco(new Internacional(), new Armani(),5);
		

	}	

	
	@Test
	public void precioFinalEsSeisNoventa() {
		assertEquals(1072.5, unSaco.precioFinal(), 0);
	}

}
