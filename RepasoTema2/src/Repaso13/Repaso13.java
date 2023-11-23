package Repaso13;

import java.util.Scanner;

public class Repaso13 {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase;
		
		String finalFrase = "";
		
		do {
			System.out.println("Escribe una frase");
			
			frase = sc.nextLine();
			
			finalFrase = finalFrase + frase + "\n";
			
	

			
		} while (!frase.equalsIgnoreCase("fin"));
			
			System.out.println(finalFrase);
		
		sc.close();
	}

}
