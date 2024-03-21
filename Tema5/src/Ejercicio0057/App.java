package Ejercicio0057;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Diccionario diccionario = new Diccionario();
		List<String> listaPalabras = new ArrayList<String>();
		String palabra = "";
		String letra = "";
		do {
			System.out.println("Indica las palabras que quieras, para parar escribe 'FIN' ");
			palabra = sc.nextLine();
			if (palabra.equalsIgnoreCase("FIN")) {
				break;
			}
			listaPalabras.add(palabra);
			
		} while (!palabra.equalsIgnoreCase("FIN"));
		letra = "";
		diccionario.cargarDiccionario(listaPalabras);
		do {
			System.out.println("Dime una letra: ");
			letra = sc.nextLine();
			if (letra.equalsIgnoreCase("FIN")) {
				System.out.println("¡Gracias por jugar con nosotros! Chaao chachaoo");
				break;
			} else {
				
				diccionario.imprimirPalabras(letra);
			}
		} while (!letra.equalsIgnoreCase("FIN"));

	}

}
