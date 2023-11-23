package Repaso02;

public class Repaso02 {
	public static void main(String[] args) {

		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };

		Integer suma = 0;
		Integer contador = 0;

		for (int i = 0; i < listaNotas.length; i++) {

			if (listaNotas[i] >= 5) {
				contador++;
				suma += listaNotas[i];
			}

		}

		System.out.println("La nota media de los aprobados es de: " + (suma / contador) + ".");
	}

}
