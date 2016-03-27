package ar.edu.utn.dds.astilla.macowins;

public class Venta {
	
	private Prenda prenda;
	private int cantidad;
	private long fechaVenta;
	
	public Prenda getPrenda() {
		return prenda;
	}

	public Venta(Prenda prenda, int cantidad, long fechaVenta) {
		super();
		this.prenda = prenda;
		this.cantidad = cantidad;
		this.fechaVenta = fechaVenta;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public long getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(long fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public double ganancia(){
		return prenda.precioFinal() * cantidad;
	}

	public boolean coincideFecha(long fecha){
		return fecha == this.fechaVenta;
	}
	

}
