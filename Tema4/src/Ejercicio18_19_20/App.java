package Ejercicio18_19_20;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Diga el dni con letra");
		String dni = sc.nextLine();
		Alumno ceroUno = new Alumno(dni);
		System.out.println("Ingresa el nombre del Alumno");
		ceroUno.setNombre(sc.nextLine());
		System.out.println("Indique la edad del Alumno");
		ceroUno.setEdad(sc.nextInt());
		System.out.println("Por último indique la nota del alumno");
		ceroUno.setNota(sc.nextInt());
		
		System.out.println("El nombre es: " + ceroUno.getNombre() + "\nSu DNI es: " + ceroUno.getDni() + "\nLa edad de " + ceroUno.getNombre() + " es: " + ceroUno.getEdad() + "\nLa nota de " + ceroUno.getNombre() + " es: " + ceroUno.getNota());
		ceroUno.aprobar();
		System.out.println("La nueva nota es: " + ceroUno.getNota());
		
		sc.close();
		}

}
