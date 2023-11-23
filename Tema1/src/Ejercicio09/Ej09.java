package Ejercicio09;

import java.util.Scanner;

public class Ej09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Indique su nombre completo.");

		String nombreCompleto = sc.nextLine().trim();

		Integer espacio1 = nombreCompleto.indexOf(" ");

		Integer apellido2 = nombreCompleto.lastIndexOf(" ");

		System.out.println(nombreCompleto.substring(0, espacio1));

		System.out.println(nombreCompleto.substring(espacio1 +1, apellido2));

		System.out.println(nombreCompleto.substring(apellido2+1));

		sc.close();

	}

}
