package ar.edu.utn.dds.astilla.macowins;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class SacoTest {
	
private Saco unSaco;
	
	@Before
	public void init() {	
		unSaco = new Saco(new Internacional());		
	}	

	
	@Test
	public void precioFinalEsSeisNoventa() {
		Assert.assertEquals(780.0, unSaco.precioFinal());
	}

}
