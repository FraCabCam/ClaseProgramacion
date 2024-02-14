package Ejercicio53;

import java.math.BigDecimal;

public class AppHucha {
	public static void main(String[] args) {
		Hucha hucha = new Hucha();
		System.out.println(hucha);
		hucha.meterDinero(new BigDecimal(100));
		System.out.println(hucha);
		hucha.meterDinero(new BigDecimal(50.501));
		System.out.println(hucha);
		hucha.sacarDinero(new BigDecimal(20.50));
		System.out.println(hucha);
		BigDecimal sacado = hucha.sacarDinero(new BigDecimal(200.00));
		System.out.println(hucha);
		hucha.meterDinero(sacado);
		System.out.println(hucha);
		
		hucha.meterDinero(hucha.contarDinero());
		System.out.println(hucha);
		hucha.meterDinero(hucha.romperHucha());
		System.out.println(hucha);
		
		
	}

}
