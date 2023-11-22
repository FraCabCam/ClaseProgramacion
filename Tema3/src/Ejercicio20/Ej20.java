package Ejercicio20;

import java.util.Random;
import java.util.Scanner;

public class Ej20 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		String palabra[] = new String[] { "azulejo", "tenedor", "saltamontes", "carretilla", "molinero", "sofisticado",
				"terremoto", "culinario", "teclado", "primavera" };

		Integer juego = random.nextInt(palabra.length);

		String palabraAleatoria = palabra[juego];

		String arraySolucion[] = palabraAleatoria.split("");

		String[] arrayUsuario = new String[arraySolucion.length];

		arrayUsuario[0] = arraySolucion[0];

		Integer contadorFallos = 0;

		Boolean check = true;

		String letra = "";

		Integer contadorCorrectas = 0;

		do {
			for (int i = 1; i < arraySolucion.length; i++) {

				arrayUsuario[i] = "_";
				check = false;
			}

		} while (check);

		boolean victoria = false;

		do {// impresion
			System.out.print(arrayUsuario[0] + " ");

			for (int i = 1; i < arraySolucion.length; i++) {
				System.out.print(arrayUsuario[i]);
				System.out.print(" ");
			}
			System.out.println();

			System.out.print("Introduce una letra: "); // Inicio de la peticion de la letra

			letra = sc.nextLine();

			boolean letraEncontrada = false;

			for (int i = 1; i < arraySolucion.length; i++) {// doy valores

				if (arraySolucion[i].equalsIgnoreCase(letra) && arrayUsuario[i].equalsIgnoreCase("_")) {
					arrayUsuario[i] = letra;
					letraEncontrada = true;

				}

			}

			if (letraEncontrada == false) {
				contadorFallos++;
				if (contadorFallos < 9) {
					System.out.println("Has fallado te quedan " + (9 - (contadorFallos)) + " oportunidades");
				} else {
					System.out.println("HAS PERDIDO ;(");
				}
			}

			contadorCorrectas = 0;
			for (int i = 1; i < arrayUsuario.length; i++) { // cuenta si en los array son iguales con contador
				if (arraySolucion[i].equalsIgnoreCase(arrayUsuario[i])) {
					contadorCorrectas++;
				}
			}
			
			if(contadorCorrectas == arraySolucion.length - 1) {
				victoria = true;
				System.out.println("Enhorabuena, has ganado!");
				System.out.print(arrayUsuario[0] + " ");

				for (int i = 1; i < arraySolucion.length; i++) {
					System.out.print(arrayUsuario[i]);
					System.out.print(" ");
				}
			}

		} while (contadorFallos < 9 && !victoria);
		sc.close();
	}


}
