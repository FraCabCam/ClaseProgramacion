package Examen;

import java.util.Scanner;

public class Ej1Fcabrera4084 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palabra = "";
		do {
			System.out.println("Escribe una palabra que contenga la letra M");

			palabra = sc.nextLine().trim().toLowerCase();

		} while (!palabra.contains("m"));

		Integer indexM = palabra.indexOf("m");
		Integer lastIndexM = palabra.lastIndexOf("m");
		String subcadena1 = palabra.substring(0, indexM + 1);
		String subcadena2 = palabra.substring(indexM + 1);
		System.out.println(subcadena2 + subcadena1);

	}
}
