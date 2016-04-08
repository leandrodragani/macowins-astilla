package ar.edu.utn.dds.astilla.macowins;


public class Saco extends Prenda {
	
	private int cantidadDeBotones;
	
	public int getCantidadDeBotones() {
		return cantidadDeBotones;
	}
	
	public void setCantidadDeBotones(int cantidadDeBotones) {
		this.cantidadDeBotones = cantidadDeBotones;
	}
	

	public Saco(Origen origen, Marca unaMarca, int cantidadDeBotones) {
		super(origen, unaMarca, cantidadDeBotones);
		this.setCantidadDeBotones(cantidadDeBotones);
	}

	@Override
	protected int precioBase() {
		return 300 + 10*cantidadDeBotones;
	}


}
