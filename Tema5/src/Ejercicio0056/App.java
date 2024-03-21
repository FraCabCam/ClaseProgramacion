package Ejercicio0056;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Indica los números que quieras, para parar introduce 0");
		Integer num = 0;
		Integer contador2 = 0;
		do {
			num = sc.nextInt();
			contador2++;
			if (num == 0) {
				break;
			}
			if (!mapa.containsKey(num)) {
				mapa.put(num, 1);
			} else if (mapa.containsKey(num)) {
				Integer contador = mapa.get(num) + 1;
				mapa.put(num, contador);
			}

		} while (num != 0);
		System.out.println("Total de números indicados: " + contador2);
		System.out.println("Distribución:");
		for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if (val > 1) {
				System.out.println("\t> Número " + key + ": " + val + " veces.");
			} else {
				System.out.println("\t> Número " + key + ": " + val + " vez.");
			}
		}
		sc.close();
	}

}
