package Repaso16;

import java.util.Scanner;

public class Repaso16 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una palabra");
		
		String palabra = sc.nextLine();	
		
		
		if (palabra.length() <=1) {
			
			System.out.println("Eso no es una palabra escribe algo mas");
		}
		
	
		for (int i = 0; i < palabra.length(); i++) {
			
		
			
			System.out.println(palabra.substring(i,i+1));
		}
		 	
		
		sc.close();
		
	}

}
