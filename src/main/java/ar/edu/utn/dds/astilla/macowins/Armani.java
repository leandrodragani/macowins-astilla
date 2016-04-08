package ar.edu.utn.dds.astilla.macowins;

public class Armani implements Marca {

	@Override
	public double coeficienteDeLaMarca(Prenda unaPrenda) {
		return unaPrenda.precioBase() *0.65;
	}
	
	
}
