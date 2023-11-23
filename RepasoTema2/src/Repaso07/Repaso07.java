package Repaso07;

import java.util.Scanner;

public class Repaso07 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer num;

		Integer contador = 0;
		
		Integer suma;

		do {
			System.out.println("\nIntroduzca un número natural.");

			num = sc.nextInt();
			
			suma = num * 10;

			if (num >= 1 && num <= 10) {

				for (int i = num; i <= suma; i += num) {

					if (i < suma) {

						System.out.print(i + " + ");
					}
					contador = contador + i;
					if (i == suma) {

						System.out.print(i + " = " + contador);
					}
				}
			} else if (num < 0 || num > 10) {

				System.out.println("El número indicado no es el correcto.");
			}

		} while (num != 0);

		sc.close();

	}


}
