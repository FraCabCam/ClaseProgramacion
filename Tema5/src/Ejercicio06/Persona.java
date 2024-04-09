package Ejercicio06;

import java.math.BigDecimal;

/**
 * clase para crear personas con altura y género.
 * 
 * @author fcabrera
 */
public class Persona {
	private String genero;
	private BigDecimal altura;

	public Persona() {

	}
	public String getGenero() {
		return genero;
	}

	/**
	 * Método que busca si el String que recibe es H o M si no lanza una excepción
	 * que hemos creado en una clase a parte heredando de Exception.
	 * 
	 * @param genero
	 * @throws ParametroIncorrectoException
	 */
	public void setGenero(String genero) throws ParametroIncorrectoException {
		
		if (genero == null || !genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M")) {
			throw new ParametroIncorrectoException("El género solo puede ser 'H' o 'M'");
		} 
		this.genero = genero.toUpperCase();
		

	}

	public BigDecimal getAltura() {
		return altura;
	}

	/**
	 * Método que busca si el BigDecimal que recibe es mayor que 0 o menor que 3 si
	 * no lanza una excepción que hemos creado en una clase a parte heredando de
	 * Exception.
	 * 
	 * @param genero
	 * @throws ParametroIncorrectoException
	 */

	@SuppressWarnings("null")
	public void setAltura(BigDecimal altura) throws ParametroIncorrectoException {
		if (altura == null || (altura.compareTo(BigDecimal.ZERO) <= 0 || altura.compareTo(new BigDecimal(3)) >= 0)) {
			throw new ParametroIncorrectoException("La altura tiene que ser mayor que 0 y menor que 3");
		} 
		this.altura = altura;
		
	}

	public String toString() {
		return "Persona de genero: " + genero + ", y  altura: " + altura;
	}

}
