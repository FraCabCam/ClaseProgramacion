package Ejercicio07;

import java.util.Scanner;

public class Ej07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		Integer num1 = 0;
	
		Integer num2 = 0;
	
		do {
		
			System.out.println("Indique Un número.");
		
			num1 = sc.nextInt();
			
			System.out.println("Indique otro número.");
			
			num2 = sc.nextInt();
	
		}
		while (num1 != num2);
		
		System.out.println("Gracias mi bro?");
	
		sc.close();
		
			
	
}

}
