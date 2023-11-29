package Ejercicio02;

public class Ejercicio02 {
	public static void main(String[] args) {
		String cadena = ("ME PONGO CACHONDO HASTA CON LOS MANIQUIES DEL CHINO KIKEI KIIKEEEIII");
				
		System.out.println(getMinusculas(cadena));
	}

	public static String getMinusculas (String cadena) {
		String cadenaTrim = cadena.trim().toLowerCase();
		return cadenaTrim;
	}
}



