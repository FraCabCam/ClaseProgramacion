package Ejercicio45;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio45App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fechaUsuario = "";
		do {
			System.out.println("Introduce tu fecha de nacimiento con el formato dd/mm/yyyy");
			 fechaUsuario = sc.nextLine();
			
			
		} while (!fechaBien(fechaUsuario));
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(fechaUsuario, formato);
		
		Boolean bisiesto = fechaNacimiento.isLeapYear();
		
		if (bisiesto) {
			System.out.println("El año en el que naciste es bisiesto");
		}
		else {
			System.out.println("El año en el que naciste NO es bisiesto");
		}	
		System.out.println("Naciste en la semana: " + fechaNacimiento.getDayOfWeek());
		Period periodo = fechaNacimiento.until(LocalDate.now());
		System.out.println("Tienes " + periodo.getYears() + " años, " + periodo.getMonths() + " meses y " + periodo.getDays() + " días.");
		System.out.println("Te quedan " + (100 - periodo.getYears()) + " años.");
		LocalTime hora = LocalTime.now();
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println("Y de regalo son las: " + formatoHora.format(hora));
		
	
		
	}	

	private static boolean fechaBien(String fechaUsuario) {
		String[] partes = fechaUsuario.split("/");
		if (partes.length !=3) {
			return false;
		}
		Integer dia = Integer.parseInt(partes[0]);
		Integer mes = Integer.parseInt(partes[1]);
		Integer año = Integer.parseInt(partes[2]);
		return (dia < 1 || dia > 31 || mes < 1 || mes < 12 || año < 1 || año > 100);
	}

}
