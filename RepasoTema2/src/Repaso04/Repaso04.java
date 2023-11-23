package Repaso04;

import java.util.Scanner;

public class Repaso04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique el precio de cada unidad.");
		
		Double precio = sc.nextDouble();
		
		System.out.println("Gracias, ahora indique el numero de unidades.");
		
		Double unidades = sc.nextDouble();
		
		Double subtotal =  precio * unidades;
		
		Double descuento;
		
		Double precioDescuento;
		
		if (unidades > 100) {
		
		descuento = (subtotal * 0.4);
		
		precioDescuento = subtotal - descuento;
		
		 System.out.println("El subtotal será " + (precio * unidades));
		 System.out.println("El descuento aplicado será de " + (descuento));
		 System.out.println("El total a pagar es " + precioDescuento);
		}
		else if (unidades >=25 && unidades <=100) {
			
			descuento = (subtotal * 0.2);
			
			precioDescuento = subtotal - descuento;
			
			 System.out.println("El subtotal será " + (precio * unidades));
			 System.out.println("El descuento aplicado será de " + (descuento));
			 System.out.println("El total a pagar es " + precioDescuento);
		 }
		else if (unidades >=10 && unidades <=24) {
			
			descuento = (subtotal * 0.1);
			
			precioDescuento = subtotal - descuento;
			
			 System.out.println("El subtotal será " + (precio * unidades));
			 System.out.println("El descuento aplicado será de " + (descuento));
			 System.out.println("El total a pagar es " + precioDescuento);
		}
		else if (unidades <10) {
			
			descuento = (subtotal * 0);
			
			precioDescuento = subtotal - descuento;
			
			 System.out.println("El subtotal será " + (precio * unidades));
			 System.out.println("El descuento aplicado será de " + (descuento));
			 System.out.println("El total a pagar es " + precioDescuento);
	
		}
		
		sc.close();
	}

}
