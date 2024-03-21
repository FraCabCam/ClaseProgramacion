package Ejercicio54;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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
		dineroCuenta = dineroCuenta.add(movi.operacion());
		return;
	}
	
	public String getDineroCuenta () {
		DecimalFormat format = new DecimalFormat ("#,##0.00€");
		return format.format(dineroCuenta);
	}
	
	private String listaCadena(String tipo) {
		List<String> listaMovimientos = new ArrayList<>();
		for (Movimientos tipoMovimiento : movimientos) {
			if (tipo.equals("T") ||  tipoMovimiento.getTipo().equals(tipo)) {
				listaMovimientos.add(tipoMovimiento.toString());
			}
		
		
		}
		return listaMovimientos.toString();
		
	}
	
	public String imprimirTodos() {
		return listaCadena("Todos");
	}
	public String imprimirC() {
		return listaCadena("C");
	}
	public String imprimirR() {
	return listaCadena("R");
}
	public String imprimirI() {
	return listaCadena("I");
}
}

