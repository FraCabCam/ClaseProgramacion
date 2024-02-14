package Ejercicio47;

import java.math.BigDecimal;

public class Libro extends Articulo {
	private String autor;
	
	public Libro(String descripcion, BigDecimal precio,  String autor) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.autor = autor;
		
	}

	public Libro(String descripcion, int i, String autor2) {
		// TODO Auto-generated constructor stub
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	

}
