package Ejercicio54;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Retirada extends Movimientos {
	public Retirada( BigDecimal importe) {
		this.importe = importe;
		fechaActual = LocalDate.now();
	}

	public String toString() {
		DecimalFormat format = new DecimalFormat ("#,##0.00€");
		return "R - " + fechaActual + ", Importe " + format.format(importe);
	}

	public BigDecimal operacion() {
		return importe.negate();
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "R";
	}
}
