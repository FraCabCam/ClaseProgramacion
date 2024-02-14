package Ejercicio47;

import java.math.BigDecimal;
import java.util.List;

public abstract class Articulo {
	
	protected String descripcion;
	protected BigDecimal precio;
	
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	

}
