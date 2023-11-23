package Ejercicio03;

import java.util.Scanner;

public class Ej03 {
	private static final double IVA_NORMAL = 0.21;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique el precio sin IVA del producto. ");
		
		Double precioSinIva = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Indique el IVA del producto; normal, reducido, superreducido o exento. ");
		
		String tipoIva = sc.nextLine();
		
		if  (tipoIva.equalsIgnoreCase("normal")) { //equalsIgnoreCase pa que le de igual si esta en mayuscula o no 

			
			System.out.println("El IVA del producto sería " + (precioSinIva * IVA_NORMAL) + "." + " Y el precio con IVA es de " + (precioSinIva + (precioSinIva * IVA_NORMAL)));
		}
	    
		else if (tipoIva.equalsIgnoreCase("reducido")) {
			
			System.out.println("El IVA del producto sería " + (precioSinIva * 0.10) + "." + " Y el precio con IVA es de " + (precioSinIva + (precioSinIva * 0.10)));
		}
		
		else if (tipoIva.equalsIgnoreCase("superreducido")) {
			
			System.out.println("El IVA del producto sería " + (precioSinIva * 0.04) + "." + " Y el precio con IVA es de " + (precioSinIva + (precioSinIva * 0.04)));
		}	
		else if (tipoIva.equalsIgnoreCase("exento")) {
			
			System.out.println("El IVA del producto sería " + (precioSinIva * 0) + "." + " Y el precio con IVA es de " + (precioSinIva + (precioSinIva * 0)));
		}
		
		else {
			System.out.println(" El tipo de IVA introducido no es correcto, pruebe de nuevo.");
		sc.close();
		}
	}

}
