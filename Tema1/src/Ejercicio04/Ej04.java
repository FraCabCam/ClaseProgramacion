package Ejercicio04;

import java.util.Scanner;

public class Ej04 {
	 public static void main(String[] args) {
			
			System.out.println("Dame un número");
			Scanner sc = new Scanner(System.in);
			Integer suma = 0;
			Integer numero;
			
			do {	
				 numero = sc.nextInt();
				 suma = suma + numero;
			} while (numero != 0);
			
			System.out.println("La suma es: " + suma);

				
				
			
			
			
			
			
			sc.close();
		 }

}
