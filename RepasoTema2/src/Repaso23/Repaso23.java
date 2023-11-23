package Repaso23;

import java.util.Random;
import java.util.Scanner;

public class Repaso23 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		System.out.println("Indique cuantas veces quieres tirar el dado");

		Integer tirada = sc.nextInt();

		Integer cantidad1 = 0;
		Integer cantidad2 = 0;
		Integer cantidad3 = 0;
		Integer cantidad4 = 0;
		Integer cantidad5 = 0;
		Integer cantidad6 = 0;

	
			for (int i = 0; i < tirada; i++) {

				Integer dado = random.nextInt(1, 7);

				switch (dado) {
				case 1:
					cantidad1++;

					break;
				case 2:
					cantidad2++;

					break;
				case 3:
					cantidad3++;

					break;
				case 4:
					cantidad4++;

					break;
				case 5:
					cantidad5++;

					break;
				case 6:
					cantidad6++;

					break;
				}
			}
		System.out.println("Resultado de las tiradas:");
		System.out.println("El número 1 ha salido " + cantidad1 + " veces.");
		System.out.println("El número 2 ha salido " + cantidad2 + " veces.");
		System.out.println("El número 3 ha salido " + cantidad3 + " veces.");
		System.out.println("El número 4 ha salido " + cantidad4 + " veces.");
		System.out.println("El número 5 ha salido " + cantidad5 + " veces.");
		System.out.println("El número 6 ha salido " + cantidad6 + " veces.");
		
		

		sc.close();
	}

}
