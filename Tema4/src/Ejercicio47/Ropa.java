package Ejercicio47;

import java.math.BigDecimal;

public class Ropa extends Articulo{
	private String talla;
	private String color;
	public Ropa(String descripcion, BigDecimal precio, String talla, String color) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.talla = talla;
		this.color = color;
		
	}
	public Ropa(String descripcion, int i, String talla2, String color2) {
		// TODO Auto-generated constructor stub
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
