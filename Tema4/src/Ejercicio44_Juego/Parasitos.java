package Ejercicio44_Juego;

public class Parasitos extends Personajes {

	public Parasitos(String nombre, String codigo) {
		super(nombre, codigo, 200, 2, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Parásito:" + getNombre() + " " +vida + "HP " + daño + "DMG " + dps  + "DPS";
	}
	
	
}
