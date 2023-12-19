package Ejercicio09;

public class Main {
	
	public static void main(String[] args) {
		String cadena = "me llamo fran cabrera camino";
		String array [] = cadena.split(" ");
		//Ejercicio01
		System.out.println(ArrayUtils.imprimirArray(array));
		//Ejercicio02
		System.out.println(ArrayUtils.obtenerPalabra(array,0));
		System.out.println(ArrayUtils.obtenerPalabra(array,1));
		System.out.println(ArrayUtils.obtenerPalabra(array,2));
		System.out.println(ArrayUtils.obtenerPalabra(array,3));
		System.out.println(ArrayUtils.obtenerPalabra(array,4));
		System.out.println(ArrayUtils.obtenerPalabra(array,5));
		
		//Ejercicio03
		
		System.out.println(ArrayUtils.buscarPalabra(array,"fran"));
		System.out.println(ArrayUtils.buscarPalabra(array,"camino"));
		System.out.println(ArrayUtils.buscarPalabra(array,"me"));
		System.out.println(ArrayUtils.buscarPalabra(array,"cabrera"));
		System.out.println(ArrayUtils.buscarPalabra(array,"llamo"));
		System.out.println(ArrayUtils.buscarPalabra(array,"patata"));
		
		//Ejercicio 14
		
		ArrayUtils.arrayPalabra(array, 0);
	}

}
