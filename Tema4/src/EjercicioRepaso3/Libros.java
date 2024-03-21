package EjercicioRepaso3;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Libros {
	protected String titulo;
	protected String autor;
	protected LocalDate fechaEdicion;
	protected Integer numPag;
	protected BigDecimal peso;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(LocalDate fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}
	public Integer getNumPag() {
		return numPag;
	}
	public void setNumPag(Integer numPag) {
		this.numPag = numPag;
	}
	public BigDecimal getPeso() {
		return peso;
	}
	
	@Override
	public String toString() {
		return "Libros: " + titulo + "--autor: " + autor + "--fecha de Edicion: " + fechaEdicion + "--Páginas: " + numPag
				+ "--" + peso + " gramos";
	}
	
	
	
}
