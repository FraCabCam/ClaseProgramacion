package Ejercicio0059;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Geografia geo1 = new Geografia();
	
	Integer contador = 1;
	while(contador <= 5) {
		System.out.println("Indicame el país numero " + contador);
		String pais = sc.nextLine();
		System.out.println("Dime su capital ");
		String capital = sc.nextLine();
		if(geo1.agregarPais(pais,capital)) {
			System.out.println("Este país ya me lo habias dicho, dime otro.");
		}
		else {
			contador ++;
		}
	}
	geo1.imprimirPaises();
	System.out.println("Promedio letras: ");
	System.out.println("Dime una letra");
	String letra = sc.nextLine();
	System.out.println("Paises que empiezan por la letra " + letra);
	geo1.imprimirNumeroPaisesLetra(letra);
	System.out.println("Paises cuya capital empiezan por la letra " + letra);
	geo1.mismaLetra();
	geo1.eliminarPaisConCapitalLetra(letra);
	System.out.println("Paises con la misma letra tras borrar.");
	geo1.mismaLetra();
	
}
}
