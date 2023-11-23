package Repaso03;

import java.util.Scanner;

public class Repaso03 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer opcion;
		
		do {
			 System.out.println("*** MENÚ ***\n   1. Abrir\n   2. Guardar\n   3. Modificar\n   4. Salir ");

			opcion = sc.nextInt();
			
			 
		    
			switch (opcion) {
			
			case 1:
				
				System.out.println("Has seleccionado Abrir.");
				break;
			
			case 2:
				
				System.out.println("Has seleccionado Guardar.");
				break;
				
			case 3:
				
				System.out.println("Has seleccionado Modificar.");
				break;
			
			case 4:
				
				System.out.println("Bye Bye.");
				break;
				
			default:
				
				System.out.println("Opción incorrecta vuelve a probar");
				break;
			}
			
		}while (opcion != 4);
			
				
		sc.close();
	}

}
