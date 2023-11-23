package Repaso10;

import java.util.Scanner;

public class Repaso10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer dominio;
		
		Integer http;
		
		Integer primerPunto;
		
		String web;
		
		Integer x;
		
		Integer y;
		
		Integer z;
		
		
		do {
			
			System.out.println("Introduzca una dirección web");
			
					web = sc.nextLine();
			
			
			 dominio = web.lastIndexOf(".");
			
			 http = web.indexOf("//");
			
			 primerPunto = web.indexOf(".");
			 
			 x= http;
			 
			 y = primerPunto;
			 
			 z = dominio;
			 
			 // x == - 1 significa que "//"  no existe porque el index of si lo imprimes te devuelve números, y en el caso de que no exista te pone -1 y si existe te pone el número donde está situado y por eso si x == -1  sigue en bucle
		
		} while ((x == - 1) || (y == - 1) || (z == y));
		
		String	 parte1 = web.substring(0 , http );
		
		String	 parte2 = web.substring(http, primerPunto);
		
		String	 parte3 = web.substring(primerPunto, dominio);
		
		String	 parte4 = web.substring(dominio);
			
		System.out.println(parte1 + "\n" + parte2 + "\n" + parte3 + "\n" + parte4);
			
			sc.close();
		
	}

}
