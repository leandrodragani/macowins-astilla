package ar.edu.utn.dds.astilla.macowins;


import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class PantalonTest {
	
	private Pantalon unPantalon;

	
	@Before
	public void init() {
		unPantalon = new Pantalon(new Internacional());	
		
	}
	
	@Test
	public void precioBaseEsDoscientosCincuenta(){
		Assert.assertEquals(250, unPantalon.precioBase());
	}	

	
}
