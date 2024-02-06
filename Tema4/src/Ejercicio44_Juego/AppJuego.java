package Ejercicio44_Juego;

public class AppJuego {
	public static void main(String[] args) {
		
		EquipoCombate e = new EquipoCombate();
		for (int i = 0; i <= 3; i++) {
			Asesinos a = new Asesinos ("A"+i, "Asesino " + i);
			e.añadirPersonaje(a);
		}
		Jugador jugador1 = new Jugador("ABEL");
		jugador1.setEquipo(e);
	
		
	
	
		System.out.println(jugador1);
		
		Parasitos parasito1 = new Parasitos("pesteboca","ol23");
	}

}
