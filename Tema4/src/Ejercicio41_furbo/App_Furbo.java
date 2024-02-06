package Ejercicio41_furbo;

import java.util.Scanner;

public class App_Furbo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Equipo Team1 = crearEquipo(sc, "LOCAL");
		Equipo Team2 = crearEquipo(sc, "VISITANTE");
		
		System.out.println(Team1);
		System.out.println(Team2);
		
		Partido partido = new Partido();
		partido.setEquipolocal(Team1);
		partido.setEquipoVisitante(Team2);
		Resultado resultado = new Resultado();
		partido.setResultado(resultado);
		
		System.out.println("Dime el resultado (goles locales)");
		Integer golesL = sc.nextInt();
		System.out.println("Dime el resultado (goles visitantes)");
		Integer golesV = sc.nextInt();
		resultado.setGolesLocales(golesL);
		partido.getResultado().setGolesVisitantes(golesV);
		System.out.println(partido);
		
		System.out.println("Equipo ganador");
		System.out.println(partido.getEquipoGanador());
		
		
		Jugador infiltrado = new Jugador("Jugador infiltrado", 69);
		Team2.getJugadores().add(infiltrado);
		System.out.println(Team2);
		
		Jugador ultimo = Team1.getJugadores().get(Team1.getJugadores().size() -1);
		Team1.setCapitan(ultimo);
		System.out.println(Team1);
		
		Equipo.setCompeticion("Liga Nacional");
		
		System.out.println("Competición visitante: " + Equipo.getCompeticion());
		sc.close();

	}
	

	private static Equipo crearEquipo(Scanner sc,String tipoEquipo) {
		System.out.println("Dime el primer equipo " + tipoEquipo);
		Equipo e = new Equipo(sc.nextLine());
		for (int i = 1; i <= 3; i++) {
			System.out.println("Dime el nombre del jugador " + i);
			String nombre = sc.nextLine();
			System.out.println("Dime el dorsal del jugador " + i);
			Integer dorsal = sc.nextInt();
			sc.nextLine();
			Jugador Team1uno = new Jugador(nombre, dorsal);
			e.getJugadores().add(Team1uno);
			if (i == 1) {
				e.setCapitan(Team1uno);
			}
			
		}
		return e;
	}
	
	
}
