package ar.edu.utn.dds.astilla.macowins;

public abstract class Prenda {
	
	private Origen origen;
	private int VALORFIJO;
	private Marca marca;
	
	public Prenda(Origen origen, Marca unaMarca, int suAtributo) {
		this.origen = origen;
		this.VALORFIJO = 300;
		this.marca = unaMarca;
	}
	
	public double precioFinal(){
		return (this.VALORFIJO + this.precioBase()) * origen.multiplicadorPorProcedencia() + marca.coeficienteDeLaMarca(this);
	}	

	protected abstract int precioBase();

}

