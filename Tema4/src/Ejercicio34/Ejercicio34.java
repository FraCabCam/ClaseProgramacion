package Ejercicio34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Indique una palabra.");
			lista.add(sc.nextLine());

		}
		System.out.println(lista.toString());

		Iterator<String> it = lista.iterator();

		while (it.hasNext()) {
			String cadena = (String) it.next();
			String mayus = cadena.toUpperCase();

			System.out.print(mayus + " ");
		}
		 System.out.println();
		if (lista.contains("")){

			System.err.println("Hay cadenas vacías.");

		}
		it = lista.iterator();
		while (it.hasNext()) {
			String x = (String) it.next();
			if (x.length() < 6){
				it.remove();
			}

		}

		System.out.println(lista);

	}

}
