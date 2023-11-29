package Ejercicio05;

import Ejercicio06.Calculadora;

public class Ejercicio05 {
	public static void main(String[] args) {
		Double num1 = 8.0;
		Double num2 = 7.0;
		System.out.println(Calculadora.calcular("ADD",num1, num2));
		System.out.println(Calculadora.calcular("SUB",num1, num2));
		System.out.println(Calculadora.calcular("MUL",num1, num2));
		System.out.println(Calculadora.calcular("DIV",num1, num2));

	}

}
