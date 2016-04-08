package ar.edu.utn.dds.astilla.macowins;

public class Zapato extends Prenda {
	
	private int talle;

	public int getTalle() {
		return talle;
	}
	
	public void setTalle(int talle) {
		this.talle = talle;
	}
	
	public Zapato(Origen origen, Marca unaMarca, int talle) {
		super(origen, unaMarca, talle);
		this.setTalle(talle);
	}

	@Override
	protected int precioBase() {
		return 400 + 5*talle;
	}

	

}
