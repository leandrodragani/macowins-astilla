package ar.edu.utn.dds.astilla.macowins;

public class Sombrero extends Prenda {
	
	private int coeficienteDeMetrosexualidad;	
	

	public Sombrero(Origen origen, Marca unaMarca, int coeficienteDeMetrosexualidad) {
		super(origen, unaMarca, coeficienteDeMetrosexualidad);
		this.setCoeficienteDeMetrosexualidad(coeficienteDeMetrosexualidad);
	}

	@Override
	protected int precioBase() {
		return 150 + (1 + coeficienteDeMetrosexualidad);
	}

	public int getCoeficienteDeMetrosexualidad() {
		return coeficienteDeMetrosexualidad;
	}

	public void setCoeficienteDeMetrosexualidad(int coeficienteDeMetrosexualidad) {
		this.coeficienteDeMetrosexualidad = coeficienteDeMetrosexualidad;
	}
	
	

	
}
