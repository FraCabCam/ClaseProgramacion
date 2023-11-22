package Ejercicio19;

import java.util.Scanner;

public class Ej19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe algo bonito, o feo si eres mala persona.");

		String mensaje = sc.nextLine();

		String array[] = mensaje.split(" ");

		String aes[] = mensaje.split("");

		Integer contadorA = 0;

		for (int i = 0; i < aes.length; i++) {

			if (aes[i].equals("a")) {

				contadorA++;

			}

		}

		System.out.println("En ese texto hay " + array.length + " palabras.");

		System.out.println("Y ademas hay " + contadorA + " cantidad de aes.");
		
		sc.close();
	}

}
