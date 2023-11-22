package T301;

import java.util.Random;
import java.util.Scanner;

public class Ej01 {
	public static void main(String[] args) {

		System.out.println("Cuantas tiradas quieres hacer?");

		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		Integer tiradas = sc.nextInt();

		sc.nextLine();

		Integer arrayDados[] = new Integer[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		Integer sumaDados;

		for (int i = 0; i < tiradas; i++) {

			Integer dado1 = random.nextInt(1, 7);
			Integer dado2 = random.nextInt(1, 7);

			sumaDados = dado1 + dado2;

			arrayDados[sumaDados - 2] += 1;
			sumaDados = 0;

		}

		for (int i = 0; i < arrayDados.length; i++) {

			Integer porcentaje = (arrayDados[i] * 100) / tiradas;

			System.out.println("El numero " + (i + 2) + " ha salido un " + porcentaje + "% de las veces");
		}	System.out.println();

	}

}
