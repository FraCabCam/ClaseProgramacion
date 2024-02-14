package Ejercicio49;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();
		Set<String> soyuntrapala = new HashSet();

		for (int i = 0; i < 5; i++) {
			System.out.println("Indique una palabra.");
			lista.add(sc.nextLine());

		}
		System.out.println(lista.toString());
		for (int i = 0; i < lista.size(); i++) {
			String mayus = lista.get(i);
			mayus = mayus.toUpperCase();
			soyuntrapala.add(mayus);
			
		}
			
		Iterator<String> it = soyuntrapala.iterator();

		while (it.hasNext()) {
			String cadena = (String) it.next();
			
			
		}
			System.out.println(soyuntrapala);
		 System.out.println();
		if (lista.contains("")){

			System.err.println("Hay cadenas vacías.");

		}
		it = soyuntrapala.iterator();
		while (it.hasNext()) {
			String x = (String) it.next();
			if (x.length() < 6){
				it.remove();
			}

		}

		System.out.println(soyuntrapala);

	}
}
