package Ejercicio05;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer num2;
		Integer posicionMax = 0;
		Integer posicionMin = 0;
		System.out.println("Indique la cantidad de números a introducir");
		Integer cantidad = sc.nextInt();
		Integer array[] = new Integer[cantidad];
		Integer media = array.length;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Estupendo ahora indique el número " + (i + 1) + ":");
			num2 = sc.nextInt();
			array[i] = num2;
		}
		Integer min = array[0];
		Integer max = array[0];
		Integer suma = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " \n");

			for (int i1 = 0, j = array.length - 1; i1 < array.length / 2; i1++, j--) {

			}
			if (array[i] > max) {

				max = array[i];

				posicionMax = i + 1;
			}
			if (array[i] < min) {

				min = array[i];
				posicionMin = i + 1;

			}

			suma += array[i];

		}

		media = suma / cantidad;

		System.out.println("El número mínimo es: " + min + " Y su posición es: " + posicionMin);
		System.out.println("El número máximo es: " + max + " Y su posición es: " + posicionMax);
		System.out.println("La suma de todos los numeros es: " + suma);
		System.out.println("La media es: " + media);

		sc.close();

	}
}
