package ar.edu.utn.dds.astilla.macowins;

public class Camisa extends Prenda {

	public Camisa(Origen origen) {
		super(origen);
	}

	@Override
	protected int precioBase() {
		return 200;
	}

}
