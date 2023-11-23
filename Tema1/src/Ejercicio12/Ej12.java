package Ejercicio12;

import java.util.Scanner;

public class Ej12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String usuario;

		Integer usuarioLongitud;
		do {
			System.out.println("Introduzca su usuario");

			usuario = sc.nextLine().toUpperCase().trim();

			usuarioLongitud = usuario.length();

			if (usuario.contains(" ")) {

				System.out.println("Usuario incorrecto, elimina los espacios.");

			}

			else if (usuarioLongitud < 10) {

				System.out.println("El usuario no puede tener menos de 10 caracteres");

			}
		} while (usuario.contains(" ") || (usuarioLongitud < 10));

		System.out.println("Usuario correcto");

		sc.close();

	}

}
