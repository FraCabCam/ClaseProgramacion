package Repaso07;

import java.util.Scanner;

public class Repaso07 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String telegrama = "";
		
		System.out.println("Escribe tu telegrama.");
		
		telegrama = sc.nextLine();
		
		Double suma = 0.0;
		
		String array[] = telegrama.split(" ");
		
		for (String string : array) {
			
			if (string.equalsIgnoreCase("STOP")) {
				
				suma+= 0.0;
			}
			else {
				
				suma+= 0.24;
			}
			System.out.print(" " + string);
		}
		System.out.println();
		
		System.out.println("El precio es: " + suma);
	}


}
