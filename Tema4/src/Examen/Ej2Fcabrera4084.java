package Examen;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ej2Fcabrera4084 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		Random random = new Random();
		Integer suma = 0;
		do {
			System.out.println("Indique un número entre el 10 y el 20 (inclusives)");

			num = sc.nextInt();

		} while (!(num >= 10) || !(num <= 20));

		Integer array[] = new Integer[num];
		System.out.println("Numeros generados: ");
		for (int i = 0; i < array.length; i++) {
			Integer numeroRandom = random.nextInt(array.length);
			array[i] = numeroRandom;

			suma = suma + array[i];

			if (i <= array.length - 2)
				System.out.print(array[i] + " + ");

			else {
				System.out.print(array[i]);
			}

			if (i == array.length - 1) {

				System.out.print(" = " + suma);
			}
		}
	}

}
