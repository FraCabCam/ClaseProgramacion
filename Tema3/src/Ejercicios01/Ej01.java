package Ejercicios01;

public class Ej01 {
	public static void main(String[] args) {

		Integer num[] = new Integer[15];

		Integer contador = 0;

		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				num[contador] = i;
				contador++;

			}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + "\n ");
		}
	}
}
