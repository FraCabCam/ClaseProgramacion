	package Repaso04;

import java.util.Scanner;

public class Repaso04 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos alumnos hay en clase?");

		Integer alumno = sc.nextInt();

		Integer[][] nota = new Integer[alumno][3];
		String[] nombre = new String[alumno];

		Integer suma = 0;

		Double mediaIndi = 0.0;

		Double mediaTotal = 0.0;

		for (int i = 0; i < nota.length; i++) {

			System.out.println("Cual es el nombre del alumno " + (i + 1));
			sc.nextLine();
			nombre[i] = sc.nextLine();
			for (int j = 0; j < nota.length; j++) {

				System.out.println("Cual es la nota de " + nombre[i] + " para el examen " + (j+1));
				nota[alumno][j] = sc.nextInt();

				
			}
				
		}
		
		System.out.println("LISTADO DE NOTAS");
		for (int i = 0; i < nota.length; i++) {
			for (int j = 0; j < nota.length; j++) {
				
			}
			suma += nota[i][3];
			mediaIndi = suma / 3.0;
			mediaTotal = (suma /(alumno * 3.0));
			System.out.println("Alumno: " + nombre[i] + " - Nota Media: " + mediaIndi);
			mediaIndi = 0.0;
			
		}
		 System.out.println("Media de los alumnos: " + mediaTotal);
	}


}
