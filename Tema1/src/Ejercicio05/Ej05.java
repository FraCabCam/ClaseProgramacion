package Ejercicio05;

public class Ej05 {
	public static void main(String[] args) {

		Integer suma = 0;
		
		Integer numero = 1;

		while (numero <= 10000) {
			
			suma = suma + numero;
			
			numero++;
		}
		
		System.out.println(suma);

	}

}
