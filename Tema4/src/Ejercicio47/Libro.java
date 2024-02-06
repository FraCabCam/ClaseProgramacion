package Ejercicio47;

public class Libro extends Articulo {
	private String autor;
	
	public Libro(String descripcion, Integer precio,  String autor) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.autor = autor;
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	

}
