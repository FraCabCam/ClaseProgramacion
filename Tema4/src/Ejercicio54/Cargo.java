package Ejercicio54;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.time.LocalDate;

public class Cargo extends Movimientos {
	protected String cif;
	public Cargo( String cif, BigDecimal importe) {
		this.cif = cif;
		this.importe = importe;
		fechaActual = LocalDate.now();
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat ("#,##0.00€");
		
		return "C - " + fechaActual  +  ", Importe " + format.format(importe) + " " + cif ;
	}
	
	public BigDecimal operacion() {
		return importe.negate();
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "C";
	}
}
