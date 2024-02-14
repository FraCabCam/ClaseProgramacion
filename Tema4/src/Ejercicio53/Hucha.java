package Ejercicio53;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hucha {
	protected BigDecimal hucha;
	
	public Hucha() {
		hucha = BigDecimal.ZERO;
	}
	public BigDecimal meterDinero (BigDecimal importe) {
		hucha = hucha.add(importe).setScale(2,RoundingMode.HALF_DOWN);
		return hucha;	
	}
	public BigDecimal sacarDinero (BigDecimal importe) {
		if (hucha.compareTo(importe) <= 0) {
			BigDecimal dineroSacado = hucha;
			hucha = BigDecimal.ZERO;
			return dineroSacado;
		}
			BigDecimal dineroSacado = BigDecimal.ZERO;
			hucha = hucha.subtract(importe).setScale(2,RoundingMode.HALF_DOWN);
		
		return importe;		
	}
	public BigDecimal contarDinero () {		
		return hucha;
	}
	public BigDecimal romperHucha () {
		return sacarDinero(hucha);
	}

	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,##0.00 €");
		return format.format(hucha);
	}
	
}
