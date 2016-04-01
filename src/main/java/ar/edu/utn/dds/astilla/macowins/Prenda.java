package ar.edu.utn.dds.astilla.macowins;

public abstract class Prenda {
	
	private int VALOR_FIJO_NEGOCIO;
	private Origen origen;

	public Prenda(Origen origen) {
		VALOR_FIJO_NEGOCIO = 300;
		this.origen = origen;
	}
	
	public double precioFinal(){
		return calculo() * origen.multiplicadorPorProcedencia();
	}
	
	private double calculo(){
		return VALOR_FIJO_NEGOCIO + this.precioBase();
	}
	
	protected abstract int precioBase();

}

