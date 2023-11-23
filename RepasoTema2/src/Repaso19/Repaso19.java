package Repaso19;

import java.util.Scanner;

public class Repaso19 {
	private static final double FACTOR_CONSTANTE = 166.386;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Double opcion;
		do {
			System.out.println("1 - Pasar de Pesetas a Euros. \n 2 - Pasar de Euros a Pesetas. \n 3 - Salir.");

			opcion = sc.nextDouble();

			if (opcion == 1) {

				System.out.println(
						"Has seleccionado la opción:  Pasar de Pesetas a Euros, indique la cantidad a convertir.");

				opcion = sc.nextDouble();

				Double PesetaEuro = (opcion / FACTOR_CONSTANTE);

				System.out.println(opcion + " pesetas serían unos " + PesetaEuro + " Euros.");
			}

			else if (opcion == 2) {

				System.out.println(
						"Has seleccionado la opción:  Pasar de Euros a pesetas, indique la cantidad a convertir.");

				opcion = sc.nextDouble();

				Double EuroPeseta = (opcion * FACTOR_CONSTANTE);

				System.out.println(opcion + " Euros serían unas " + EuroPeseta + " Pesetas.");
			}

			else if (opcion == 3) {
				System.out.println("Has seleccionado Salir.");
			}
		} while (opcion != 3);

		System.out.println("Gracias.");
		
		sc.close();

	}
}
