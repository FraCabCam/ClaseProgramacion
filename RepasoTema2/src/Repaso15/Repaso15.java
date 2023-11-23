package Repaso15;

import java.util.Random;
import java.util.Scanner;

public class Repaso15 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		Integer aleatorio = 0;

		Integer numero;

		Integer contador = 0;
		
		aleatorio = random.nextInt(0 , 10);

		do {
			
			System.out.println("Intenta adivinar el número random");
			
			numero = sc.nextInt();
			
			
			
			System.out.println(aleatorio);
			
			for (int i = 0; i < 1; i++) {
				
				contador++;
			}
			
			
		} while (aleatorio != numero && contador < 10);
		
		System.out.println("Tu puntuacion es de " + (10 - contador));
		
		sc.close();
	}

}
