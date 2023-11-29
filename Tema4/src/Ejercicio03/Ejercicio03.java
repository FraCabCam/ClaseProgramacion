package Ejercicio03;

import Ejercicio01.Ejercicio01;
import Ejercicio02.Ejercicio02;

public class Ejercicio03 {
	public static void main(String[] args) {
		String cadena = ("VIVA EL VINO O ");
				
		System.out.println(getMayMin(2,cadena));
		
		String cadena2 = ("viva el vino o ");
		System.out.println(getMayMin(1,cadena));
		
		
	}

	public static String getMayMin (Integer num,String cadena) {
		
		if (num == 1 ) {
			String cadenaTrim = Ejercicio01.getMayusculas(cadena);
			return cadenaTrim;
			
		}
		else  if (num == 2){
			String cadenaTrim = Ejercicio02.getMinusculas(cadena);
			return cadenaTrim;
			
		}
		return cadena;
	
	}
}


