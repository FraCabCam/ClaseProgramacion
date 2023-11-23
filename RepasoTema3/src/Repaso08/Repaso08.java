package Repaso08;

import java.util.Scanner;

public class Repaso08 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String web = "";
		System.out.println("Escribe tu HTML");
		web = sc.nextLine();
		String[] array = web.split("");
		System.out.println("Texto extraido:");
		for (int i = 0; i < array.length; i++) {
			if (array[i].equalsIgnoreCase("<")) {
				do {
					i++;
				} while (!array[i].equalsIgnoreCase(">"));
			} else {
				System.out.print(array[i]);
			}
		}
		sc.close();
	}

}
