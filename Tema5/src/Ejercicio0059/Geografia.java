package Ejercicio0059;

import java.util.HashMap;
import java.util.Map;

public class Geografia {
	private Map<String, String> mapa;

	public Geografia() {
		mapa = new HashMap<String, String>();
	}

	public Boolean agregarPais(String pais, String capital) {
		if (mapa.containsKey(pais)) {
			mapa.put(pais.toUpperCase(), capital.toLowerCase());
			return true;
		} else {
			mapa.put(pais.toUpperCase(), capital.toLowerCase());
			return false;
		}
	}

	public String obtenerCapital(String pais) {
		if (mapa.containsKey(pais.toUpperCase())) {
			return mapa.get(pais);
		} else {
			return "No existe ese país en el mapa.";
		}

	}
	public void imprimirPaises() {
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			String pais = entry.getKey();
			String capital = entry.getValue();
			System.out.println("PAÍS: " + pais + " -" + " CAPITAL " + capital + "\n");
		}
		
	}
	
	
}
