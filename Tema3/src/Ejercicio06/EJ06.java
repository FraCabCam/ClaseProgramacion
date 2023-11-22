package Ejercicio06;

import java.util.Scanner;

public class EJ06 {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String contenido;

		String cadena = "";

		String array[] = new String[3];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Indique 3 palabras de 1 en 1:");
			contenido = sc.nextLine();
			array[i] = contenido;
		}

		for (int i = 0; i < array.length; i++)
			cadena += array[i];
		{
			System.out.print(cadena + " ");

		}

		sc.close();

	}


}
