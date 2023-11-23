package Repaso01;

import java.util.Scanner;

public class Repaso01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique cúal es su nombre.");

		String nombre = sc.nextLine().trim();

		System.out.println("Ahora Indique su año de nacimiento.");

		Integer añoNacimiento = sc.nextInt();

		Integer año = 2030 - añoNacimiento;

		System.out.println("Hola " + nombre + ", en el 2030 tendrás " + año + " años.");

		sc.close();

	}

}
