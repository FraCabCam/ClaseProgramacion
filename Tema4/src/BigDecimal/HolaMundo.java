package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class HolaMundo {
	public static void main(String[] args) {
		BigDecimal x = new BigDecimal("12.49383");
		
		System.out.println(x);
		
		x = x.setScale(2,RoundingMode.HALF_DOWN);
		
		System.out.println(x);
		
		BigDecimal y = new BigDecimal("34.32");
		
		BigDecimal suma = x.add(y).multiply(y).subtract(y);
		
		//add es sumar, subtract es restar
		
		
		System.out.println(suma);
		
		BigDecimal division = x.divide(y,4, RoundingMode.CEILING);
		
		System.out.println(division);
		
		if (x.equals(y)) {
			System.out.println("son iguales.");
			
		}
		
		if (x.compareTo(y) < 0) {
			System.out.println("x es menor que Y");
		}
		else if (x.compareTo(y) > 0) {
			System.out.println("x es mayor que Y");
		}
		else  {
			System.out.println("x es menor que Y");
		}
		
		BigDecimal z = new BigDecimal("124324.49383");
		DecimalFormat format = new DecimalFormat("#,###.00 €");
		
		System.out.println(format.format(z));
	}

}
