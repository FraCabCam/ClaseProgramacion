package Ejercicio15;

import java.util.Scanner;

public class Ej15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String mensaje;

		System.out.println("Escribe una dirección web.");

		mensaje = sc.nextLine();

		String[] protocoloSinbarra = mensaje.split("//");
		
		String laOtraParte =protocoloSinbarra[1];

		String[] dominio = laOtraParte.split("\\.");

		for (int i = 1; i < protocoloSinbarra.length; i++) {
			

			System.out.println(protocoloSinbarra[0] + "//");
		
		

			

		}
		for (int i = 0; i < dominio.length; i++) {

			System.out.println(dominio[i]);

		}

	}

}
