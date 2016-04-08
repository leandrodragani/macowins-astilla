package ar.edu.utn.dds.astilla.macowins;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;


public class VentaTest {

	private Saco unSaco;
	private Negocio unMaco;
	private Pantalon unPantalon;
	private Camisa unaCamisa;
	
	static LocalDate fecha;

	@Before
	public void init() {
		
		unSaco = new Saco(new Internacional(), new Armani (), 5);
		unaCamisa = new Camisa(new Nacional(), new Sarkany(), 0);
		unPantalon = new Pantalon(new Nacional(), new Armani(), 10);
		unMaco = new Negocio();		
		
		unMaco.vender(unSaco, 1, 10);
		unMaco.vender(unaCamisa, 2, 10);
		unMaco.vender(unPantalon, 1, 13);
	
		}
	
	@Test
	public void seRegistranTresVentas() {
		assertEquals(3, unMaco.getVentas().size(),0);
		}
	
		

	@Test
	 public void laVentaEsSieteMilOchocientos() {
	assertEquals(2072.07, unMaco.procesarVentasDelDia(10), 10);


	}
}


