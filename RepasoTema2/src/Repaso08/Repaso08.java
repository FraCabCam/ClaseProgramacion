package Repaso08;

import java.util.Scanner;

public class Repaso08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String mensaje;

		do {
			System.out.println("Hola, dime algo educadamente con un hola y hasta luego.");

			mensaje = sc.nextLine().trim().toLowerCase();

			if (!mensaje.startsWith("hola") || !mensaje.endsWith("hastaluego")) {

				System.out.println("No te he entendido.");
			}

		} while (!mensaje.startsWith("hola") || !mensaje.endsWith("hastaluego"));

		Integer primerEspacio = mensaje.indexOf(" ");

		Integer segundoEspacio = mensaje.lastIndexOf(" ");

		String mensajeCortado = mensaje.substring(primerEspacio + 1, segundoEspacio);

		System.out.println("Lo he entendido");
		System.out.println(mensajeCortado);

		sc.close();
	}
}
