package Asd;

public class AppGato {
	public static void main(String[] args) {
		Gato bigotitos = new Gato();
		Gato manoplas = new Gato("Manoplas");
		
		bigotitos.setRaza("persa");
		manoplas.setRaza("naranja");
		
		System.out.println(bigotitos.getNombre());
		System.out.println(manoplas.getNombre());
	}
	
}
