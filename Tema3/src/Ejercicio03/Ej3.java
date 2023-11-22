package Ejercicio03;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer num2;

		System.out.println("Indique la cantidad de números a introducir");

		Integer cantidad = sc.nextInt();

		Integer array[] = new Integer[cantidad];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Estupendo ahora indique los números");
			num2 = sc.nextInt();
			array[i] = num2;

		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}

}
