package Ejercicio37_Cola;

import java.util.ArrayList;
import java.util.List;


public class ColaCadenas {
	 private List<String> cadena;
	 
	public ColaCadenas() {
		cadena = new ArrayList<String>();
	}
	public void añadirCadena(String cadena){
		this.cadena.add(cadena);
	}
	
	public String sacarCadena() {
		String guardaCadena = cadena.get(0);
		cadena.remove(0);
		return guardaCadena	;
	}
	
	public Integer getTamaño() {
		return this.cadena.size();
	}
	
	public String toString() {
		
		return cadena.toString();
	}
}
