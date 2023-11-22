package Ejercicio17;

import java.util.Scanner;

public class Ej17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String texto;

		System.out.println("Por favor, ingrese un texto: ");
		texto = sc.nextLine();

		String palabra[] = texto.split("");

		
		System.out.print(palabra[0]);

		for (int i = 1; i < palabra.length; i++) {
			
			if (!palabra[i].equals(" ")) {

			System.out.print(palabra[i]);
			
			}
			else {
				i++;
				System.out.print(palabra[i].toUpperCase());
				
				
				
			}
			
	
		}
		
		sc.close();
	}

}
