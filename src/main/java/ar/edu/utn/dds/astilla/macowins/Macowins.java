package ar.edu.utn.dds.astilla.macowins;

import java.util.ArrayList;

public class Macowins {

static List<Venta> ventas= new ArrayList<Venta>() ;
	
	public static void main(String[] args) {
		
		Pantalon unPantalon = new Pantalon(new Internacional());
		Saco unSaco = new Saco(new Nacional());
		Camisa unaCamisa = new Camisa(new Internacional());
		
		vender(unPantalon,10,12);
		vender(unSaco,3,10);
		vender(unaCamisa,2,12);
				
		
		System.out.println(procesarVentasDelDia(12));
		
	}
	
	public static int procesarVentasDelDia(long fecha){
		return ventas.stream().filter(venta -> venta.coincideFecha(fecha)).mapToDouble(venta -> venta.ganancia()).sum();
	}
	

	public static void vender(Prenda prenda,int cantidad, long fecha){
		ventas.add(new Venta(prenda,cantidad,fecha));
	}

}
