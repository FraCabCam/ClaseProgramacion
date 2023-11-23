package Ejercicio08;

import java.util.Scanner;

public class Ej08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String cadena1; 
		
		String cadena2; 
		
		
	
		do {
			
			System.out.println("Indique una cadena. ");
		
			cadena1 = sc.nextLine();
			
			cadena1 = cadena1.trim();
			
			System.out.println("Indique otra cadena. ");
			
			cadena2 = sc.nextLine();
			
			cadena2 = cadena2.trim();
			
			if (cadena1.equalsIgnoreCase(cadena2));
				
			System.out.println("Hola has escrito lo mismo dos veces.");
		}
		while (cadena1.equalsIgnoreCase(cadena2));
		
		
		sc.close();
	}

}
