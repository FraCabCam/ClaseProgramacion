package Ejercicio22;

import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe algo bonito, o feo si eres mala persona.");

		String palabra = sc.nextLine();

		String deletreo[] = palabra.split("");

		for (String string : deletreo) {

			System.out.print(string + " ");
		}
		
		sc.close();

	}

}
