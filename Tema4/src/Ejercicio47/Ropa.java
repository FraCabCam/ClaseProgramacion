package Ejercicio47;

public class Ropa extends Articulo{
	private String talla;
	private String color;
	public Ropa(String descripcion, Integer precio, String talla, String color) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.talla = talla;
		this.color = color;
		
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
