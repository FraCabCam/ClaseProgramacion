package Ejercicio10;

import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String cadena1;

		String cadena2;

		do {
			System.out.println("Introduzca una cadena ");

			cadena1 = sc.nextLine();

			System.out.println("Introduzca otra cadena");

			cadena2 = sc.nextLine();
		}

		while (cadena1.isBlank() || cadena2.isBlank());
		
		Integer x = cadena1.compareTo(cadena2);

		if (x > 0) {

			System.out.println("Cadenas ordenadas alfabéticamente");

			System.out.println(cadena2);

			System.out.println(cadena1);

		} else {

			System.out.println("Cadenas ordenadas alfabéticamente");

			System.out.println(cadena1);

			System.out.println(cadena2);

			sc.close();
		}

	}

}
