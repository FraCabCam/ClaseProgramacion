package Ejercicio14;

import java.util.Scanner;

public class Ej14 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texto;

		System.out.println("Indique su nombre completo.");
		
		texto = sc.nextLine();
		
		String[] trozos = texto.split(" ");
		
		for (int i = 0; i < trozos.length; i++) {
			
			System.out.println("En la posicion " + i + " tengo : " +  trozos[i]);
			
			
		}
	}


}
