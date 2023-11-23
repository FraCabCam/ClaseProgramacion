package Repaso24;

import java.util.Scanner;

public class Repaso24 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer num;

		Integer resultado = 0;

		do {

			System.out.println("Introduce un número mayor a 0");
			num = sc.nextInt();
			if (num == 0) {
				System.out.println("El numero introducido es inválido.");
			}

		} while (num <= 0);

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {

				resultado = resultado + i;
			}

		}

		System.out.println("La suma de los numeros impares que hay en " + num + " es de: " + resultado);

		sc.close();
	}
}
