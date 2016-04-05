package ar.edu.utn.dds.astilla.macowins;

public abstract class Prenda {
	
	private Origen origen;
	private int VALORFIJO;
	
	public Prenda(Origen origen) {
		this.origen = origen;
		this.VALORFIJO = 300;
	}
	
	public double precioFinal(){
		return (this.VALORFIJO + this.precioBase()) * origen.multiplicadorPorProcedencia();
	}	

	protected abstract int precioBase();

}

