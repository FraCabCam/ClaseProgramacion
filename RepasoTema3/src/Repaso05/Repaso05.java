package Repaso05;

import java.util.Scanner;

public class Repaso05 {
	
	public static void main(String[] args) {

		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };

		Scanner sc = new Scanner(System.in);

		System.out.print("Lista de notas:");
		for (int i = 0; i < listaNotas.length; i++) {

			if (listaNotas[i] < 5) {

				listaNotas[i] = 5;
			}
			
			System.out.print(" " + listaNotas[i]);

		}

		

	}

}
