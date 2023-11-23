package Ejercicio18;

import java.util.Scanner;

public class Ej18 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		
	System.out.println("Introduzca un número del 1 al 12.");
	
	Integer num = sc.nextInt();
		
	while (num >= 13) {
		
		System.out.println("Te dije un número del 1 al 12 mameluco.");
		
		num = sc.nextInt();
	}
	
		
		switch (num){
			
			case 1:
				System.out.println("ENERO");
				break;
			case 2:
				System.out.println("FEBRERO");
				break;
			case 3:
				System.out.println("MARZO");
				break;
			case 4:
				System.out.println("ABRIL");
				break;
			case 5:
				System.out.println("MAYO");
				break;
			case 6:
				System.out.println("JUNIO");
				break;
			case 7:
				System.out.println("JULIO");
				break;				
			case 8:
				System.out.println("AGOSTO");
				break;
			case 9:
				System.out.println("SEPTIEMBRE");
				break;
			case 10:
				System.out.println("OCTUBRE");
				break;
			case 11:
				System.out.println("NOBIEMBRE");
				break;
			case 12:
				System.out.println("DICIEMBRE");
				break;
		
	
		}
	sc.close();	
	}
}
