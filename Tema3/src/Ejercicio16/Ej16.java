package Ejercicio16;

import java.util.Scanner;

public class Ej16 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una palabra");

		String palabra = sc.nextLine();

		String palabraInvertida = "";

		if (palabra.length() <= 1) {

			System.out.println("Eso no es una palabra escribe algo mas");
		}

		for (int i = palabra.length(); i > 0; i--) {

			palabraInvertida = palabraInvertida + palabra.substring(i - 1, i);

		}
		System.out.print(palabraInvertida);

		sc.close();

	}

}
