package Ejercicio18_19_20;

import java.util.Scanner;

public class App_profesor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Diga el dni con letra");
		String dni = sc.nextLine();
		
		Profesor profe = new Profesor();
		System.out.println("Ingresa el nombre del Profesor");
		profe.setNombre(sc.nextLine());
		System.out.println("Indique la edad del Profesor");
		profe.setEdad(sc.nextInt());
		
		System.out.println(profe + " DNI: " + dni);
		
	}
}
