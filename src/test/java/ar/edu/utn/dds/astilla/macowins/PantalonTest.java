package ar.edu.utn.dds.astilla.macowins;


import junit.framework.Assert;

public class PantalonTest {
	
	private Pantalon unPantalon;
	
	public void init() {
		unPantalon = new Pantalon(new Internacional());
	}
	
	public void precioBaseEsDoscientosCincuenta(){
		Assert.assertEquals(250, unPantalon.precioBase());
	}
	
	

	
	

}
