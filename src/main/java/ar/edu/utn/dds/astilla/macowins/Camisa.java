package ar.edu.utn.dds.astilla.macowins;

public class Camisa extends Prenda {


	public Camisa(Origen origen, Marca unaMarca, int unAtributo) {
		super(origen, unaMarca, unAtributo);
	}

	@Override
	protected int precioBase() {
		return 200;
	}

}
