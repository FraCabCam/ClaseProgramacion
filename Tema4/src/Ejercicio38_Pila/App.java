package Ejercicio38_Pila;



public class App {
	
	public static void main(String[] args) {
		PilaCadenas pila = new PilaCadenas();
		
		pila.añadirCadena("Primerito");
		pila.añadirCadena("Segundo");
		System.out.println("Paso 1 " + pila);
		
		pila.sacarCadena();
		System.out.println("Paso 2 " + pila);
		
		pila.añadirCadena("Tercero");
		System.out.println("Paso 3 " + pila);
		
		while (pila.getTamaño() > 0) {
			pila.sacarCadena();
		}
		System.out.println("Paso 4" + pila);
		
		pila.añadirCadena("Cuarto");
		System.out.println("Paso 5" + pila);
	}

}
