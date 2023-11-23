package Ejercicio02;

import java.util.Scanner;

public class Ej02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Indique su altura por favor: ");
		
		Double altura = scanner.nextDouble();
		
		System.out.println("Ahora indique su peso por favor:  ");
		
		Double peso = scanner.nextDouble();
		
		Double IMC = (peso / (altura * altura));
		
		if (IMC <= 18.5) {
			System.out.println("Su IMC es:  " + IMC + " y es un peso inferior al normal");
			
		}
		else if (IMC >= 18.5 && IMC <=24.9) {
			System.out.println("Su IMC es:  " + IMC + " y es un peso normal");
		}
		
		else if (IMC >=25.0 && IMC <=29.9) {
			System.out.println("Su IMC es:  " + IMC + " y es un peso superior al normal");
		}
		
		else if (IMC >=30.0) {
			System.out.println("Su IMC es:  " + IMC + " y tiene usted Obesidad");
		}
		
		scanner.close();
	}


}
