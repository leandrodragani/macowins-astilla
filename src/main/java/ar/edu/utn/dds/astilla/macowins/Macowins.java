package ar.edu.utn.dds.astilla.macowins;

import java.util.ArrayList;
import java.util.List;

public class Macowins {

	private List<Venta> ventas= new ArrayList<Venta>();
	
	public double procesarVentasDelDia(long fecha){
		return ventas.stream().filter(venta -> venta.coincideFecha(fecha)).mapToDouble(venta -> venta.ganancia()).sum();
	}
	
	public void vender(Prenda prenda,int cantidad, long fecha){
		ventas.add(new Venta(prenda,cantidad,fecha));
	}

}
