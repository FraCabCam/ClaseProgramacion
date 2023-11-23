package Ejercicio14;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número.");

		Integer numero = sc.nextInt();

		for (int i = 0; i <= 10; i++) {

			System.out.println(numero + " x " + i + " = " + numero * i);

		}
		sc.close();

	}

}
