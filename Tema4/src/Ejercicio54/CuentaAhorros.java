package Ejercicio54;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuentaAhorros {
	public String numeroCuenta;
	public BigDecimal dineroCuenta = BigDecimal.ZERO;
	public List<Movimientos> movimientos;

	public CuentaAhorros(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
		movimientos = new ArrayList<Movimientos>();
	}

	public Boolean validarNumCuenta() {
		Pattern patron = Pattern.compile("[0-9]{20}");
		Matcher match = patron.matcher(numeroCuenta);
		if (match.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public void addMovimiento(Movimientos movi) {
		 movimientos.add(movi);
		return;
	}
	
	public void getDineroCuenta (BigDecimal dineroCuenta) {
		
		return dineroCuenta;
	}
}
