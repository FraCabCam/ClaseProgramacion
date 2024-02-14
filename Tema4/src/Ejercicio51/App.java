package Ejercicio51;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		List<BigDecimal> listaNumeros = new ArrayList<BigDecimal>();
		Scanner sc = new Scanner(System.in);
		Integer contador = 0;
		BigDecimal usuario = BigDecimal.ZERO;
		System.out.println("Indica un número ");
		 usuario  = sc.nextBigDecimal();
		 listaNumeros.add(usuario);
		
		do {
			
			System.out.println("Indique un número y que sea mayor que el anterior");
			 usuario  = sc.nextBigDecimal();
			if (listaNumeros.get(contador).compareTo(usuario) > 0 ) {
				System.out.println("El numero no es mayor que el anterior");		
			}
			else {
				listaNumeros.add(usuario);
				contador ++;
				
			}
		} while (listaNumeros.size() != 5);
		
		System.out.println(listaNumeros);
		BigDecimal suma = BigDecimal.ZERO;
		
		for (BigDecimal num : listaNumeros) {
			suma = suma.add(num);
		}
		System.out.println(suma);
		
		BigDecimal division = listaNumeros.get(0).divide(listaNumeros.get(1), 3,RoundingMode.HALF_UP);
		System.out.println(division);
		sc.close();
	}

	

}
