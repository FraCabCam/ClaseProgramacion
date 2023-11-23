package Ejercicio13;

import java.util.Scanner;

public class Ej13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String texto;

		System.out.println("Introduzca un texto.");

		texto = sc.nextLine();

		for (int i = 0; i < texto.length(); i += 5) {

			if (texto.substring(i).length() > 5) {

				System.out.println(texto.substring(i, i + 5));

			} else {

				System.out.println(texto.substring(i));

			}
		
		}
		
		sc.close();
	}

}
