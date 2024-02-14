package Ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Movimientos {
	protected LocalDate fechaActual;
	protected BigDecimal importe;
	public LocalDate getFechaActual() {
		return fechaActual;
	}
	public void setFechaActual(LocalDate fechaActual) {
		this.fechaActual = fechaActual;
	}
	public BigDecimal getImporte() {
		return importe;
	}
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	
	public Movimientos() {
		
		
	}
	
	public void getImporte(BigDecimal Importe) {
		
	}
	

}
