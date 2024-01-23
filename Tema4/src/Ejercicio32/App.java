package Ejercicio32;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Reloj reloj = new Reloj();
		System.out.println(reloj);
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique la hora,minutos y segundos");
		Integer hora = sc.nextInt();
		Integer minutos = sc.nextInt();
		Integer segundos = sc.nextInt();
		reloj.ponerEnHora(hora, minutos, segundos);
		System.out.println(reloj);
		
		reloj.setFormarto24horas(false);
		System.out.println(reloj);
		
		reloj.ponerEnHora(24, 17);
		System.out.println(reloj);
		
		reloj.ponerEnHora(21, 82);
		System.out.println(reloj);
		
		reloj.ponerEnHora(17, 16, 15);
		System.out.println(reloj);
		
		Reloj clock = new Reloj(17, 16,15);
		System.out.println(clock);
	
		System.out.println(reloj.equals(clock));
		
		sc.close();
	}
	
}
