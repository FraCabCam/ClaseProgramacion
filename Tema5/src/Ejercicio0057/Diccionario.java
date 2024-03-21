package Ejercicio0057;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Diccionario {
	protected Map<String, List<String>> mapa;
	
	public Diccionario() {
		mapa = new HashMap<>();
	}

	public void cargarDiccionario(List<String> lista) {
		for (String palabra : lista) {
			String key = palabra.split("")[0];
			if ((!mapa.containsKey(key)) || (mapa == null)) {
				mapa.put(key, new ArrayList<>());
				mapa.get(key).add(palabra);
			} else {
				mapa.get(key).add(palabra);
			}
		}
	}
	public void borrarDiccionario() {
		for (Iterator<String> iterator = mapa.keySet().iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			iterator.remove();
		}
	}
	
	public void imprimirPalabras(String letra) {
		List <String> lista = mapa.get(letra);
		System.out.println("Hay " + mapa.get(letra).size() + " palabras que empiezan por " + letra.toUpperCase());
		for (String p : lista) {
			 System.out.println("\t> " + p);
		}
	
	}
}
