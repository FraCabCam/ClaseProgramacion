package Ejercicio43_Peliculas;

import java.util.ArrayList;
import java.util.List;

public class Peliculas {
	private Integer añoEstreno;
	private String titulo;
	private List<Actores> actores;
	private Guionistas guionista;
	private Directores director;
	
	public Peliculas() {
		actores = new ArrayList<Actores>();
	}
	public Integer getAñoEstreno() {
		return añoEstreno;
	}
	public void setAñoEstreno(Integer añoEstreno) {
		this.añoEstreno = añoEstreno;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Actores> getActores() {
		return actores;
	}
	public void setActores(List<Actores> actores) {
		this.actores = actores;
	}
	public Guionistas getGuionista() {
		return guionista;
	}
	public void setGuionista(Guionistas guionista) {
		this.guionista = guionista;
	}
	public Directores getDirector() {
		return director;
	}
	public void setDirector(Directores director) {
		this.director = director;
	}
	
	

}
