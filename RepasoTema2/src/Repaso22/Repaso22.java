package Repaso22;

import java.util.Scanner;

public class Repaso22 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer contador = 0;

		do {

			contador++;

			sc.nextLine();

			System.out.println(contador);

		} while (contador != 10);
		sc.close();
	}

}
