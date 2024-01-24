package Ejercicio37_Cola;

public class App {
	public static void main(String[] args) {
		ColaCadenas cola = new ColaCadenas();
		
		
		cola.añadirCadena("Primero");
		cola.añadirCadena("Segundo");
		System.out.println(" Paso 2 "  + cola);
		System.out.println(cola.sacarCadena());
		System.out.println(" Paso 3 " + cola);
		cola.añadirCadena("Tercero");
		System.out.println("Paso 4" + cola);
		
		while (cola.getTamaño() > 0) {
			System.out.println(cola.sacarCadena());
		}
		
		System.out.println(" Paso 5" + cola);
		cola.añadirCadena("Cuarto");
		System.out.println("Paso 6" + cola);
		
	}

}
