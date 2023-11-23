package Repaso20;

public class Repaso20 {
	
	public static void main(String[] args) {

		System.out.println();
		for (int fila = 0; fila < 5; fila++) {
			for (int column = 0; column < 5; column++) {

				if (fila == column) {

					System.out.print(" *");

				} else {

					System.out.print(" -");
				}

			}
			System.out.println();
		}
	}

}
