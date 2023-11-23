package Repaso09;

import java.util.Scanner;

public class Repaso09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String mensaje;

		do {

			do {
				System.out.println(" dime algo educadamente con un hola y hasta luego.");

				mensaje = sc.nextLine().trim().toLowerCase();

				if (!mensaje.startsWith("hola") || (!mensaje.endsWith("hastaluego") && !mensaje.endsWith("adios"))) {

					System.out.println("No te he entendido.");
				}
				
				

			} while (!mensaje.startsWith("hola") || (!mensaje.endsWith("hastaluego") && !mensaje.endsWith("adios")));

			Integer primerEspacio = mensaje.indexOf(" ");

			Integer segundoEspacio = mensaje.lastIndexOf(" ");

			String mensajeCortado = mensaje.substring(primerEspacio + 1, segundoEspacio);

			System.out.println("Lo he entendido");
			System.out.println(mensajeCortado);

		} while (!mensaje.endsWith("adios"));

		System.out.println("adios");
		
		
		sc.close();
	}
}
