package Repaso03;

import java.util.Scanner;

public class Repaso03 {
	
	public static void main(String[] args) {
		
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		
		Scanner sc = new Scanner(System.in);
		
		Integer notaBusca;
		
		Integer contador = 0;
		
		System.out.println("Que nota buscas?");
		
		notaBusca = sc.nextInt();
		

		
		for (int i = 0; i < listaNotas.length; i++) {
			
			if (listaNotas[i] == notaBusca) {
				
				System.out.println("La nota buscada existe y esta en la posicion " + listaNotas[i] );
				contador++;
				
				break;
			}
			
			
			
		}
		
		if (contador == 0) {
			
			System.out.println("La notas que busca no existe.");
		}
		
	}

}
