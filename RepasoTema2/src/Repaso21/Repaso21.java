package Repaso21;

import java.util.Scanner;

public class Repaso21 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer num;

		do {
			System.out.println("Inserte un número mayor que 0 para el tamaño del cuadrado.");

			num = sc.nextInt();

		} while (num <= 0);

		for (int fila = 0; fila < num; fila++) {
			for (int column = 0; column < num; column++) {

				if (fila == column) {

					System.out.print(" *");

				} else {

					System.out.print(" -");
				}

			}
			System.out.println();
		}

		sc.close();
	}
}
