package Ejercicio0059;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Geografia {
	private Map<String, String> mapa;

	public Geografia() {
		mapa = new HashMap<String, String>();
	}

	public Boolean agregarPais(String pais, String capital) {
		pais = pais.toUpperCase();
		capital = capital.substring(0,1).toUpperCase() + capital.substring(1).toLowerCase();
		if (mapa.containsKey(pais)) {
			mapa.put(pais, capital);
			return true;
		} else {
			mapa.put(pais, capital);
			return false;
		}
	}

	public String obtenerCapital(String pais) {
		if (mapa.containsKey(pais.toUpperCase())) {
			return mapa.get(pais.toUpperCase());
		} 
		else {
			return "No existe ese país en el mapa.";
		}
			
		

	}
	public void imprimirPaises() {
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			String pais = entry.getKey();
			String capital = entry.getValue();
			System.out.println("PAÍS: " + pais + " -" + " CAPITAL " + capital);
		}
		
	}
	public void eliminarPais(String pais) {
		mapa.remove(pais.toUpperCase());
	}
	public Integer calcularLongitudMediaPaises() throws Exception {
		if (mapa.isEmpty()) {
			throw new Exception("No hay paises");	
		}
		Integer suma = 0;
		for (String pais : mapa.keySet()) {
			suma += pais.length();
		}
		return suma/mapa.size();
	}
	public void eliminarPaisConCapitalLetra(String letra) {
		for (Iterator<String> iterator = mapa.keySet().iterator(); iterator.hasNext();) {
			String pais = (String) iterator.next();
			String capital = mapa.get(pais);
			if (capital.startsWith(letra.toUpperCase())) {
				iterator.remove();
				break;
			}
			
		}
	}
	public Integer numeroPaisesConCapitalLetra(String letra) {
		Integer contador = 0;
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			String capital = entry.getValue();
			if (capital.startsWith(letra.toUpperCase())) {
				contador ++;
			}
		}
		return contador;
	}
	public void imprimirNumeroPaisesLetra(String letra) {
		Boolean existe = false;
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			String pais = entry.getKey();
			String capital = entry.getValue();
			if (capital.startsWith(letra.toUpperCase())) {
				existe = true;
				System.out.println("PAÍS: " + pais + " -" + " CAPITAL " + capital);
			}
		}
		if (!existe) {
			System.out.println("No hay ningún país cuya capital empiece por " + letra);
		}
		
	}
	
	public void mismaLetra() {
		Boolean existe = false;
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			String pais = entry.getKey();
			String capital = entry.getValue();
			if (capital.startsWith(pais.substring(0,1))) {
				existe = true;
				System.out.println("PAÍS: " + pais + " -" + " CAPITAL " + capital);
			}
		}
		if (!existe) {
			System.out.println("No hay ningún país cuya capital empiece por la misma letra que la del país" );
		}
		
	}
	
}
