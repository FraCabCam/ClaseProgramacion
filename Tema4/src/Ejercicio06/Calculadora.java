package Ejercicio06;

public class Calculadora {

	//public static Double sumar(Double numero1, Double numero2) {
		//Double resultado = numero1 + numero2;
		//return resultado;
	//}
	//public static Double restar(Double numero1, Double numero2) {
		//Double resultado = numero1 - numero2;
		//return resultado;
	//}
	//public static Double multiplicar(Double numero1, Double numero2) {
		//Double resultado = numero1 * numero2;
		//return resultado;
	//}
	//public static Double dividir(Double numero1, Double numero2) {
		//Double resultado = numero1 / numero2;
		//return resultado;
	//}
	
	public static Double calcular(String cadena, Double numero1, Double numero2) {
		
		switch(cadena) {
		
		case "ADD":
			Double sumar = numero1 + numero2;
			return sumar;
		case "SUB":
			Double restar = numero1 - numero2;
			return restar;
		case "MUL":
			Double multiplicar = numero1 * numero2;
			return multiplicar;
		case "DIV":
			Double dividir = numero1 / numero2;
			return dividir;
		default:
			return null;
			
		}
		
		
	}
}
