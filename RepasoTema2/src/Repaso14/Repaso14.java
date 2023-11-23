package Repaso14;

import java.util.Scanner;

public class Repaso14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String password;

		String newPassword;

		do {

			System.out.println("Introduzca una contraseña ");

			password = sc.nextLine().trim().toLowerCase();

			if (password.length() < 8) {

				System.out.println("La contraseña debe tener al menos 8 caracteres ");

			}
		} while (password.length() < 8);

		newPassword = password.replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0")
				.replaceAll("t", "7");

		System.out.println(newPassword);

		sc.close();
	}
}
