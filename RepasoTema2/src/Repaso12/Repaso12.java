package Repaso12;

import java.util.Scanner;

public class Repaso12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número mayor que 0.");

		Integer num = sc.nextInt();

		System.out.print(" __");
		for (int column = 2; column <= num; column++) {
			System.out.print("___");

		}
		System.out.println();
		for (int fila = 1; fila <= num; fila++) {
			for (int column = 1; column <= num; column++) {
				System.out.print("|__");

			}
			System.out.println("|");
		}
		sc.close();
	}

}
