package Clase;

import java.util.Scanner;

public class Recursividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		Integer x = sc.nextInt();
		System.out.println(factorial(x));

	}

	// public static Integer sumar(Integer num) {
	// Integer y = 0;
	// if (num == 1) {
	// return 1;
	// }
	// return num + sumar(num - 1);
	// }
	public static Integer factorial (Integer num) {
		if (num == 1) {
			return 1;
		}
		if (num > 1) {
			return num * factorial(num -1 );
		}
			return num;	
		}
		
}
