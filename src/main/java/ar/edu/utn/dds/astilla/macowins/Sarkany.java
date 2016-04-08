package ar.edu.utn.dds.astilla.macowins;

public class Sarkany implements Marca {

	
	public double coeficienteDeLaMarca(Prenda unaPrenda) {
		return (unaPrenda.precioBase() >500 ? 0.35 : 0.1);
	}

	
}
