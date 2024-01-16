package Ejercicio18_19_20;

import java.util.Iterator;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dni = "";
		Alumno ceroUno = new Alumno(dni);
		Alumno ceroDos = new Alumno(dni);
		Alumno ceroTres = new Alumno(dni);
		Curso cursoUno = new Curso(3);
		Boolean dniRepe = false;
		Integer contador = 1;
		
		Alumno[] arrayAlumno = new Alumno[] { ceroUno, ceroDos, ceroTres };
		for (Alumno alumno : arrayAlumno) {
			cursoUno.setIdentificador(1);
			cursoUno.setDescripcion("DAM-DAW");
			alumno.setCurso(cursoUno);
			do {
				dniRepe = false;
				System.out.println("Indica el DNI del alumno" + contador);
				alumno.setDni(sc.nextLine());
				if (!alumno.validarDNI()) {
					System.out.println("Error los datos que has introducido en el DNI no son correctos");
				}
				cursoUno.addAlumno(alumno);
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
		}
		if (arrayAlumno[0].equals(arrayAlumno[1]) || arrayAlumno[0].equals(arrayAlumno[2])
				|| arrayAlumno[1].equals(arrayAlumno[2])) {
			System.out.println("Error los datos introducidos están repetidos.");
		} else {
			for (Alumno alumno : arrayAlumno) {
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
