package ar.edu.utn.dds.astilla.macowins;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class SacoTest {
	
	private Saco unSaco;
	private Macowins unNegocio;
	
	@Before
	public void init() {	
		unSaco = new Saco(new Internacional());		
		unNegocio = new Macowins();
	}	

	
	@Test
	public void precioFinalEsSeisNoventa() {
		assertEquals(780.0, unSaco.precioFinal(), 0);
	}

}
