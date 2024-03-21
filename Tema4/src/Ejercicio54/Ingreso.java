package Ejercicio54;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Ingreso extends Movimientos {
	protected String descripcion;

	public Ingreso(String descripcion, BigDecimal importe) {
		this.descripcion = descripcion;
		this.importe = importe;
		fechaActual = LocalDate.now();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat ("#,##0.00€");
		return "I - " +  descripcion + " " + fechaActual + ", importe " + format.format(importe);
	}

	public void getImporte(BigDecimal Importe) {

		return;
	}
	
	public BigDecimal operacion() {
		return importe;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "I";
	}
	

}
