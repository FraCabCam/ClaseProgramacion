package Ejercicio54;

import java.math.BigDecimal;

public class AppCuenta {
	public static void main(String[] args) {
		CuentaAhorros cuenta = new CuentaAhorros("0123456789111213");
		System.out.println(cuenta.getDineroCuenta());
		
		Ingreso ingreso1 = new Ingreso("bizzum",new BigDecimal(20.50));
		Ingreso ingreso2 = new Ingreso("devolucion de la Renta",new BigDecimal(1200.33));
		cuenta.addMovimiento(ingreso1);
		cuenta.addMovimiento(ingreso2);
		
		Cargo cargo1 = new Cargo("Gimnasio", new BigDecimal(33.33));
		cuenta.addMovimiento(cargo1);
		Cargo cargo2 = new Cargo("CEU", new BigDecimal(348.50));
		cuenta.addMovimiento(cargo2);
		Retirada retirada1 = new Retirada(new BigDecimal(50));
		cuenta.addMovimiento(retirada1);
		System.out.println(cuenta.getDineroCuenta());
		System.out.println(cuenta.imprimirTodos());
		System.out.println(cuenta.imprimirI());
		System.out.println(cuenta.imprimirC());
		System.out.println(cuenta.imprimirR());
	}

}
