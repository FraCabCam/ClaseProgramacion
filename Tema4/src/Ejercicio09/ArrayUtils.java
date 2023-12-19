package Ejercicio09;

public class ArrayUtils {

	public static String imprimirArray(String[] array) {
		String cadena = "";
		for (String string : array) {
			cadena = cadena + string;
		}
		return cadena;
	}

	public static String obtenerPalabra(String[] array2, Integer n) {
		for (int i = 0; i < array2.length; i++) {

			if (i == n) {
				return array2[n];
			}
		}
		return "";

	}

	public static Integer buscarPalabra(String[] array2, String cadena) {
		for (int i = 0; i < array2.length; i++) {
			if (array2[i].equalsIgnoreCase(cadena)) {

				return i;
			}

		}
		return -1;
	}
	public static void arrayPalabra(String[] array3, Integer posicion) {
		String palabra = array3[posicion];
		System.out.println(palabra);
		if (posicion < array3.length-1) {
			arrayPalabra(array3, posicion +1);
		}
		
		
	}

}
