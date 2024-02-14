package Ejercicio54;

import java.math.BigDecimal;

public class Ingreso  extends Movimientos{
	protected String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	@Override
	public String toString() {
		return "Ingreso " + descripcion + " " + fechaActual + ", importe " + importe;
	}
	public void getImporte(BigDecimal Importe) {
		
	return;
	}
}
