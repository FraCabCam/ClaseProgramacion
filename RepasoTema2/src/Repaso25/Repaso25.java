package Repaso25;

import java.util.Random;
import java.util.Scanner;

public class Repaso25 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		String tirada;

		System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");

		tirada = sc.nextLine().trim().toLowerCase();

		Integer dado = random.nextInt(0, 3);

		switch (dado) {
		case 0:
			System.out.println("Piedra.");

			if (tirada.contains("piedra") && dado == 0) {

				System.out.println("Empate");
			} else if (tirada.contains("papel") && dado == 0) {

				System.out.println("Has ganado .|.");
			} else if (tirada.contains("tijeras") && dado == 0) {

				System.out.println("HAS PERDIDO JAJAJA JIOOOOOO TONTOOO");
			}
			break;

		case 1:
			System.out.println("Papel.");
			if (tirada.contains("papel") && dado == 1) {

				System.out.println("Empate");
			} else if (tirada.contains("tijeras") && dado == 1) {

				System.out.println("Has ganado .|.");
			} else if (tirada.contains("piedra") && dado == 1) {

				System.out.println("HAS PERDIDO JAJAJA JIOOOOOO TONTOOO");
			}
			break;

		case 2:
			System.out.println("Tijeras.");

			if (tirada.contains("tijeras") && dado == 2) {

				System.out.println("Empate");
			} else if (tirada.contains("piedra") && dado == 2) {

				System.out.println("Has ganado .|.");
			} else if (tirada.contains("papel") && dado == 2) {
				System.out.println("HAS PERDIDO JAJAJA JIOOOOOO TONTOOO");
			}
		default:
			break;

		}
		sc.close();
	}

}
