package Ejercicio0055;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Evaluacion {
	private Map<String, BigDecimal> mapa;
	public Evaluacion() {
		mapa = new HashMap<String, BigDecimal>();
	}
	
	public Boolean addNota(String dni, BigDecimal nota) {
		if (mapa.containsKey(dni)) {
			
			return false;
		}
		else {
			mapa.put(dni, nota.setScale(1,RoundingMode.HALF_EVEN));
			return true;
		}
	}
	
	public Boolean corregirNota(String dni, BigDecimal nota) {
		if (mapa.containsKey(dni)) {
			mapa.put(dni, nota);
			return true;
		}
		else {
			return false;
		}
	}
	
	public BigDecimal obtenerNotaAlumno(String dni) {
		if (mapa.containsKey(dni)) {
			return mapa.get(dni);
		}
			return BigDecimal.ZERO;
	}
	public BigDecimal obtenerNotaMedia() {
		if (mapa.isEmpty()) {
			return BigDecimal.ZERO;
		}
		BigDecimal media = BigDecimal.ZERO;
		for (BigDecimal value : mapa.values()) {
			media = media.add(value);
		}
		BigDecimal resultado = media.divide(new BigDecimal(mapa.size()),2 ,RoundingMode.HALF_UP);
		return resultado;
	}
	
	public Integer obtenerCantidadAprobados() {
		Integer aprobados = 0;
		
		for (BigDecimal value : mapa.values()) {
			if (value.compareTo(new BigDecimal(5)) >= 0) {
				aprobados += 1;
			}
		}
		return aprobados;
		//mapa.values().stream().filter(n ->n.compareTo(new BigDecimal(5)) >= 0).count();
	}
	public List<String> obtenerSuspensos() {
		List<String> dniAlumnos = new ArrayList<String>();
		for (String dni : mapa.keySet()) {
			if (mapa.get(dni).compareTo(new BigDecimal(5)) < 0) {
				dniAlumnos.add(dni);
			}
		}
		return dniAlumnos;	
	}
	
	public void borrarAprobados() {
		for (Iterator<BigDecimal> iterator = mapa.values().iterator(); iterator.hasNext();) {
			BigDecimal value = (BigDecimal) iterator.next();
			if (value.compareTo(new BigDecimal(5)) >= 0) {
				iterator.remove();
			}
		}
	}
	
	@Override
	public String toString() {
		String aprobados = "";
		String suspensos = "";
		for (Map.Entry<String, BigDecimal> key : mapa.entrySet()) {
			String dni = key.getKey();
			BigDecimal nota = key.getValue();
			if (nota.compareTo(new BigDecimal(5)) >= 0) {
				aprobados += "\t" + dni + " (" + nota + ")\n";
			}
			if (nota.compareTo(new BigDecimal(5)) < 0) {
				suspensos += " \t" + dni + " (" + nota + ")\n";
			}	
		}
		return "Aprobados: \n" + aprobados +  "Suspensos: \n" + suspensos;
	}
	
	
	
	
}
