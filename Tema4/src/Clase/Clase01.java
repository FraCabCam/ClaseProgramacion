package Clase;

import java.util.Scanner;

public class Clase01 {
	
	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		//pidePalabra
		String nombre = pedirTexto("nombre", Scanner);
		String apellidos =pedirTexto("apellidos",Scanner);
		String ciudad = pedirTexto("ciudad",Scanner);
		
		System.out.println(nombre + ", " + apellidos + ", " + ciudad + ", ");
		
		Scanner.close();
	}
	public static String pedirTexto(String mensaje, Scanner sc) {
		System.out.println("Dame " + mensaje + ":");
		String palabra = sc.nextLine();
		return palabra;
		
	}
}
