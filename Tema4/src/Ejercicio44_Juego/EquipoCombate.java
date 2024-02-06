package Ejercicio44_Juego;


import java.util.ArrayList;
import java.util.List;

import Ejercicio43_Peliculas.Actores;

public class EquipoCombate {
	private List<Personajes> equipo;
	
	public List<Personajes> getPersonajes() {
		return equipo;
	}
	
	public Integer puntosVida() {
		Integer vida = 0;
		for (int i = 0; i < equipo.size(); i++) {
			vida += equipo.get(i).getVida();
			
		}
		return vida;
	}
	public void setPersonajes(List<Personajes> personajes) {
		this.equipo = personajes;
	}

	public EquipoCombate() {
		equipo = new ArrayList <Personajes>();
	}

	public void añadirPersonaje(Personajes personaje) {
		if (equipo.size() == 5) {
			System.out.println("El equipo no puede tener mas de 5 personajes");
		}
		if(equipo.contains(personaje)) {
			System.out.println("En el equipo no puede haber 2 personajes iguales");
		}
		
		equipo.add(personaje);
	}

	@Override
	public String toString() {
		return " Equipo: " + equipo + puntosVida();
	}
	
	
}
