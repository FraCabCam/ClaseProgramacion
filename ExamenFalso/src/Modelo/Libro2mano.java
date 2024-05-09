package Modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Libro2mano  extends Libro{
	private Integer antiguedad;

	
	
	
	public Libro2mano(String titulo, String autor, String ISBN, BigDecimal precio) {
		super();
		this.precio = precio.divide(new BigDecimal(0.50)).setScale(2,RoundingMode.HALF_UP);
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		
	}
	public Integer getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	
	

	

}
