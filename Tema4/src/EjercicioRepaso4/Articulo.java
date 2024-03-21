package EjercicioRepaso4;

import java.time.LocalDate;
import java.util.Objects;

public class Articulo {
	protected String codigo;
	protected String autor;
	protected String titulo;
	protected LocalDate añoPublicacion;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalDate getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(LocalDate añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	@Override
	public String toString() {
		return "Código del artículo: " + codigo + "--autor: " + autor + "--titulo: " + titulo + "--añoPublicacion: "
				+ añoPublicacion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
	
	


}
