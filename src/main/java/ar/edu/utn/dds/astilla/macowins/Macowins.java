package ar.edu.utn.dds.astilla.macowins;

import java.util.ArrayList;

public class Macowins {

static ArrayList<Venta> ventas= new ArrayList<Venta>() ;
	
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
		
		int gananciaEnElDia = 0;
		
		for (Venta unaVenta : ventas) {
			if(unaVenta.getFechaVenta()==fecha){
			gananciaEnElDia+= unaVenta.ganancia();
		}
		}
		return gananciaEnElDia;
	}
	

	public static void vender(Prenda prenda,int cantidad, long fecha){
		ventas.add(new Venta(prenda,cantidad,fecha));
	}

}
