package Ejercicio01;

public class Ejercicio01 {
	public static void main(String[] args) {
		String cadena = ("me pongo cachondo hasta con los maniquies del chino kikei kiikeeeiii");
		String cadenaModificada = getMayusculas(cadena);
		System.out.println(cadenaModificada);
	}

	public static String getMayusculas (String cadena) {
		String cadenaTrim = cadena.trim().toUpperCase();
		return cadenaTrim;
	}
}
