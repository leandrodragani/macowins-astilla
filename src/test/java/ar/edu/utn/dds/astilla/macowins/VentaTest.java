package ar.edu.utn.dds.astilla.macowins;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;


public class VentaTest {

	private Saco unSaco;
	private Macowins unMaco;
	private Pantalon unPantalon;
	private Camisa unaCamisa;
	
	static LocalDate fecha;

	@Before
	public void init() {
		unSaco = new Saco(new Internacional());
		unaCamisa = new Camisa(new Nacional());
		unPantalon = new Pantalon(new Nacional());
		unMaco = new Macowins();	
		
		
		unMaco.vender(unSaco, 1, 10);
		unMaco.vender(unaCamisa, 2, 10);
		unMaco.vender(unPantalon, 1, 13);
	
		}
	

	@Test
	public void laVentaEsSieteMilOchocientos() {
		assertEquals(1780.00, unMaco.procesarVentasDelDia(10), 10);


	}

}
