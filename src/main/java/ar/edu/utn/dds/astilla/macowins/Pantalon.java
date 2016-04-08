package ar.edu.utn.dds.astilla.macowins;


public class Pantalon extends Prenda {
	
	private int cm2Tela;

	public int getCm2Tela() {
		return cm2Tela;
	}
	
	public void setCm2Tela(int cm2Tela) {
		this.cm2Tela = cm2Tela;
	}
	
	public Pantalon(Origen origen, Marca unaMarca, int cm2Tela) {
		super(origen, unaMarca, cm2Tela);
		this.cm2Tela = cm2Tela;
		
	}

	@Override
	protected int precioBase() {

		return 250 + cm2Tela;
	}


}
