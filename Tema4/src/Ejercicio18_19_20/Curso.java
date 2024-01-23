package Ejercicio18_19_20;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private Integer identificador;
	private String descripcion;
	private List<Alumno> alumnos;
	
	
	
	public Curso() {
		alumnos = new ArrayList<>();
	}
	public void addAlumno(Alumno alumnoNuevo) {
		alumnos.add(alumnoNuevo);
	}
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Cargando alumno del curso " + identificador + descripcion + "...";
	}
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
}
