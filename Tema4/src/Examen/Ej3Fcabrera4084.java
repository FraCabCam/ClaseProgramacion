package Examen;

import java.util.Scanner;

public class Ej3Fcabrera4084 {
	public static void main(String[] args) {
		Integer array[] = new Integer[] { 7, 9, 4, 6, 1, 3, 2, 5, 8 };
		Scanner sc = new Scanner(System.in);
		boolean falso = false;
		do {
			falso = false;
			System.out.println("Escribe una palabra.");
			String palabra = sc.nextLine();
			for (int i = 0; i < array.length; i++) {

				if (palabra.length() == array[i]) {
					System.out.println("La palabra tiene una lonitud igual que el número que está en la posición " + i);
					falso = true;
				}
			}
			if (falso == false) {
				System.out.println("La palabra indicada no está en la lista. Prueba de nuevo.");
			}
		} while (falso != true);

	}

}
