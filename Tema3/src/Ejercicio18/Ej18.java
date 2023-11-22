package Ejercicio18;

import java.util.Scanner;

public class Ej18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique un número y te diré si es capicua");

		boolean esCapicua;

		Integer num;

		do {

			esCapicua = true;

			num = sc.nextInt();

			String[] capicua = num.toString().split("");

			for (int i = 0, j = capicua.length - 1; i < capicua.length && j >= 0 && esCapicua; i++, j--) {

				if (capicua[i].equals(capicua[j])) {

				}

				else {

					System.out.println("Eso no es capicúo, introduce otro numero");
					esCapicua = false;
				}

			}
		} while (esCapicua == false);

		System.out.println(num + " Es capicua");

	}

}
