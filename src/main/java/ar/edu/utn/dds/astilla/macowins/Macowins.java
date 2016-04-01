package ar.edu.utn.dds.astilla.macowins;

import java.util.ArrayList;
import java.util.List;

public class Macowins {

static List<Venta> ventas= new ArrayList<Venta>() ;
	
	public static double procesarVentasDelDia(long fecha){
		return ventas.stream().filter(venta -> venta.coincideFecha(fecha)).mapToDouble(venta -> venta.ganancia()).sum();
	}
	

	public static void vender(Prenda prenda,int cantidad, long fecha){
		ventas.add(new Venta(prenda,cantidad,fecha));
	}

}
