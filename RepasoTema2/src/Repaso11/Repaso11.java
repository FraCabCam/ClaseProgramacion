package Repaso11;

import java.util.Scanner;

public class Repaso11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer opcion;

		System.out.println("Hola Introduce un número entero.");

		Integer num1 = sc.nextInt();

		System.out.println("Ahora introduce otro número para desplegar el menú de operaciones.");

		Integer num2 = sc.nextInt();

		do {
			System.out
					.println("*** MENÚ ***\n   1. Sumar\n   2. Restar\n   3. Multiplicar\n   4. Dividir\n  0. Salir ");

			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("Has seleccionado Sumar.\n" + (num1 + num2));
				break;

			case 2:

				System.out.println("Has seleccionado Restar.\n" + (num1 - num2));
				break;

			case 3:

				System.out.println("Has seleccionado Multiplicar\n." + (num1 * num2));
				break;

			case 4:
				if (num2 > 0)
					System.out.println("Has seleccionado Dividir\n." + (num1 / num2));
				else if (num2 == 0)

					System.out.println("No se puede dividir " + num1 + " Entre 0");

				break;

			default:

				System.out.println("Opción incorrecta vuelve a probar");
				break;
			}

		} while (opcion != 0);

		sc.close();
	}

}
