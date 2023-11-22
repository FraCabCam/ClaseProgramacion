package Ejercicio02;

import java.util.Scanner;

public class Ej02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");

		Integer x = sc.nextInt();

		Integer num[] = new Integer[5];

		for (int i = 0; i < num.length; i++) {

			num[i] = x * x;

			x++;

		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + "\n ");
		}
		sc.close();
	}


}
