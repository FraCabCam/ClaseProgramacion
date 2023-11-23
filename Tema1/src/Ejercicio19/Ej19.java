package Ejercicio19;

import java.util.Scanner;

public class Ej19 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Indique el precio sin IVA del producto. ");
	
	Integer iva = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Indique el IVA del producto; normal, reducido, superreducido o exento. ");
	
	String tipoIva = sc.nextLine().trim();
	

	
	while (!tipoIva.equalsIgnoreCase("normal") && !tipoIva.equalsIgnoreCase("reducido") && !tipoIva.equalsIgnoreCase("superreducido") && !tipoIva.equalsIgnoreCase("exento")) {
		
		System.out.println("El tipo de IVA no es correcto vuelve a introducirlo, recuerda que puede ser normal, reducido, superreducido o exento.");
		
		tipoIva = sc.nextLine().toLowerCase();
	}
	
	switch (tipoIva) {
	
	case "normal":
		System.out.println("El IVA del producto sería " + (iva * 0.21) + "." + " Y el precio con IVA es de " + (iva + (iva * 0.21)));
		break;
	case "reducido":
		System.out.println("El IVA del producto sería " + (iva * 0.10) + "." + " Y el precio con IVA es de " + (iva + (iva * 0.10)));
		break;
	case "superreducido":
		System.out.println("El IVA del producto sería " + (iva * 0.04) + "." + " Y el precio con IVA es de " + (iva + (iva * 0.04)));
		break;
	case "exento":
		System.out.println("El IVA del producto sería " + (iva * 0) + "." + " Y el precio con IVA es de " + (iva));
		break;
	
	}
	sc.close();
	}

}
