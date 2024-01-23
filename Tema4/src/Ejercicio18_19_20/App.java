package Ejercicio18_19_20;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dni = "";
		Curso cursoUno = new Curso();
		Boolean dniRepe = false;
		Integer contador = 1;
		
		
		
		
		
		
		for (int i = 0; i < 3; i++) {
			cursoUno.setIdentificador(1);
			cursoUno.setDescripcion("DAM-DAW");
			Alumno alumno = new Alumno(dni);
			alumno.setCurso(cursoUno);
			do {
				dniRepe = false;
				System.out.println("Indica el DNI del alumno" + contador);
				alumno.setDni(sc.nextLine());
				if (!alumno.validarDNI()) {
					System.out.println("Error los datos que has introducido en el DNI no son correctos");
				}
				
			} while (!alumno.validarDNI());
			do {
				System.out.println("Ingresa el nombre del Alumno" + contador + " mínimo 10 caracteres");
				alumno.setNombre(sc.nextLine());
				System.out.println("Indique la edad del Alumno" + contador + " recuerda que debe ser entre 12 y 65 años.");
				alumno.setEdad(sc.nextInt());
				System.out.println("Por último indique la nota del alumno" + contador);
				alumno.setNota(sc.nextInt());
				sc.nextLine();
				if (!alumno.validar()) {
					System.out.println("Error, los datos introducidos son erróneos.");
				}
			} while (!alumno.validar());
			contador++;
			cursoUno.addAlumno(alumno);
		}
			
		if ( cursoUno.getAlumnos().get(0).equals(cursoUno.getAlumnos().get(1))|| cursoUno.getAlumnos().get(0).equals(cursoUno.getAlumnos().get(2))
				|| cursoUno.getAlumnos().get(1).equals(cursoUno.getAlumnos().get(2))) {
			System.out.println("Error los datos introducidos están repetidos.");
		} else {
			for (Alumno alumno : cursoUno.getAlumnos()) {
				System.out.println(cursoUno);
				System.out.println(alumno);
				if (alumno.getNota() < 5) {
					alumno.aprobar();
					System.out.println("La nueva nota es: " + alumno.getNota());
				}
			}
		}
		sc.close();
	}
}
