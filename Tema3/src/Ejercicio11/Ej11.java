package Ejercicio11;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer cantidad;

		do {

			System.out.println("Indique la cantidad de números a introducir que sea mayor a 2");

			cantidad = sc.nextInt();

		} while (cantidad <= 2);

		Integer array[] = new Integer[cantidad];

		Integer y = 1;

		Integer x = 0;

		System.out.print(x + " ");

		for (int i = 0; i < array.length; i++) {

			if (i == 0) {

				array[i] = x;

			}

			else {

				array[i] = x;
			}
			array[i] = x + y;

			x = y;

			y = array[i];
		}

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " "); 

		}

		sc.close();

	}

}
