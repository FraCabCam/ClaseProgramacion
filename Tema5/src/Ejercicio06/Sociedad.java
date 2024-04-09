package Ejercicio06;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Set;

public class Sociedad {
	
	/**
	 * Tiene un set que constituye un conjunto de personas de la clase Persona.
	 * @author fcabrera
	 */
	private Set<Persona> conjunto;
	public Sociedad() {
		conjunto = new HashSet<Persona>();
	}
	public void addPersona(String genero, BigDecimal altura) throws ParametroIncorrectoException {
		Persona p = new Persona();
		try {
			p.setGenero(genero);
			
			p.setAltura(altura);
			conjunto.add(p);
		} catch (ParametroIncorrectoException e) {
			System.err.println("Error: " + e.getMessage());
			throw e;
		}
		
			
	}
	private BigDecimal calcularAlturaMedia(String genero) throws ListaVaciaException {
			long personas = conjunto.stream().filter(p -> p.getGenero().equals(genero)).count();
			if (personas == 0) {
				throw new ListaVaciaException("No hay personas.");
			}		
			BigDecimal suma = new BigDecimal(conjunto.stream().filter(p -> p.getGenero().equals(genero)).mapToDouble(p -> p.getAltura().doubleValue()).sum());
			
			BigDecimal media = suma.divide(new BigDecimal(conjunto.stream().filter(p -> p.getGenero().equals(genero)).count()), 2, RoundingMode.HALF_UP);

			return media;	
	}
	public BigDecimal calcularAlturaMediaMujeres()  throws ListaVaciaException {
		return calcularAlturaMedia("M");
	}
	public BigDecimal calcularAlturaMediaHombres()  throws ListaVaciaException {
		return calcularAlturaMedia("H");
	}
}
