package Ejercicio44_Juego;

public class Asesinos extends Personajes{

	public Asesinos(String nombre, String codigo) {
		super(nombre, codigo, 100, 10, 5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Asesino:" + getNombre() + " " +vida + "HP " + daño + "DMG " + dps  + "DPS";
	}

	
	
	
	

}
