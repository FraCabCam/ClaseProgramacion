package Repaso26;

import java.util.Random;
import java.util.Scanner;

public class Repaso26 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		String tirada;

		String jugar;

		Integer victoria = 0;

		Integer empate = 0;

		Integer derrota = 0;
		do {

			do {
				System.out.println("Introduce Piedra, Papel o tijeras para jugar.");

				tirada = sc.nextLine().trim().toLowerCase();

			} while (!tirada.equalsIgnoreCase("piedra") && !tirada.equalsIgnoreCase("papel")
					&& !tirada.equalsIgnoreCase("tijeras"));

			Integer dado = random.nextInt(0, 3);

			switch (dado) {
			case 0:
				System.out.println("Piedra.");

				if (tirada.equalsIgnoreCase("piedra") && dado == 0) {

					empate++;

					System.out.println("Empate");
				} else if (tirada.equalsIgnoreCase("papel") && dado == 0) {

					victoria++;
					System.out.println("Has ganado .|.");
				} else if (tirada.equalsIgnoreCase("tijeras") && dado == 0) {

					derrota++;
					System.out.println("HAS PERDIDO JAJAJA JIOOOOOO TONTOOO");
				}
				break;

			case 1:
				System.out.println("Papel.");
				if (tirada.equalsIgnoreCase("papel") && dado == 1) {

					empate++;
					System.out.println("Empate");
				} else if (tirada.equalsIgnoreCase("tijeras") && dado == 1) {

					victoria++;
					System.out.println("Has ganado .|.");
				} else if (tirada.equalsIgnoreCase("piedra") && dado == 1) {
					derrota++;
					System.out.println("HAS PERDIDO JAJAJA JIOOOOOO TONTOOO");
				}
				break;

			case 2:
				System.out.println("Tijeras.");

				if (tirada.equalsIgnoreCase("tijeras") && dado == 2) {
					empate++;
					System.out.println("Empate");
				} else if (tirada.equalsIgnoreCase("piedra") && dado == 2) {
					victoria++;
					System.out.println("Has ganado .|.");
				} else if (tirada.equalsIgnoreCase("papel") && dado == 2) {
					derrota++;
					System.out.println("HAS PERDIDO JAJAJA JIOOOOOO TONTOOO");
				}
			default:
				break;
			}

			System.out.println("Si quieres jugar otra vez escribe SI, si no, escribe NO");

			jugar = sc.nextLine().trim().toLowerCase();

		} while (jugar.equalsIgnoreCase("si"));

		System.out.println("Enhorabuena has ganado " + victoria + " veces.\n" + "Has empatado " + empate + " veces.\n"
				+ "Has perdido " + derrota + " veces.");
		
		sc.close();
	}

}
