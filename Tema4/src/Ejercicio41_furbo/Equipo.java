package Ejercicio41_furbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {
	private String nombreEquipo;
	private Jugador capitan;
	private List<Jugador> jugadores;
	private static String competicion = "Liga CEU";
	
	
	public Equipo(String nombreEquipo) {
		super();
		jugadores = new ArrayList<Jugador>();
		this.nombreEquipo = nombreEquipo;
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Jugador getCapitan() {
		return capitan;
	}

	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreEquipo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombreEquipo, other.nombreEquipo);
	}
	@Override
	public String toString() {
		return nombreEquipo + "- Capitán: " + capitan + "-Jugadores: [" + jugadores + "]";
	}

	public static String getCompeticion() {
		return competicion;
	}

	public static void setCompeticion(String competicion) {
		Equipo.competicion = competicion;
	}
	
	

}
