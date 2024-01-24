package Ejercicio38_Pila;

import java.util.ArrayList;
import java.util.List;

public class PilaCadenas {
	private  List<String> cadenas;
	
	public PilaCadenas() {
		cadenas = new ArrayList<String>();
	}
	
	public void añadirCadena(String cadena) {
		cadenas.add(cadena);
	}
	
	public String sacarCadena () {
		
		return cadenas.remove(cadenas.size() -1);
	}
	
	public Integer getTamaño() {
		return cadenas.size();
	}
	
	public String toString() {
		
		return cadenas.toString();
	}

}
