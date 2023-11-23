package Ejercicio01;

import java.util.Scanner;

public class Ej01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nombre del usuario: ");

		String nombre = scanner.nextLine();

		System.out.println("Ahora su apellido ");

		String apellido = scanner.nextLine();

		System.out.println("Su nombre completo es " + nombre + " " + apellido);

		scanner.close();
	}
}
