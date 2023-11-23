package Repaso17;

import java.util.Scanner;

public class Repaso17 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Integer num;
		do {
		System.out.println("Inserte un número mayor a 2");

		 num = sc.nextInt();
		}
		while (num <=2);
		Integer x = 0;

		Integer y = 1;

		Integer aux;

		System.out.print(x + " ");
		
	
		for (int i = 0; i < num - 1; i++) {
			

			
			aux = x + y;

			x = y;

			y = aux;

			System.out.print(x + " ");
		
		
		
		sc.close();
	}
	}

}
